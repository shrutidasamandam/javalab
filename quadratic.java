import java.util.*;

public class quadratic {
    public static void main(String args[]){
       double a,b,c;
       double r1,r2;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter value of a");
       a=in.nextDouble();
       System.out.println("Enter value of b");
       b=in.nextDouble();
       System.out.println("Enter value of c");
       c=in.nextDouble();
       double d = ((b*b)-(4*a*c));

       if(d>0)
       {
           r1 = ((-b+Math.sqrt(d))/(2*a));
           r2 = ((-b-Math.sqrt(d))/(2*a));
           System.out.println("Root 1 is "+r1);
           System.out.println("Root 2 is "+r2);
       } else if (d==0) {
           r1=r2=(-b/(2*a));
           System.out.println("Root 1 is "+r1);
           System.out.println("Root 2 is "+r2);
       } else {
           System.out.println("roots are imaginary");
       }

    }
}
