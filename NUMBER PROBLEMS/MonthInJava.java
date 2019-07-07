/*
 * INPUT : 10
 * OUTPUT : October
 * 
 * INPUT : 20
 * OUTPUT : Invalid
 * 
 * 
 * LOGIC :
 * 
 * USE PREDEFINED FUNCTION 
 * 
 * Month.of(monthNumber).name() -> returns the monthname
 * (i.e) OCTOBER
 * 
 *  TO CONVERT THE OUTPUT "OCTOBER" -> October
 *  
 *  use substring() and toUpperCase() and toLowerCase()
 */


import java.time.*;
import java.util.*;
public class MonthInJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		System.out.println("ENTER MONTH NUMBER : ");
		int monthNumber=input.nextInt();
		if(monthNumber >=1 && monthNumber<=12)
		{
		String str = null;
		str= Month.of(monthNumber).name().toLowerCase();
		String str1 = str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
		System.out.println(str1);
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
