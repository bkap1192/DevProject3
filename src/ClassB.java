
public class ClassB extends ClassA
{
	
	public static String name="Harish";
	
	
	public void cooking()
	{
		System.out.println("Hi");
	}
	
	public static void main(String[] args) 
	{
		ClassA a=new ClassB();
		a.cooking();
		System.out.println(a.name);
		a.run();
	}

}
