import java.util.Scanner;

class Product
{
    int PId;
    String Name;
    int Quantity;

    Product()
    {
        this.PId = 1;
        this.Name = "S1";
        this.Quantity = 20;
    }

	public Product(int pid,String name,int quant)
	{
		this.PId = pid;
		this.Name = name;
		this.Quantity = quant;
	}

    void Display()
    {
        System.out.println("Product ID of the Product is : "+this.PId);
        System.out.println("Name of the product is : "+this.Name);
        System.out.println("Quantity of product is :"+this.Quantity);
    }

	int getPID()
	{return this.PId;}
	
	String getName()
	{return this.Name;}

	int getQuantity()
	{return this.Quantity;}

	void setPID(int pid)
	{this.PId = pid;}

	void setName(String Name)
	{this.Name = Name;}
	
	void setQuantity(int Quantity)
	{this.Quantity = Quantity;}
	
	}

class TestProduct
{
    public static void main(String args[])
    {

	int pid = 0;
	String name = "\0";
	int quantity = 0;

	Scanner sobj = new Scanner(System.in);

        Product p = new Product();

       p.Display();

	Product p1 = new Product(1,"brush",25);

       p1.Display();

	System.out.println("Enter product id:");
	pid = sobj.nextInt();
	sobj.nextLine();

	System.out.println("Enter the product name:");
	name = sobj.nextLine();

	System.out.println("Enter the quanity:");
	quantity = sobj.nextInt();

	Product p2 = new Product(pid,name,quantity);
	
	p2.Display();

    }
} 
 