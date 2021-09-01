package day12;

import java.util.Scanner;

public class Pg1_Divbyyzer {

	public static void main(String[] args) {
		int a,b,c;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter a and b val");
		a=ob.nextInt();
		b=ob.nextInt();
		try
		{
			c=a/b;
			System.out.println("C = "+ c);
		}
		catch (ArithmeticException e) {
			System.out.println("Divide by zero exce");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("hi i m here after c");
	}

}
