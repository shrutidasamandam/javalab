import java.util.Scanner;
class multiple<T,V>
{
    T ob1;
    V ob2;
   
    multiple(T o1, V o2)
    {
        ob1 = o1;
        ob2 = o2;
    }
   
    void showTypes()
    {
        System.out.println("Type of first: "+ob1.getClass().getName());
        System.out.println("Type of second: "+ob2.getClass().getName());
    }
   
    T getob1()
    {
        return ob1;
    }
   
    V getob2 ()
    {
        return ob2;
    }
}

class generics{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter any string: ");
        String s = in.nextLine();
        System.out.println("Enter any integer");
        int i = in.nextInt();
        System.out.println("Enter any string: ");
        String st= in.next();
        System.out.println("Enter any double: ");
        double d = in.nextDouble();
       
        multiple<String, Integer> tgObj = new multiple<String,Integer>(s,i);
        tgObj.showTypes();
       
        String str = tgObj.getob1();
        System.out.println("Value of set 1: " +str);
        int v = tgObj.getob2();
        System.out.println("Value of set 1: " +v);


  multiple<String, Double>tObj = new multiple<String,Double>(st,d);
        tObj.showTypes();
       
        String strn= tObj.getob1();
        System.out.println("Value of set 2:" +strn);
        double vd = tObj.getob2();
        System.out.println("Value of set 2:" +vd);
       
    }
}
