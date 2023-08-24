package Coading_Round;

import java.util.HashSet;

public class commonIntwoarray2 {

	static void findmissing(int a[], int b[], int n, int m) {
		// store all elements in of second array in hash table
		HashSet s = new HashSet<>();
		for (int i = 0; i < m; i++)
			s.add(b[i]);
		// prints all elements of first array which are not present in hash table
		for (int i = 0; i < n; i++)
			if (!s.contains(a[i]))
				System.out.println(a[i] + "  ");
			

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 6, 3, 4, 5 };
		int b[] = {  2,4, 3, 0 };
		int n = a.length;
		int m = b.length;
		findmissing(a, b, n, m);
	}

}
