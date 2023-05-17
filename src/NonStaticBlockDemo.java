

class Demo1
{
	 int a;
	 int b;
	
	 static int count;
	 
	{
		count++;
	System.out.println("Inside nonStatic block");
	}
	
	Demo1()
	{
		this(100);
		System.out.println("In first constuctor");
	}
	
	Demo1(int a)
	{
		System.out.println(a);
		this.a=a;
		System.out.println("in 2nd Constructor");
	}
	Demo1(int a, int b)
	{	
		
		this.a=a;
		this.b=b;
		System.out.println(a);
		System.out.println(b);
	}
}
public class NonStaticBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 d1=new Demo1();
		Demo1 d2=new Demo1(111);
		Demo1 d3=new Demo1(222,333);
		
		System.out.println(Demo1.count);

	}

}
