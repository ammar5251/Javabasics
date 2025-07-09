package com.samplepackage2;

public class SwapTwoStringWithoutVariable
{

public static void main (String args [])
{

String s1 = "Hello";
String s2 = "WorldTour";

System.out.println(s1);
System.out.println(s2);

s1 = s1+s2; //HelloWorldTour

s2 = s1.substring(0, s1.length()-s2.length());
s1 = s1.substring(s2.length());

System.out.println("After change s1 is: " + s1);
System.out.println("After change s2 is: " + s2);

}


}