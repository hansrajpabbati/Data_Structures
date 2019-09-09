package selectionSort;

import java.sql.Timestamp;
import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {20,35,-15,-15,7,55,1,-22};
//		int arr[] = {7,4,8,2};

		int arrLength = arr.length;
		int lastIndex = arrLength-1;
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);

		for(int i=0; i < arrLength -1 ; i++)
		{
			int largestIndex = 0;
			for(int j=1; j <lastIndex ; j++)
			{
				if(arr[j] > arr[largestIndex])
				{
					largestIndex = j;
				}
			}
			swap(arr, largestIndex, lastIndex);
			lastIndex--;
		}
		
//        for(int i=0; i < arr.length-1; i++){
//            int min = i;
//
//            for (int j= i+1; j<arr.length;j++)
//            {
//
//              if (arr[j]<arr[min])
//                    min = j;
//
//                }
//      swap(arr,i,min);
//
//        }
        
        
		Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp1);

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
