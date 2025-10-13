import java.util.Scanner; 
class Book{
    String name;
    String author;
    double price;
    int page_num;
    
    Book( String name,String author,double price,int page_num){
        this.name = name;
        this.author=author;
        this.page_num=page_num;
        this.price=price;
    }
    public void setdetails(String name,String author,double price,int page_num){
        this.name = name;
        this.author=author;
        this.page_num=page_num;
        this.price=price;
    }
    public String getname(String name){
        return name;
    }
     public String getauthor(String author){
        return author;
    }
     public double getprice(double price){
        return price;
    }
    public int getpage_num(int page_num){
        return page_num;
    }
    @Override
    public String toString (){
        return "BOOK DETAILS"+"\nNAME:"+name+"\nAUTHOR:"+author+"\nPRICE:"+price+"\nPAGE NO.S:"+page_num;
    }
}
public class lab3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of books");
        int n=sc.nextInt();
        int i;
        Book[] book= new Book[n];
        for(i=0;i<n;i++){
           
            System.out.println("\nEnter details of Book " + (i + 1) + ":");
            sc.nextLine();
            System.out.print("Enter book name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter author name: ");
            String author = sc.nextLine();
            sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter number of pages: ");
            int page_num = sc.nextInt();
            sc.nextLine();
        
            book[i]=new Book(name,author,price,page_num);
        }
        System.out.println("the book details using toString");
        for(i=0;i<n;i++){
            String details= book[i].toString();
            
            System.out.println(details);
        }
        
    }
}