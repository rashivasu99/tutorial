package com;

import java.util.Scanner;

public class  Main1{
	public static void main(String args[])
	{
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter the value of a");
		int a= myObj.nextInt();

		if(a%2==0)
		{
		a=a-1;
		}

		for(int i=0;i<a*2;i++)
		{  
		if(i%2!=0)
		{  
		System.out.print(i);
		}
		}
	}
}
			
		
