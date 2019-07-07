import java.util.*;
import java.math.*;
public class MinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int m1,m2,m3;
		m1=s.nextInt();
		m2=s.nextInt();
		m3=s.nextInt();
		int min1 = Math.min(Math.min(m1, m2), m3);
		int min3 = Math.max(Math.max(m1, m2), m3);
		int min2 = Math.min(Math.max(m1,m2), Math.max(m2,m3));
		System.out.println(min1+" "+min2+" "+min3);
	}

}
