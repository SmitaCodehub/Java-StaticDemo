

class Demo
{
	static int a;
	static int b;
	
	static
	{
		a=10;
		b=20;
		System.out.println("inside Static Block");
		
	}
	
	static void disp1()
	{
		System.out.println("inside Static method");
		System.out.println(a);
		System.out.println(b);
	}
	int x;
	int y;
	
	{
		System.out.println("iinside java non-static block");
		x=100;
		y=200;
	}
	
	void disp2()
	{
		System.out.println("inside non-static method");
		System.out.println(x);
		System.out.println(y);
	}
}
public class StaticApp {

	public static void main(String[] args) {
		
		Demo.disp1();
		Demo d=new Demo();
		d.disp1();
		d.disp2();
		

	}

}
