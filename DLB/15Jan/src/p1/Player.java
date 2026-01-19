package p1;

public class Player 
{
	int iJerseyNo;
	String sName;
	int iRuns;
	
	public Player(int iJerseyNo,String sName,int iRuns)
	{
		this.iJerseyNo = iJerseyNo;
		this.sName = sName;
		this.iRuns = iRuns;
	}

	@Override
	public String toString() {
		return "[iJerseyNo=" + iJerseyNo + ", sName=" + sName + ", iRuns=" + iRuns + "]";
	}
	
	
}
