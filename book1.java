/* Create a class
Book which contains four members: name, author, price, num_pages. Include a
constructor to set the values for the members. Include methods to set and get
the details of the objects. Include a toString( ) method that could display
the complete details of the book. Develop a Java program to create n book
objects.*/


import java.util.*;

class book {
    String name; 
    String author;
    double price;
    int num_pages;

    book(){
    }

    book(String name, String author, double price, int num_pages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;
    }

    void accept(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of book");
        name = in.nextLine();
        System.out.println("Enter author of book");
        author=in.nextLine();
        System.out.println("Enter price of book");
        price=in.nextDouble();
        System.out.println("Enter pages of book");
        num_pages=in.nextInt();
    }

    public String toString()
    {
        return("\nname: "+name+"\nauthor: "+author+"\nprice: "+price+ "\npages: "+num_pages);
    }
}

class book1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        book b1 = new book ("Height","Anne",299,345);
        System.out.println("Constructor values are: "+b1);
        System.out.println("Enter number of books");
        int n = in.nextInt();
        book b[] = new book[n];
        for(int i=0;i<n;i++){
            b[i]=new book();
            System.out.println("Enter the details of the "+(i+1)+ "book");
            b[i].accept();
        }
        for(int i=0;i<n;i++){
            System.out.println("Details of the book "+(i+1));
            System.out.println(b[i]);
        }

    }
}
