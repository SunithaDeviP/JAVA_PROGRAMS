import java.util.*;
public class Factors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count=0;
		int flag=1;
		for(int i=1;;i++)
		{
			//1
			//System.out.print("number = "+i);
			count =0;
			for(int j=1;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					//System.out.println(" factors are "+j);
					count++;
					
				}
				if(count==100)
				{
					System.out.println(i);
					flag=0;
					break;
				}
			}
			//System.out.println();
			if(flag==0)
				break;
			
		}
	}

}
