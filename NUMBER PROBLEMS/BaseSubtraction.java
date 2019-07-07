/*
 * BASE SUBTRACTION 5
 * 
 *BORROW 		3		3+5
 * 		--------------------------------
 * 				4		3		3		3
 * 				1		4		2		3
 * 		--------------------------------
 * 				3-1		8-4		3-2		3-3
 *		--------------------------------							
 * RESULT		2		4		1		0
 */

import java.util.*;
public class BaseSubtraction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n1,n2,base;
		n1=s.nextInt();
		n2=s.nextInt();
		base = s.nextInt();
		int diff=0,borrow=0,pv=1,res=0;
		while(n1/pv !=0)
		{
			int d1 = (n1/pv)%10;
			int d2 =(n2/pv)%10;
			if(d1<d2)
			{
				int pv2 =pv*10;
				while((n1/pv2)==0)
				{
					n1= n1+base-1 *pv2;
					pv2=pv2*10;
				}
				n1=n1-pv2;
				d1=d1+base;
			}
			diff = d1-d2;
			
			res = diff*pv+res;
			pv=pv*10;
			
		}
		System.out.println(res);
	}

}
