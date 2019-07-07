/*
 * REFER KAPREKAR NUMBER FOR ALGORITHM AND LOGIC IMPLEMENTATION
 *
 *LIST OF KAPREKAR NUMBERS ARE
 *
 *1, 9, 45, 55, 99, 297, 703, 999, 2223, 2728, 4879, 4950, 
 *5050, 5292, 7272, 7777, 9999, 17344, 22222, 38962, 77778, 
 *82656, 95121, 99999, 142857, 148149, 181819, 187110, 208495,
 *318682, 329967,351352, 356643, 390313, 461539, 466830, 499500
 * 
 */
public class GenerateKaprekar {

	/**
	 * @param args
	 */
	
	static boolean checkKaprekar(long n)
	{
		long sq = n*n;
		long digit=0;
		long pv=1;
		//calculate no. of digits 
		while(sq/pv!=0)
		{
			digit++;
			pv=pv*10;
		}
		long pv1=1;
		//System.out.println("NUMBER = "+n+" SQUARE = "+sq+" DIGIT COUNT = "+digit);
		
		//assign maximum digit to right
		long right = (digit+1)/2;
		//find the place value for right
		while(right-- != 0)
		{
			pv1=pv1*10;
		}
		
		long right_digit = sq%pv1;
		long left_digit = sq/pv1;
		//System.out.println("Right digit = "+right_digit+" Left digit = "+left_digit);
		
		//check whether the right is zero
		while(right_digit==0)
		{
			pv1=pv1*10;
			right_digit=sq%pv1;
			left_digit = sq/pv1;
		}
		//System.out.println("Right digit = "+right_digit+" Left digit = "+left_digit);
		if(left_digit+right_digit == n)
		{
			return true;
		}
		else
		{
			try
			{
			while((left_digit%10==0) && (left_digit!=0))
			{
				left_digit=left_digit/10;
			}
			}
			catch(Exception e)
			{
				System.out.println("error");
			}
			if(left_digit + right_digit == n)
				return true;
			else
				return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=80000;i++)
		{
			if(checkKaprekar(i))
			{
				System.out.print(i+" ");
			}
		}
	}

}
