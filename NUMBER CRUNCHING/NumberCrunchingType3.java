/*
 * TYPE3:
 * 
 * DESTRUCTION : LEFT TO RIGHT (WITHOUT DESTRUCTING THE ORIGINAL NUMBER) 
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

import java.util.*;
public class NumberCrunchingType3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=120345,pv=1;
		while(n/pv!=0){
			pv=pv*10;
		}
		pv=pv/10;
		int res=0,pv2=1;
		System.out.println("Destruction Construction");
		int safe =n;
		while(pv!=0)
		{
			int digit = (n/pv)%10;
			res=res*10+digit;
			 System.out.println(digit+"\t"+res);
			// n=n%pv;//destructing the number
			pv=pv/10;
		}
		System.out.println("BEFORE DESTRUCTION "+safe+" AFTER DESRUCION "+n);

	}

}
