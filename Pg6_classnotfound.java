package day12;

class A
{
	int x;
}
public class Pg6_classnotfound {

	public static void main(String[] args) {
		
		System.out.println();
		try
		{
			Class ob =Class.forName("Pg6_classnotfound");
			//ClassLoader cloader = ob.getClassLoader();
			System.out.println(ob.getName());
		}
		catch(ClassNotFoundException e)
		{
			//System.out.println("ERROR "+e);
		}
		finally
		{
			System.out.println("i execute everytime");
		}
	}

}
