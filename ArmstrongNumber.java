package com.samplepackage2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a number: ");
		int number = sc.nextInt();
		int result = number;
		int sum = 0;
		while(number!=0)
		{
			
			sum = sum + ((number%10)*(number%10)*(number%10));
			number = number/10;
			
			
		}
		
		System.out.println("Sum of number is: " + sum);
		
		if(result == sum)
		{
			
			System.out.println("Given number " + result + " is a Armstrong number");
		}
		else
		{
			System.out.println("Given number " + result + " is Not an Armstrong number");
		}
		
	}
		
	}