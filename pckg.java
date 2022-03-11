/* Create a package CIE which has two classes- Student and Internals. 
The class Personal has members like usn, name, sem. The class internals 
has an array that stores the internal marks scored in five courses of the 
current semester of the student. */

package CIE; 
import java.util.Scanner;

public class Personal{
    Scanner in = new Scanner(System.in);
    public String usn, name;
    public int sem;
    
    public void accept()
    {
        System.out.println("Enter USN");
        usn = in.nextLine();
        System.out.println("Enter Name");
        name = in.nextLine();
        System.out.println("Enter Sem");
        sem = in.nextInt();
    }
    
    public void display()
    {
        System.out.println("Name: "+name+" USN: "+usn+" Sem: "+sem);
    }
}


package CIE;
import java.util.Scanner;

public class Internals extends CIE.Personal
{
    Scanner in = new Scanner(System.in);
    public int ciem[] = new int [5];
    
    public void accept()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter CIE marks of subject "+(i+1));
            ciem[i]=in.nextInt();
        }
    }
}


/*Create another package SEE which has the class External which is a derived 
class of Student. This class has an array that stores the SEE marks scored in 
five courses of the current semester of the student*/

import CIE.*;
package SEE;
import java.util.Scanner;

public class External extends CIE.student{
    Scanner in = new Scanner(System.in);
    public int seem[] = new int[5];
    
    public void accept()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter SEE marks of subject "+(i+1));
            seem[i] = in.nextInt();
        }
    }
}

/*Import the two packages in a file that declares the final marks of
n students in all five courses*/

import CIE.*;
import SEE.*;
import java.util.Scanner;

class TotalMarks{
    public static void main(String args[])
    {
        int i,j,n;
        Scanner in = new Scanner(System.in);
        int total[] = new int [5];
        System.out.println("Enter number of students");
        n = in.nextInt();
        
        CIE.Personal s[] = new CIE.Personal[n];
        CIE.Internals ci[] = new CIE.Internals[n];
        SEE.Externals se[] = new SEE.Externals[n];
        
        for(i=0; i<n; i++)
        {
            System.out.println("Enter Student "+(i+1)+" details");
            s[i] = new CIE.Student();
            s[i].accept();
            ci[i] = new CIE.Internals();
            ci[i].accept();
            se[i] = new SEE.Externals();
            se[i].accept();
        }
        
        for(i=0; i<n; i++)
        {
            System.out.println("Details of student "+(i+1));
            s[i].display();
            for(j=0; j<5; j++)
            {
                total[j] = ci[i].ciem[j]+se[i].seem[j];
                System.out.println("Total marks in subject "+(j+1)+": "+total[j]);
            }
            System.out.println();
        }
    }
}
