
public class FactorsOfNumbers {

	static void factors(int n1){
		int sum=0;
		for(int i=1;i<n1;i++)
		{
			if(n1%i==0)
			{
				System.out.println(i+" ");
				sum=sum+i;
			}
		}
		System.out.println(sum+" ");
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1= 48, n2=75;
		factors(n1);
		factors(n2);
	}

}
