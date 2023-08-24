package OOPS;

public class Mainclass {

	public static void main(String[] args) {
	System.out.println("HelloWorld");
	Public p1=new Public();
	p1.age=24;
	p1.name="Anuj";
	System.out.println(p1.age+" "+p1.name);
	p1.eat();
	p1.walk();
}
}
class Public
{
	String name;
	int age;
	
void walk()
{
System.out.println(name+"is walking");	
}
void eat()
{
	System.out.println(name+"is eating");
}
void walk(int steps) {
	System.out.println("");
}
		
}

