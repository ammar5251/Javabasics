package com.samplepackage2;

import java.util.Scanner;

public class PrimeNumberORNot

{

public static void main (String args [])
{

Scanner sc = new Scanner(System.in);
System.out.println("Please enter a number: ");
int number = sc.nextInt();

System.out.println("Given number " + number + " is a Prime Number: " + IsPrime(number));


}

public static boolean IsPrime(int number)
{

if (number<2)
{

return false;
}

for (int i=2; i<number; i++)
{

if(number%2==0)
{
return false;

}

}

return true;

}


}

