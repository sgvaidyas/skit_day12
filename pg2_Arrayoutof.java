package day12;

import java.util.Scanner;

public class pg2_Arrayoutof {

	public static void main(String[] args) {
		int n,ind;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter va of n = ");
		n=ob.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements ");
		for(int i=0;i<n;i++)
		{
			a[i]=ob.nextInt();
		}
		try
		{
			System.out.println("Enter the index = ");
			ind=ob.nextInt();
			System.out.println("value is = "+ a[ind]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("I am executing");
	}
}
