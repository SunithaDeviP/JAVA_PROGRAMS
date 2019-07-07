/*List of Prime numbers upto 'n' natural natural numbers
 *
 * OPTIMIZED SOLUTION FOR PRIME NUMBER
 * INPUT : 10
 * OUTPUT : 2 3 5 7
 * 
 * INPUT : 50
 * OUTPUT : 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
 * 
 * LOGIC :
 * 
 * IF N= EVEN NUMBER RETURN FALSE
 * 
 * IF N = ODD NUMBER 
 * 	THEN 
 * 		LOOP FORM i=3 TO SQRT(N)
 * 			IF(N%i==0)
 * 				THEN RETURN FALSE
 *IF THE LOOP COMPLETELY RUNS THEN RETURN TRUE
 *
 *
 * */


import java.util.*;
public class Maain {
static boolean isPrime(int n)
{
	int flag=1;
	if(n==2 )
		return true;
	else if(n%2==0)
		return false;
	else 
	{
		for(int i=3;i<=Math.sqrt(n);i=i+2)
		{
			if(n%i==0)
			{
				flag=0;
				return false;
			}
		}
	}
	return true;
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER THE RANGE : ");
		number=input.nextInt();
		for(int i=2;i<=number;i++)
		{
			//System.out.print(i+" ");
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}

}
