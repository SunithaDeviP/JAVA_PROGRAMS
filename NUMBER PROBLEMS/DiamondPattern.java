import java.util.Scanner;


public class DiamondPattern {

	/**
	 * @param args
	 */
	
	static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print("* ");
		}
	}
	
	static void space(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print(" ");
		}
	}
	static void firstHalf(int rows,int space)
	{
		
		
		for(int i=1;i<=rows;i++)
		{
			space(space);
			print(i);
			space--;
			System.out.println();
		}
	}
	
	static void secondHalf(int rows,int space)
	{
		for(int i=rows;i>=1;i--)
		{
			space(space);
			print(i);
			space++;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER NO OF ROWS ");
		int rows = input.nextInt();
		int space = rows-1;
		firstHalf(rows,space);
		space =1;
		rows=rows-1;
		secondHalf(rows,space);
	}

}
