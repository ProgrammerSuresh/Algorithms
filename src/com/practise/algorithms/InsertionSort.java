package com.practise.algorithms;

/**
 * 
 * @author Suresh Malamanti
 *
 * InsertionSort sorts elements like sorting hand of cards
 * Time complexity O(n2)
 */
public class InsertionSort 
{

	
	/** sorting in increasing order*/
	
	public static int[] sort(int[] numbers)
	{
		int j=0;
		
		for(int i=1;i<numbers.length;i++)
		{
			int tmp = numbers[i];
			
			j=i-1;
			
			while(j >= 0 && numbers[j] > tmp)
			{
				numbers[j+1] = numbers[j];
				j = j-1;
			}
			
			numbers[j+1] = tmp; 
			
		}
		
		return numbers;
	}
	
	public static int[] sortDecreasingOrder(int[] numbers)
	{
		int j=0;
		
		for(int i=1;i<numbers.length;i++)
		{
			int tmp = numbers[i];
			
			j=i-1;
			
			while(j >= 0 && numbers[j] < tmp)
			{
				numbers[j+1] = numbers[j];
				j = j-1;
			}
			
			numbers[j+1] = tmp; 
			
		}
		
		return numbers;
	}
	public static void main(String[] args)
	{
		int[] numbers = {5,2,4,6,1,3};
		
		numbers = sortDecreasingOrder(numbers);
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i]+",");
		}
	}
}
