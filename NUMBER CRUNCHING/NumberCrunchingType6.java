/*
 * TYPE 6:
 * 
 * DESTRUCTION : RIGHT TO LEFT (WITH DESTRUCTING THE NUMBER)
 * CONSTRUCTION : LEFT JOIN
 * 
 * INPUT : 120345
 * 
 * DESTRUCTION CONSTRUCTION
 * 5			5
 * 4			45
 * 3			345
 * 0			345
 * 2			20345
 * 1			120345
 * 
 */
public class NumberCrunchingType6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=120345;
		int res=0,safe =n,pv=1;
		while(n!=0){
			int digit = n%10;
			res=(digit*pv)+res;
			System.out.println(digit+"\t"+res);
			pv=pv*10;
			n=n/10;
		}
	}

}
