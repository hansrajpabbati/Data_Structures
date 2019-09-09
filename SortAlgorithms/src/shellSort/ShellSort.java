package shellSort;

import java.sql.Timestamp;
import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,35,-15,-15,7,55,1,-22};
//		int arr[] = {7,4,8,2};

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
		for(int gap = arr.length/2 ; gap >0 ; gap = gap/2)
		{

			for(int i = gap ; i < arr.length;i++)
			{
				int key = arr[i];
				int j = i;


				while(j>= gap && arr[j- gap] > key)
				{
					arr[j] = arr[j - gap];
					j = j- gap;
				}
				arr[j] = key;
			}

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
