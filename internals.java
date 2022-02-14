
package CIE;
import java.util.Scanner;

public class Student 
{
    Scanner in = new Scanner(System.in);
    public String usn,name;
    public int sem;

    public void accept()
    {
        System.out.println("Enter usn");
        usn=in.next();
        System.out.println("Enter name");
        name=in.nextLine();
        System.out.println("Enter sem");
        sem=in.nextInt();
    }

    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("USN: "+usn);
        System.out.println("Sem: "+sem);
    }
}





package CIE;
import java.util.Scanner;

public class Internals extends CIE.Student
{
    Scanner in = new Scanner(System.in);
    public int ciem[]=new int[5];
    
    public void accept()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter CIE marks of subject "+(i+1));
            ciem[i]=in.nextInt();
        }
    }
}





package SEE;
import CIE.*;
import java.util.Scanner;

public class Externals extends CIE.Student
{
    Scanner in = new Scanner(System.in);
    public int seem[] = new int [5];

    public void accept()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter SEE marks of subject "+(i+1));
            seem[i]=in.nextInt();
        }
    }
}






import CIE.*;
import SEE.*;
import java.util.Scanner;

class totalMarks
{
    public static void main(String args[]){
        int i,j,n;
        Scanner in = new Scanner(System.in);
        int total = new int [5];
        System.out.println("Enter number of students");
        n=in.nextInt();
        CIE.Student s[] = new CIE.Student[n];
        CIE.Internals ci[]= new CIE.Internals[n];
        SEE.Externals se[]= new SEE.Externals[n];
        for(i=0; i<n; i++)
        {
            System.out.println("Enter student "+(i+1)+"details");
            s[i]=new CIE.Student();
            s[i].accept();
            ci[i]= new CIE.Internals();
            ci[i].accept();
            se[i]=new SEE.Externals();
            se[i].accept();
        }
        for(i=0; i<n; i++){
            System.out.println("Details of student "+(i+1));
            s[i].display();
            for(j=0; j<5; j++){
                total[j]=ci[i].ciem[j]+se[i].seem[j];
                System.out.println("Total marks of subject "+(j+1)+" is: "+total[j]);
            }
        }
    }
}
