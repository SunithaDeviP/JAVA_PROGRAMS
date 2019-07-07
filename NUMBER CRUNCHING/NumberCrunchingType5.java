/*
 * TYPE 5:
 * 
 * DESTRUCTION : RIGHT TO LEFT(WITHOUT DESTRUCTING THE ORIGINAL NUMBER)
 * CONSTRUCTION : LEFT JOIN
 * 
 *  N=120345
 *  
 *  DESTRUCTION CONSTRUCTION
 *  5			5
 *  4			45
 *  3			345
 *  0			345
 *  2			20345
 *  1 			120345
 *  
 *  
 * 
 * 
 */
public class NumberCrunchingType5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=123045;
	int pv=1;
	int res=0;
	int safe =n;
	while(n/pv!=0)
	{
		int digit = (n/pv)%10;
		res= (digit*pv)+res;
		System.out.println(digit+"\t"+res);
		pv=pv*10;
	}
	System.out.println("BEFORE DESTRUCTION "+safe+" AFTER DESTRUCION "+n);

	}

}
