/*
 * NEXT LARGEST NUMBER 
 * 
 * INPUT : 459863
 * OUTPUT : 46589
 * 
 * LOGIC :
 * 
 * 4 5 9 8 6 3
 * 
 * STEP 1 : INITIAL SETUP
 *  
 * PLACEVALUE =10 
 * LEFT = (NUM / PLACEVALUE) % 10
 * RIGHT = NUM % 10
 *
 *STEP 2 : 
 *
 * PLACEVALUE RIGHT LEFT RIGHT<LEFT ACTIONS
 * 
 * 	10			 3	6	CONTINUE	RIGTH =LEFT, LEFT = (NUM/PLACEVALUE)%10
 *  100			 6	8	CONTINUE	"
 *  1000		 8  9   CONTINUE	"
 *  10000		 9	5	BREAK 
 *  
 * THEREFORE WE GOT PLACEVALUE =10000 AND LEFT = 5 , RIGHT =9
 * 
 * STEP 3 :
 * 
 * FROME STEP TWO WE GOT THAT 5 HAS TO BE REPLACED WITH THE VALUES
 * 
 * (I.E) WE CAN REPLACE 5 WITH EITHER
 * 
 * 9
 * 8
 * 6
 * 3
 * 
 * NOW PICK THE VALUE WHICH IS GREATER THAN 5 
 * 
 *PLACEVALUE	CONDITION	ACTION		RIGHT
 *
 *		1			3>5 	CONTINUE	6
 *		10			6>5		BREAK
 *
 * 
 * STEP 4 :	NOW SWAP THE VALUES
 * 
 * FROM STEP2 AND STEP 3 WE GOT THAT WHICH VALUES HAVE TO BE REPLACED
 * 
 * WE KNOW
 * 
 * LEFT = 5   	PLACEVALUE = 10000
 * RIGHT = 6	PLACEVALUE = 10
 * 
 * PERFORM SWAP
 * 
 * 4 5 9 8 6
 * 
 * 4 6 9 8 5
 * 
 * 
 * STEP 5 : PERFORM PARTIAL REVERSING
 * 
 * FINAL RESULT = 4 6 5 8 9
 * 
 * 
 * STEP 6 : PRINT ALL THE POSSIBILITIES
 * 
 * 
 */
import java.util.*;
public class NextLargestNumber {

	/**
	 * @param args
	 */
	static int smallest(int n) 
    { 
		int k=0;
		int a[]=new int[10];
		while(n!=0)
		{
			a[k]=n%10;
			n=n/10;
			k++;
		}
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<k;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		//for(int i=0;i<k;i++)
		//printf("%d ",a[i]);
		int res=0;
		int i=0;
		while(k--!=0)
		{
			res = res*10+a[i];
			i++;
		}
		return res;
    } 
	static int swap(int number,int pv1,int pv2)
	{
		int val1 = (number/pv1)%10;
		int val2 =(number/pv2)%10;
		number = number - val1*pv1 + val2*pv1;
		number = number - val2*pv2 + val1*pv2;
		
		return number;
	}
	
	static int reverse(int number,int pv)
	{
		int rev = number/pv;
		int num =number%pv;
		int power =1;
		while(num/power!=0)
		{
			int digit = (number/power)%10;
			rev =rev*10+digit;
			power=power*10;
		}
		return rev;
	}
	static int nextLargest(int number)
	{
		int placeValue1 =10;
		int placeValue2 = 1;
		int left = (number/placeValue1)%10;
		int right = (number)%10;
		
		//find the position which value has to be replaced
		while(number/placeValue1 !=0)
		{
			
			if(left<right)
			{
				while(true)
				{
					
					right=(number/placeValue2)%10;
					
					if(right>left)
						break;
					placeValue2=placeValue2*10;
				}
				number = swap(number,placeValue1,placeValue2);
				number = reverse(number,placeValue1);
				break;
			}
				
			placeValue1= placeValue1*10;	
			right = left;
			left =(number/placeValue1)%10;
		}
		return number;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		//int b =input.nextInt();
	//	if(number>b)
	//		number=smallest(number);
		number  =nextLargest(number);
		System.out.println("NEXT LARGEST = "+number);
		int count =0;
		int next=0,flag=0;
		while(true)
		{
			
			next = nextLargest(number);
			System.out.println(next);
			if(next==number)
				break;
			
			count++;
			number=next;
		}
		System.out.println("TOTAL POSSIBILITIES "+count);
		
	}

}
