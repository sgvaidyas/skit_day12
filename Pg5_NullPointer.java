package day12;

public class Pg5_NullPointer {

	public static void main(String[] args) {
		
		try
		{
			String s = null;
			System.out.println(s.length());
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}

	}

}
