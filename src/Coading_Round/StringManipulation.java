package Coading_Round;

public class StringManipulation {

	public static void main(java.lang.String[] args) {
		String str = "test";
		String str1 = new String("test");
		String str3= "test";
		
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str3));
		System.out.println(str==str1);
		System.out.println(str==str3);
		System.out.println(str.concat("Automation"));
		
		StringBuffer sb=new StringBuffer("12345");
		sb.append("6789");
		System.out.println(sb);
		
StringBuilder SB=new StringBuilder("123456789");
SB.delete(4, 6);
System.out.println(SB);

	}

}
