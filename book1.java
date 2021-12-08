import java.util.Scanner;
class book{
    String name;
    String author;
    double price;
    int num_pages;
    book(){
    }
    book(String name, String author, int price, int num_pages){
        this.name=name;
        this.num_pages = num_pages;
        this.author = author;
        this.price = price;
    }

    void accept(){
        Scanner in = new Scanner (System.in);
        System.out.println("\nEnter name of the book");
        name=in.nextLine();
        System.out.println("\nEnter author of the book");
        author=in.nextLine();
        System.out.println("\nEnter price of the book");
        price=in.nextDouble();
        System.out.println("\nEnter number of pages of the book");
        num_pages=in.nextInt();

    }

    public String toString()
    {
        return("\nname: " +name+ "\nauthor: " +author+ "\nprice: " +price+ "\nnumber of pages: " +num_pages);

    }
}

class book1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        book b1 = new book("Height","Anne",299,345);
        System.out.println("\nconstructor values: "+b1);
        System.out.println("\nenter number of books");
        int n = in.nextInt();
        book b[] = new book[n];
        for(int i=0;i<n;i++){
            b[i]=new book();
            System.out.println("\nenter the details of the "+(i+1)+ "book");
            b[i].accept();
        }
        for(int i=0;i<n;i++){
            System.out.println("\ndetails of the book"+(i+1));
            System.out.println(b[i]);
        }
    }
}
