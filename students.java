/*Develop a Java
program to create a class Student with members usn, name, an array credits
and an array marks. Include methods to accept and display details and a
method to calculate SGPA of a student. 
*/

import java.util.*;
class student {
    String usn, name;
    int credits [], marks[];
    int no_subs;
    double sgpa = 0.0;
    Scanner in = new Scanner(System.in);

    void accept()
    {
        System.out.println("Enter name");
        name=in.nextLine();
        System.out.println("Enter USN");
        usn=in.nextLine();
        System.out.println("Enter number of subjects");
        no_subs=in.nextInt();
        credits = new int[no_subs];
        marks = new int[no_subs];
        for(int i=0;i<no_subs;i++){
            System.out.println("Enter subject "+(i+1)+" credits");
            credits[i]=in.nextInt();
            System.out.println("Enter subject "+(i+1)+" marks");
            marks[i]=in.nextInt();
        }
    }

    double calc()
    {
        int x = 0, gp=0, ind_mark=0, sum_credits = 0;
        for (int i = 0; i<no_subs; i++){
            x = marks[i];
            if (x>90){
                gp = 10;
            } else if (x>80 && x<=90) {
                gp = 9;
            } else if (x>70 && x<=80) {
                gp = 8;
            } else if (x>60 && x<=70) {
                gp = 7;
            } else if (x>50 && x<= 60) {
                gp = 6;
            } else if (x>40 && x<=50) {
                gp = 5;
            } else {
                System.out.println("Failed in subject "+(i+1));
                gp = 0;
            }
            System.out.println("SUB"+(i+1)+"gp = "+gp); 
            ind_mark = credits[i]*gp;
            sgpa = sgpa+ind_mark;
            sum_credits = sum_credits+credits[i];
        }
        sgpa = sgpa/sum_credits;
        return sgpa;
    }
    public static void main(String args[]){
        student ob = new student();
        System.out.println("input marks");
        ob.accept();
        System.out.println("SGPA="+ob.calc());
        }

}
