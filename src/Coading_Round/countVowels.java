package Coading_Round;

public class countVowels {

	public static void main(String[] args) {
		String line = "aeiouyogesh";
		int vowels=0;
		line=line.toLowerCase();
		System.out.println(line);
		for(int i=0;i<line.length();i++) {
			char ch = line.charAt(i);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i')
			{
				vowels++;
			}
		}
		System.out.println(vowels);
	}

}
