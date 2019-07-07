/*
 * KAPREKAR NUMBER
 * 
 * LOGIC : 
 *  
 *  1) SCAN A NUMBER 'N' 
 *  
 *  2) SQUARE THE NUMBER AND STORE IT IN 'SQ'
 *  
 *  3) DIVIDE THE SQUARE TO EQUAL HALF
 *  	IF NO_OF_DIGITS(SQUARE) IS ODD
 *  		THEN
 *  			ASSIGN MAXMUM DIGITS TO RIGHT SIDE
 *  
 *  4) RIGHT DIGIT SHOUD NOT BE EQUAL TO ZERO
 *  	IF RIGHT DIGIT ==0
 *  		THEN 
 *  			TAKE THE NUMBER FROM SQUARE UNTIL 
 *  				RIGHT >0
 *  
 *  5) ELIMINATE IF THERE ARE ZEROS AT THE RIGHT OF THE LEFT_DIGIT
 *  	(i.e) IF LEFT = 2800
 *  			THEN MAKE LEFT = 28
 *  
 * 	6) ADD LEFT DIGIT + RIGHT DIGIT
 *  		IF LEFT+RIGHT == N
 *  			THEN
 *  				PRINT YES
 *  		ELSE
 *  				PRINT NO
 *  
 *  EXAMPLE :- 
 *  
 *  INPUT :45
 *  
 *  SQ = 2045 
 *  LEFT = 20 
 *  RIGHT = 25
 *  LEFT + RIGHT = 45 WHICH IS EQUAL TO 'N'
 *	
 *	THEREFORE 45 IS A KAPREKAR NUMBER
 *  
 *  
 *  
 *  EXAMPLE 2:-
 *  
 *  INPUT : 100
 *  
 *  SQUARE = 10000
 *  LEFT = 000
 *  RIGHT =10 
 *  SINCE LEFT SHOULD NOT BE ZERO
 *  ITERATE THE LOOP UNTIL LEFT > ZERO
 *  AFTER ITERATION
 *  LEFT =10000
 *  RIGHT =0
 *  
 *  LEFT + RIGHT = 10000 WHICH IS NOT EQUAL TO 'N'
 *  THEREFOR 100 IS NOT A KAPREKAR NUMBER
 *  
 * 
 */
import java.util.*;
public class KaprekarNumber {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sq = n*n;
		int digit=0;
		int pv=1;
		//calculate no. of digits 
		while(sq/pv!=0)
		{
			digit++;
			pv=pv*10;
		}
		int pv1=1;
		System.out.println("NUMBER = "+n+" SQUARE = "+sq+" DIGIT COUNT = "+digit);
		
		//assign maximum digit to right
		int right = (digit+1)/2;
		//find the place value for right
		while(right-- != 0)
		{
			pv1=pv1*10;
		}
		
		int right_digit = sq%pv1;
		int left_digit = sq/pv1;
		System.out.println("Right digit = "+right_digit+" Left digit = "+left_digit);
		
		//check whether the right is zero
		while(right_digit==0)
		{
			pv1=pv1*10;
			right_digit=sq%pv1;
			left_digit = sq/pv1;
		}
		System.out.println("Right digit = "+right_digit+" Left digit = "+left_digit);
		if(left_digit+right_digit == n)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}

}
