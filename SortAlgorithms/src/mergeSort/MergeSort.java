package mergeSort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,35,-15,-15,7,55,1,-22};
		mergeSort(arr, 0, arr.length);
		print(arr);
		
	}
	public static void mergeSort(int array[], int start , int end)
	{
		if(end - start <2)
		{
			return;
		}
		
		int mid = (start + end)/2;
		mergeSort(array, start,mid);
		mergeSort(array, mid, end);
		mergeArr(array, start, mid, end);
		
	}

	public static void mergeArr(int array[], int start,  int mid , int end)
	{
		
		if(array[mid - 1] <= array[mid])
		{
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;

		int tempArr[] = new int[end-start];
		
		while(i < mid && j < end)
		{
		tempArr[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
		}
		System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(tempArr, 0, array, start, tempIndex);
        
//        System.arraycopy(arr, i, arr, start+tempIndex, mid-1);
//        System.arraycopy(tempArr, 0, tempArr, start, tempIndex);
	
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
