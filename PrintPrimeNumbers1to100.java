package com.samplepackage2;

public class PrintPrimeNumbers1to100 {

	
	public static void main (String args [])
	{
		
		for (int i=2; i<=100; i++)
		{
			int temp =0;
			
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					
					temp = temp+1;
				}
				
				
			}
			
			if(temp==0)
			{
				System.out.println(i);
			}
			
			else
			{
				temp=0;
			}
		}
		
		
		
	}
	
	
	
}