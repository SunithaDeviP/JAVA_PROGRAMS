/*
 * TYPE 7:
 * 
 * DESTRUCTION : RIGHT TO LEFT (WITHOUT DESTRUCTING THE NUMBER)
 * CONSRUCTIN :  RIGHT JOIN
 * 
 * INPUT :123045
 * 
 * DESTRUCTION CONSTRUCTION
 * 5			5
 * 4			54
 * 0			540
 * 3			5403
 * 2			54032
 * 1			540321	
 * 
 * 
 * NUM = 123045		AFTER NUM = 123045
 */
public class NumberCrunchingType7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1230450;
		int pv=1,res=0,digit=0;
		while(n/pv!=0)
		{
			digit =(n/pv)%10;
			res = res*10+digit;
			System.out.println(digit+"\t"+res);
			pv=pv*10;
		}
		
	}

}
