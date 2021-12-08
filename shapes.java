import java.util.Scanner;
abstract class shape{
    double a,b;
    abstract void printArea();
}
class rectangle extends shape{
    void getdata(double x, double y){
        a=x;
        b=y;
    }
    void printArea(){
        System.out.println("\nArea of rectangle= "+(a*b));
    }
}
class triangle extends shape{
    void getdata(double x, double y){
        a=x;
        b=y;
    }
    void printArea(){
        System.out.println("\nArea of triangle= "+(0.5*a*b));
    }
}
class circle extends shape{
    void getdata(double x){
        a=x;
    }
    void printArea(){
        System.out.println("\nArea of circle= "+(3.14*a*a));
    }
}
public class shapes{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int ch;
        shape si;
        rectangle r = new rectangle();
        triangle t = new triangle();
        circle c = new circle();
        System.out.println("\nEnter your choice: \n 1.Rectangle \n 2.Triangle \n 3. Circle");
        ch = in.nextInt();
        switch(ch)
        {
            case 1: System.out.println("\nEnter length and breadth ");
                    double l = in.nextDouble();
                    double b = in.nextDouble();
                    r.getdata(l, b);
                    r.printArea();
                    break;
            case 2: System.out.println("\nEnter base and height ");
                    double b1 = in.nextDouble();
                    double h = in.nextDouble();
                    t.getdata(b1, h);
                    t.printArea();
                    break;
            case 3: System.out.println("\nEnter radius");
                    double r1=in.nextDouble();
                    c.getdata(r1);
                    c.printArea();
                    break;
            default: System.out.println("\nInvalid Input");
              
  

        }

    }
}
