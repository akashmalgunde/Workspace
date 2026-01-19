package p1;

public class MyKey implements Comparable
{
	int myKey;
	
	public MyKey(int iKey)
	{
		this.myKey = iKey;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		MyKey m = (MyKey)o;
		return this.myKey - m.myKey ;
	}

	@Override
	public String toString() {
		return "\n" + myKey + "]";
	}
	
	
}
