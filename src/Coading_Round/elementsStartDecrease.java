package Coading_Round;

public class elementsStartDecrease {

	public static void main(String[] args) {
		int midx=0;
		//literal array
		//we are looking in this program from which element its decreasing or reversing
		int arr[]=new int[] {0,1,2,3,4,1};
		for(int i=0;i<arr.length-1;i++)
			if(arr[i]>arr[i+1])
		{
			midx=i;
			break;
		}
System.out.println("the element is:"+midx);
	}

}
