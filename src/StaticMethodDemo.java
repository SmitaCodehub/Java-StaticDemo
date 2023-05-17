

class Demo2
{
	static int a;
	
	static
	{
		a=10;
	}
	
	static void disp()
	{
		System.out.println("Static disp "+ a);
	}
}

public class StaticMethodDemo {
	static void disp2()
	{
		System.out.println("Disp 2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main method");
		disp2();
		Demo2.disp();
		Demo2 d =new Demo2();
		
		d.disp();
	}

}
