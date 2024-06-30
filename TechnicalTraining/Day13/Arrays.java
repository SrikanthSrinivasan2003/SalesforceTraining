package com.sairam.day11;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		
		//get array
				//int intarr[];
				//intarr=new int[5];//Heap memory
				
				int intarr[]= {10,20,30,50,40};//stack memory
				//to print
//				for(int i=0;i<intarr.length;i++)//4
//					System.out.println(intarr[i]);
				
				System.out.println("the array values are:"+Arrays.toString(intarr));
				Arrays.sort(intarr);
				System.out.println("sorted data is:"+Arrays.toString(intarr));
		int intkey=12;
			System.out.println(intkey + " found at index = " + Arrays.binarySearch(intarr, intkey));
				
			//Get the second Array
					int intArr1[] = { 10, 15, 22 };
					System.out.println("Second Array : " + Arrays.toString(intArr1));

					// To compare both arrays
					if (Arrays.equals(intarr, intArr1))
						System.out.println("Both arrays are equal");
					else
						System.out.println("Arrays are not equal");

					//creates a new array with a specified length,
		System.out.println("Integer Array: " + Arrays.toString(intArr1));

					System.out.println("\nNew Arrays by copyOfRange:");
					// To copy the array into an array of new length
					int intArr3[]=Arrays.copyOfRange(intarr, 1, 3);
					System.out.println("Integer Array: " + Arrays.toString(intArr3));

					// To fill the arrays with key 22
					Arrays.fill(intarr, intkey);
				
					System.out.println("Integer Array on filling 22: " + Arrays.toString(intarr));

				}

			}
