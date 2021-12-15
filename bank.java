/* Develop
a Java program to create a class Bank that maintains two kinds of account for
its customers, one called savings account and the other current account. The
savings account provides compound interest and withdrawal facilities but no
cheque book facility. The current account provides cheque book facility but
no interest. Current account holders should also maintain a minimum balance
and if the balance falls below this level, a service charge is imposed.

Create a class
Account that stores customer name, account number and type of account. From
this derive the classes Curr-acct and Sav-acct to make them more specific to
their requirements. Include the necessary methods in order to achieve the
following tasks:

a)      Accept
deposit from customer and update the balance.

b)      Display
the balance.

c)      Compute
and deposit interest

d)     Permit
withdrawal and update the balance

Check for the minimum balance, impose
penalty if necessary and update the balance.

*/

import java.util.*;

class Bank{
    String name;
    int acc_no;
    double bal,ci;

    void accept(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of account holder: ");
        name = in.nextLine();
        System.out.println("Enter account number: ");
        acc_no = in.nextInt();
        System.out.println("Enter account balance: ");
        bal = in.nextDouble();
    }

    void display()
    {
        System.out.println("--Details--");
        System.out.println("\nName: "+name+"\nAccount number: "+acc_no+"\nAccount balance: "+bal);
    }

    void deposit()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Do you want to deposit 1.yes 2.no");
        int d = in.nextInt();
        if(d==1){
            System.out.println("Enter amount to be deposited");
            double amt = in.nextDouble();
            bal=bal+amt;
            System.out.println("available balance is: "+bal);
        } else {
            System.out.println("Thank you for your services");
        }
    }
}

class Current extends Bank{
    double service_charge = 100;
    void cheque()
    {
        System.out.println("Check service is available");
    }
    
    void withdrawal()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Minimum balance = rs 10000");
        System.out.println("Enter amount to be withdrawn");
        double amount = in.nextDouble();
        if(amount>bal)
        {
            System.out.println("Balance insufficient");
        } else {
            bal=bal-amount;
        }
        if(bal<10000){
            bal = bal - service_charge;
            System.out.println("service charge is added: "+service_charge);
            System.out.println("available balance is: "+bal);
        }
    }
}

class Savings extends Bank
{
    void cheque(){
        System.out.println("check services unavailable");
    }

    void compound_interest()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rate of interest");
        int r = in.nextInt();
        System.out.println("Enter number of times interest is applied");
        int n = in.nextInt();
        System.out.println("Enter time");
        int t = in.nextInt();
        ci = bal*(1+(r/n));
        // si = bal*(1+(r*t))
        System.out.println("compound interest is: "+Math.pow(ci,n*t));
    }

    void withdrawal()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("no min balance required");
        System.out.println("enter amount to be withdrawn");
        double amount = in.nextDouble();
        if(amount>bal)
        {
            System.out.println("balance insufficient");
        } else {
            bal = bal-amount;
            System.out.println("Withdrawal: "+amount);
            System.out.println("Available balance is "+bal);
        }
    }
}

public class main 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Savings ob1 = new Savings();
        Current ob2 = new Current();
        System.out.println("Enter 1.Savings or 2.current");
        int ch = in.nextInt();
        switch(ch)
        {
            case 1: 
            ob1.accept();
            ob1.display();
            ob1.cheque();
            ob1.deposit();
            ob1.compound_interest();
            ob1.withdrawal();
            break;
            case 2:
            ob2.accept();
            ob2.display();
            ob2.cheque();
            ob2.deposit();
            ob2.withdrawal();
        }
    }
}
