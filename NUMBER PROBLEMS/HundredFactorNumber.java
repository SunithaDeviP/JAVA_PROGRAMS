/*
 * DISPLAY THE NUMBER WHICH HAS THE FIRST 'N' FACTORS
 * 
 * (i.e) To find the number which the first 'n' factors
 * 
 * 
 *   
 * 
 * LOGIC : (OPTIMISED SOLUTION)
 * 
 * 				REVERSE ENGINEERING
 * 
 * 1) GET THE 'n' VALUE
 * 
 * 2) FIND THE PRIME FACTOR OF 'n'
 * 
 * 3) STORE THE POWER TO AN ARRAY (i.e) (FACTOR-1)
 * 
 * 4)	NOW GENERATE THE PRIME NUMBERS (i.e)2,3,5,7,9...
 * 
 * 5)	CALCULATE RESULT, ASSIGN THE HIGHEST POWER VALUE TO 
 * 		THE LOWEST PRIMENUMBER  
 * 
 * WORKING :
 * 
 * NUMBER =100
 * PRIME FACTOR OF 100 ARE 2,2,5,5
 * POWER ARE (2-1)(2-1)(5-1)(5-1)
 * GENERATE PRIME NUMBERS AND ASSIGN THE POWER VALUES
 * (i.e) 2^4 * 3^4 * 5^1 * 7^1 = 45360
 * 
 * 
 * HENE 45360 IS THE FIRST NUMBER WHICH HAS 100 FACTORS
 * 
 * 
 * 
 * INPUT :- 6
 * 
 * 
 * PRIME FACTORS OF 6 ARE 2 3 
 * 
 * 
 */

import java.util.*;
public class HundredFactorNumber {

	/**
	 * @param args
	 */
	static int isPrime(long n)
	{
		if(n==2)
			return 1;
		else {
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
					return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF FACTORS : ");
		int n = s.nextInt();
		int i=2,index=0;
		int a[] = new int[100];
		while(n!=1)
		{
			while(n%i==0)
			{
				n=n/i;
				a[index]=i-1;
				index++;
			}
			i++;
		}
		long val=2,res=1;
		for( i=index-1;i>=0;i--)
		{
			while(isPrime(val)==0)
			{
				val++;
			}
			while(a[i]--!=0)
				res=res*val;
			val++;
		}
		System.out.println("RESULT = "+res);
		

	}

}
