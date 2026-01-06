
class Test1 
{
	public static void main(String args[])
	{
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			if(b >= 0 && b <= 9)
				throw new NumberFormatException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("second arg is 0 pllease enter the arg other than 0");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("second arg should be number");
		}
		/*catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("second arg not provided for the array");
		}*/
		catch(RuntimeException e)
		{
			System.out.println("oops something went wrong before exception e");
		}
		catch(Exception e)
		{
			System.out.println("oops something went wrong");
		}
		finally
		{
			System.out.println("some imp code");
		}
	}

}
