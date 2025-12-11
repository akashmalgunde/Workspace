import java.util.*;

class Book
{
    int ISBN;
    String BName;
    String Author;
    String Category;
    double Price;

	Book()
	{
		this.ISBN = 1214;
		this.BName = "B1";
		this.Author = "A1";
		this.Category = "C1";
		this.Price = 250;
	}

    public Book(int isbn,String bname,String author,String category,double dprice)
	{
		this.ISBN = isbn;
		this.BName = bname;
		this.Author = author;
		this.Category = category;
		this.Price = dprice; 
	}

	void setISBN(int isbn)	
	{
		this.ISBN = isbn;
	}

	void setBookName(String bname)	
	{
		this.BName= bname;
	}
	
	void setAuthor(String author)
	{
		this.Author = author;
	}

	void setCategory(String category)
	{
		this.Category = category;
	}

	void setPrice(double price)
	{
		this.Price = price;
	}

	int getISBN()
	{
		return this.ISBN;
	}
	
	String getBookName()
	{
		return this.BName;
	}

	String getAuthor()
	{
		return this.Author;
	}

	String getCategory()
	{
		return this.Category;
	}

	double getPrice()
	{
		return this.Price;
	}

    void Display()
    {
        System.out.println("Product ID of the Book is : "+this.ISBN);
        System.out.println("Name of the Book is : "+this.BName);
        System.out.println("Quantity of Book is :"+this.Author);
        System.out.println("Category of Book is : "+this.Category);
        System.out.println("Price of the book is : "+this.Price);
    }
}

class TestBook
{
    public static void main(String args[])
    {
        Book B = new Book();

       B.Display();

       Book b1 = new Book(9874,"B2","A2","C2",256);

       b1.Display();

	int isbn = 0;
	String bname = "\0";
	String author = "\0";
	String category = "\0";
	double price = 0;

	Scanner sobj = new Scanner(System.in);

	System.out.println("enter isbn");
	isbn = sobj.nextInt();
	
	sobj.nextLine();
	System.out.println("enter bname");
	bname = sobj.nextLine();

	System.out.println("enter author");
	author = sobj.nextLine();

	System.out.println("enter category");
	category = sobj.nextLine();

	System.out.println("Enter price");
	price = sobj.nextDouble();

	Book bobj2 = new Book(isbn,bname,author,category,price);	
	bobj2.Display();

    }
} 
 