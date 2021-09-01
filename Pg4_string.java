package day12;

public class Pg4_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ab6654";
		String n = s.replaceAll("[^0-9]", "");
		System.out.println(n);
		
		String n1=s.replaceAll("[0-9]", "");
		System.out.println(n1);
	}

}
