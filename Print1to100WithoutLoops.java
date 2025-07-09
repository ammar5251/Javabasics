package com.samplepackage2;

public class Print1to100WithoutLoops
{
	
	
	public static void main (String [] args)
	{
		
		printNumber(1);
		
		
	}
	
	public static void printNumber(int number)
	{
		
		if(number<=100)
		{
			System.out.println(number);
			number++;
			printNumber(number);
			
			
		}
		
		
		
	}
	
	
}