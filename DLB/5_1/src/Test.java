
public class Test 
{
	public static void main(String args[])
	{
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			int c = a / b;
		}
		//try ends here
		catch(NumberFormatException nobj)
		{
			System.out.println("input should be number");
		}
		catch(ArithmeticException aobj)
		{
			System.out.println("Second number should be 0");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Minimum two arguments de re gadhe");
		}catch(RuntimeException e)
		{
			System.out.println("Something went wrong");
		}
		
		
	}
	

}
