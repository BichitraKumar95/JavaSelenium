package JAVAPac;

import java.util.Arrays;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		int[] arr= {28,18,32,61,9};
		System.out.println("before sorting");
		System.out.println(Arrays.toString(arr));
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("after sorting");
		System.out.println(Arrays.toString(arr));
	}

}
