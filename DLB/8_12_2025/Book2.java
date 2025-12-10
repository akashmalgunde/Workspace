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
    }
} 
 