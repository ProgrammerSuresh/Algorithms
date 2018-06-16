package com.practise.algorithms;

public class InsertionSort 
{

	public static int[] sort(int[] array)
	{
		int j=0;
		
		for(int i=1;i<array.length;i++)
		{
			int tmp = array[i];
			
			j=i-1;
			
			while(j >= 0 && array[j] > tmp)
			{
				array[j+1] = array[j];
				j = j-1;
			}
			
			array[j+1] = tmp; 
			
		}
		
		return array;
	}
	public static void main(String[] args)
	{
		int[] numbers = {5,2,4,6,1,3};
		
		numbers = sort(numbers);
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i]+",");
		}
	}
}
