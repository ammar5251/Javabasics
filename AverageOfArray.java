package com.samplepackage2;

public class AverageOfArray {
	
	public static void main (String args [])
	{
		
		int array [] = {5, 20, 25, 30};
		
		int sumArray = 0;
		
		for(int i =0; i<array.length; i++)
		{
			
			sumArray = sumArray + array[i];
			
			
		}
		
		System.out.println("Sum of Array is: " + sumArray);
		
		System.out.println("Average of the given array is: " + (sumArray/2));
		
	}

}
