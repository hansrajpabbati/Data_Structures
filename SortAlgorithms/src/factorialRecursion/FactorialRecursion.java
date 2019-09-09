package factorialRecursion;

import java.sql.Timestamp;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 100;
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
		double ans = factorial(num);
		Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp1);
		System.out.println("Factorial answer is " + ans );
	}

	public static double factorial(double num)
	{
		if(num == 0)
		{
			return 1;
		}
		
		return num*factorial(num-1);
	}
	
}
