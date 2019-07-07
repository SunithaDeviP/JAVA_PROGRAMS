/*
 * TYPE2 :
 * 
 * DESTRUCTION : LEFT TO RIGHT	(WITH DESTRUCTING THE NUMBER)
 * CONSTRUCTION : LEFT JOIN
 * 
 * INPUT :12345
 * 
 * DESTRUCTION	CONSTRUCTION
 * 1			1
 * 2			21
 * 3			321
 * 4			4321	
 * 5			54321
 * 
 * 
 */
import java.util.*;
public class NumberCrunchingType2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12305,pv=1;
		while(n/pv!=0){
			pv=pv*10;
		}
		pv=pv/10;
		int res=0,pv2=1;
		int safe = n;
		System.out.println("Destruction Construction");
		while(pv!=0)
		{
			int digit = (n/pv);
			 res=(digit*pv2)+res;
			 System.out.println(digit+"\t"+res);
			 n=n%pv;//DESTRUCTING ORIGINAL NUMBER
			pv=pv/10;
			pv2=pv2*10;
		}
		System.out.println("BEFORE DESTRUCTION "+safe+" AFTER DESRUCION "+n);
	}

}
