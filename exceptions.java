/*Create a base class called “Father” and derived class called “Son” 
which extends the base class. */

import java.util.Scanner;

/* In Father class, implement a constructor which takes the age and
 throws the exception Wrong Age( ) when the input age<0. */

class Father{
    public int age1;
    Scanner in = new Scanner(System.in);

    Father()
    {
        System.out.println("Enter Fathers age: ");
        age1 = in.nextInt();
    }

    void ex1() throws fatherAgeException
    {
        if(age1<0)
        {
            throw new fatherAgeException();
        }
    }
}

/*In Son class, implement a constructor that cases both father and son’s
age and throws an exception if son’s age is >=father’s age.*/

class Son extends Father{
    public int age2;

    Son()
    {
        System.out.println("Enter Sons age: ");
        age2 = in.nextInt();
    }

    void ex2() throws sonAgeException
    {
        if(age2<0 || age2>super.age1)
        {
            throw new sonAgeException(age2);
        }
    }
}
// exceptions
class fatherAgeException extends Exception{
    public String toString()
    {
        return("Father's age is less than 0");
    }
}

class sonAgeException extends Exception{
    int a;

    sonAgeException(int age)
    {
        a = age;
    }

    public String toString()
    {
        if (a<0)
        {
            return("Son's age is less than 0");
        } else {
            return("Son's age is more than father's age");
        }
    }
}

//main 
class prac{
    public static void main(String args[])
    {
        Son s = new Son();
        try {
            s.ex1();
        } catch (fatherAgeException e) {
            System.out.println(e);
        } try {
            s.ex2();
        } catch (sonAgeException e) {
            System.out.println(e);
        }
    }
}
