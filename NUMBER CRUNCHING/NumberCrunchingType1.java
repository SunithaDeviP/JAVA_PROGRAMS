/*
 * INPUT : 12345
 * 
 * TYPE1 :
 * 
 * DESTRUCTION : LEFT TO RIGHT	(WITHOUT DESTRUCTING THE NUMBER)
 * CONSTRUCTION : LEFT JOIN
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
public class NumberCrunchingType1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =120345;
		int pv=1;
		while(num/pv!=0)
			pv=pv*10;
		pv=pv/10;
		int pv2=1,res=0;
		System.out.println("BEFORE DESTRUCTION "+num);
		System.out.println("DESTRUCTION CONSTRUCTION");
		while(pv!=0){
			int digit = (num/pv)%10;
			res=digit*pv2+res;
			System.out.println(digit+"\t"+res);
			pv=pv/10;
			pv2=pv2*10;
		}
		System.out.println("AFTER DESTRUCTION "+num);
		
	}

}
