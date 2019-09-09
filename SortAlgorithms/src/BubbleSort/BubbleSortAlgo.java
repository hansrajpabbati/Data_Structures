package BubbleSort;

import java.util.Arrays;


public class BubbleSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,20,35,-15,7,55,55,1,-22};
		//swap(arr, 0, 2);
		//print(arr);

		int index = arr.length;

		for(int i=0; i < index-1 ; i++)
		{
			for(int j=0; j< index-1-i;j++)
			{
				if(arr[j] > arr[j+1] )
				{
					swap(arr, j , j+1);
				}
			}
		}

		print(arr);

	}

	public static void swap(int array[], int i , int j)
	{
		if(i==j)
		{
			return;
		}

		int temp=array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void print(int array[])
	{
//		for(int i=0; i < array.length; i++)
//		{
//			System.out.println(array[i]);
//		}
		System.out.println(Arrays.toString(array));
	}

}
