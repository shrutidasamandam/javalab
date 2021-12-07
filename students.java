import java.util.Scanner;

// class student with members, usn, name, array credits, & array marks
class student{
    String usn;
    String name;
    int n;
    double SGPA = 0;
    int totalcredits = 0;
    int credits[];
    double marks[];
    Scanner in = new Scanner(System.in);
// accept method
void accept(){
    System.out.println("\n enter name of the student");
    name=in.nextLine();
    System.out.println("\n enter usn of the student");
    usn=in.nextLine();
    System.out.println("\n enter num of the subjects");
    n=in.nextInt();
    credits = new int[n];
    marks = new double[n];
    System.out.println("\n enter details of the subject");
    for(int i =0; i<n;i++){
        System.out.println("\n enter credits of subject "+(i+1));
        credits[i]=in.nextInt();
        System.out.println("\n enter marks for subject "+(i+1));
        marks[i]=in.nextDouble();
        calculate(credits[i],marks[i],i);
    }
}
// calculate SGPA
void calculate(int credits, double marks, int j){
    totalcredits=totalcredits+credits;
    if(marks>=90 && marks<=100){
        SGPA=SGPA+(10*credits);
    } else if(marks>=80 && marks<=90){
        SGPA=SGPA+(9*credits);
    } else if(marks>=70 && marks<=80){
        SGPA=SGPA+(8*credits);
    } else if(marks>=60 && marks<=70){
        SGPA=SGPA+(7*credits);
    } else if(marks>=50 && marks<=60){
        SGPA=SGPA+(6*credits);
    } else if(marks>=40 && marks<=50){
        SGPA=SGPA+(5*credits);
    } else {
        System.out.println("Failed in subject "+(j+1));
    }
}
//display
void display(){
    System.out.println("details of the student: ");
    System.out.println("USN:"+usn);
    System.out.println("Name:"+name);
    System.out.println("SGPA:"+totalcredits);
}
}
class students{
    public static void main(String args[]){
        student s1=new student();
        s1.accept();
        s1.display();
    }
}
