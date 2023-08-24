package Coading_Round;
//Swap two numbers with and without using temporary variable
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float firstnumber = 10.0f;
		float secondnumber = 20.0f;
		
		System.out.println("First number is "+firstnumber);
		System.out.println("Second number is "+secondnumber);
		
		firstnumber= firstnumber-secondnumber;
		secondnumber=firstnumber+secondnumber;
		firstnumber=secondnumber-firstnumber;
		
		System.out.println("Swapping number");
		System.out.println("First Number ="+firstnumber);
		System.out.println("second Number ="+secondnumber);
		
	}

}
