/*BASE ADDITION
 * 
 * 
 * 
 * BASE 10 ADDTION :
 *    
 *    1
 * -------
 * 	1234
 * 	1239
 * ------ 
 *  2473
 *  
 *  BASE ADDITION 2
 *  
 * 1111 
 * -------
 *  1111
 *  1111
 * -------
 * 11110 
 * 
 * 
 *  BASE ADDITION 5
 *  
 *  ORIGINAL LOGIC IMPLEMENTATION OF ANY ADDITION
 *  
 *  	
 *  CARRY = QUOTIENT 
 *  
 *  RESULT = REMAINDER 
 *  					
 *  CARRY 	1		1			1			1	
 *  		-------------------------------------------------------
 *  				1			4			2			3
 *  				4			3			3			3
 *  		-------------------------------------------------------
 *  				6>5			8>5			5>5			6>5
 *  				6/5=1		8/5=1		5/5=1		6/5=1
 *  				6%5=1		8%5=3		5%5=0		6%5=1
 *  		-------------------------------------------------------
 * RESULT 	1		1			3		0				1		
 *  
 *  
 *  AFTER ADDITION FINAL RESULT = 11301(BASE 5 )
 */

import java.util.*;
public class BaseAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,base;
		Scanner s = new Scanner(System.in);
		num1=s.nextInt();
		num2=s.nextInt();
		base = s.nextInt();
		int carry=0,sum=0,res=0,pv=1;
		while(num1/pv!=0 || num2/pv!=0){
			int digit1 = (num1/pv)%10;
			int digit2 = (num2/pv)%10;
			sum=carry + digit1+digit2;
			carry = sum/base;
			sum = sum%base;
			System.out.println(sum +" "+carry);
			res=sum*pv+res;
			pv=pv*10;
			
		}
		res = carry*pv+res;
		System.out.println("RESULT = "+res);
	}

}
