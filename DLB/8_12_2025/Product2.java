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
}

class TestProduct
{
    public static void main(String args[])
    {
        Product p = new Product();

       p.Display();

	Product p1 = new Product(1,"brush",25);

       p1.Display();
    }
} 
 