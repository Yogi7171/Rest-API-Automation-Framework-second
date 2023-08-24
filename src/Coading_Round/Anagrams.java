package Coading_Round;

import java.util.Arrays;

public class Anagrams {
//function to check whether two strings are anagrams of each other
	static boolean areAnagram(char[] str1,char[] str2) 
	{
		//get length of both strings
		int n1 = str1.length;
		int n2 = str2.length;
		//if lenght of both string are not same thenthey can not be anagram
		if(n1!=n2)
			return false;
		//sort both strings
		Arrays.sort(str1);
		Arrays.sort(str2);
		//compare sorted strings
		for(int i=0;i<n1;i++)
			if(str1[i] !=str2[i])
				return false;
		return true;
		
	}
	//Driver program to test to print printDups
	
	
	
	public static void main(String[] args) {
		char str1[]= {'t', 'k' , 'w' , 't'};
		char str2[]= {'t','t','e','w'};
		if(areAnagram(str1,str2))
			System.out.println("The two strings are "+"anagram of eachother");
		else
			System.out.println("The two strings are not "+"anagram of eachother");

	}

}
