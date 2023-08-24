package OOPS;



class A
{
A(int a)
{
	System.out.println("Hello Viewer");}
}
class B extends A
{
	
	B()
	{
		super(25);
		System.out.println("Hello Learner");
		
	}
}
public class Yogi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B r=new B();

	}

}
