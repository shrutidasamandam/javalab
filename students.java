import java.util.Scanner;
class Studentfinal{
    String USN, name;
    int credits[], marks[];
    int no_subs;
    double sgpa=0.0;
    Scanner in = new Scanner(System.in);

    void accept(){
        // System.out.println("Enter name : ");
        // name = in.nextLine();
        // System.out.println("Enter USN  : ");
        // USN = in.nextLine(); 
        System.out.println("Enter number of subjects : ");
        no_subs = in.nextInt();
        credits = new int[no_subs];
        marks = new int[no_subs];
        for(int i=0;i<no_subs;i++){
            System.out.format("Enter sub[%d] credits : ",(i+1));
            credits[i]=in.nextInt();
            System.out.format("Enter sub[%d] marks : ",(i+1));
            marks[i] = in.nextInt();
        }
    }
    double calc(){
        int x=0, gp=0,ind_mark=0,sum_credits=0;
        for(int i=0;i<no_subs;i++){
            x = marks[i];
            if(x>90)
                {gp=10;}
            else if(x>80 && x<=90)
                {gp=9;}
            else if(x>70 && x<=80)
                {gp=8;}
            else if(x>60 && x<=70)
                {gp=7;}
            else if(x>50 && x<=60)
                {gp=6;}
            else if(x>40 && x<=50)
                {gp=5;}
            else{
                System.out.format("Failed in sub[%d]",i+1);
                gp=0;
            }
            System.out.format("SUB[%d] gp = %d\n",i+1,gp);
            ind_mark=credits[i]*gp;
            sgpa += ind_mark;
            sum_credits+=credits[i];
        }//for loop
        // System.out.println("SGPA BEFORE DIV = "+sgpa);
        // System.out.println("NO SUBS = "+no_subs);
        sgpa=sgpa/sum_credits;
        return sgpa;
    }
    public static void main(String args[]){
        Studentfinal ob = new Studentfinal();
        System.out.println("INPUT MARKS : \n");
        ob.accept();
        System.out.println("SGPA = "+ob.calc());
    }
}
