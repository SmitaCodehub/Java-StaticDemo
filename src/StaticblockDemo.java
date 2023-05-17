

public class StaticblockDemo {
static int a;
	
	static
	{
		a=10;
		System.out.println("In Static Block");
	}

	public static void main(String[] args) {
		
		System.out.println("In main method");

	}

}
