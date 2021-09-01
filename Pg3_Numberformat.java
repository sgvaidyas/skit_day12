package day12;

import java.util.Scanner;

public class Pg3_Numberformat {

	public static void main(String[] args) {
		String n;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter val of n = ");
		n=ob.next();
		
		try
		{
			int x = Integer.parseInt(n);
			System.out.println("n = "+x);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception = "+e);
		}
		System.out.println("hiiiiii");
	}

}
