import java.util.*;
public class quadratic{
    public static void main(String args[]){
        float a,b,c;
        float root1, root2;
        Scanner in = new Scanner(System.in);
        System.out.println("\nValue of a");
        a=in.nextInt();
        System.out.println("\nValue of b");
        b=in.nextInt();
        System.out.println("\nValue of c");
        c=in.nextInt();
        float d = ((b*b)-(4*a*c));

        if(d>0){
            root1=((-b+(float)Math.sqrt(d))/(2*a));
            root2=((-b-(float)Math.sqrt(d))/(2*a));
            System.out.println("\nRoot 1 is: "+root1);
            System.out.println("\nRoot 2 is: "+root2);
        } else if (d==0){
            root1=((-b+(float)Math.sqrt(d))/(2*a));
            System.out.println("\nRoot 1 is: "+root1);
            System.out.println("\nRoot 1 is: "+root1);
        } else {
            System.out.println("Roots are imaginary");
        }
    }
}


