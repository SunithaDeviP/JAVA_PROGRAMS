/*
TYPE3:
 * 
 * DESTRUCTION : LEFT TO RIGHT (WITH DESTRUCTING THE ORIGINAL NUMBER) 
 * CONSTRUCTION : RIGHT JOIN
 * 
 * INPUT : 12345
 * 
 * 
 * DESTRUCTION CONSTRUCTION
 * 1			1
 * 2			12
 * 3			123
 * 4			1234	
 * 5			12345
 * 
 * 
 */
public class NumberCrunchingType4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		int pv=1;
		while(n/pv!=0){
			pv=pv*10;
		}
		System.out.println("BEFORE DESTRUCTION "+n);
		pv=pv/10;
		int res=0;
		while(pv!=0){
			int digit = n/pv;
			res= res*10 +digit;
			 System.out.println(digit+"\t"+res);
			n=n%pv;
			pv=pv/10;
		}
		System.out.println("AFTER DESTRUCTION "+n);
	}

}
