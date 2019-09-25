package QuickSort;

import java.util.Arrays;

public class quickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,35,-15,-15,7,55,1,-22};
		quickSort(arr, 0, arr.length);
		print(arr);
		
		

	}
	
	public static int partition(int[] array , int start, int end)
	{
		int i = start;
		int j = end;
		int pivot = array[start];
		
		
		while(i < j)
		{
			while(i<j && array[--j] >= pivot);
			if(i<j)
			{
				array[i] = array[j];
			}
			
			while(i<j && array[++i] <= pivot );
			if(i<j)
			{
				array[j]=array[i];
			}
			
			
		}
		
		array[j] = pivot;
		return j;
	}

	public static void quickSort(int[] array , int start, int end)
	{
		if(end - start < 2)
		{
			return;
		}
		
		int pivotIndex =  partition(array, start, end);
		quickSort(array, start, pivotIndex);
		quickSort(array, pivotIndex + 1, end);
		
		
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


//public class quickSort {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

//}
