package com;

import java.util.Scanner;
import java.util.*;

public class  Main1{
	public static void main(String args[])
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the no of values you want to enter");
		int n = myObj.nextInt(); 

		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		array[i]=myObj.nextInt();  
		}

		 int[] source_array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		 Dictionary <Integer, Integer> result = new Hashtable<Integer, Integer>();

		for(int i=0; i<source_array.length; i++)
		{
		    int temp = 0;
		    for (int j=0; j<array.length; j++)
		    {
		        if(array[j]%source_array[i]==0)
		        {
		            temp = temp + 1;
		        }
		    }
		    result.put(source_array[i],temp);
		}