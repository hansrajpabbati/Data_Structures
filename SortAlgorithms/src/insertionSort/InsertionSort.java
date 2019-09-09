package insertionSort;

import java.sql.Timestamp;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,35,-15,-15,7,55,1,-22};
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
		
		for(int i =1 ; i < arr.length;i++)
		{
			int key = arr[i];
			int j = i -1;
			
			
			while(j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
		Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp1);
		print(arr);
		
		
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
