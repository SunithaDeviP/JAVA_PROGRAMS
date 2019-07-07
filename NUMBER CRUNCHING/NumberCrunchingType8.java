/*
 * TYPE 8 :
 * 
 * DESTRUCTION : RIGHT TO LEFT (WITH DESTRUCTING THE NUMBER)
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
 */
public class NumberCrunchingType8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=123045;
		int n=1000;
		int  safe =n,res=0,digit=0;
		while(n!=0)
		{
			digit =n%10;
			res=(res*10)+digit;
			System.out.println(digit+"\t"+res);
			n=n/10;
		}
		System.out.println("BEFORE DESTRUCTION "+safe+" AFTER DESTRUCION "+n);
	}

}
