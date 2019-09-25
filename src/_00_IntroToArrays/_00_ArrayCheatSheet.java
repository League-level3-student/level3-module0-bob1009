package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array= {"one","two","three", "four", "five"};
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[3]="1+2";
		//4. print the third element again
		System.out.println(array[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < array.length; i++) {
			array[i]="yeet";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//7. make an array of 50 integers
		int []num=new int[50];
		//8. use a for loop to make every value of the integer array a random number
		Random ran=new Random();
		for (int i = 0; i < num.length; i++) {
			num[i]=ran.nextInt(51);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int tiny=num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i]<tiny) {
				 tiny=num[i];
			}
		}
		System.out.println(tiny);
		
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		//11. print the largest number in the array.
		int bigboi=num[0];
				for (int i = 0; i < num.length; i++) {
					if (num[i]>bigboi) {
						bigboi=num[i];
					}
				}
		//12. print only the last element in the array
		System.out.println(num[49]);
	}
}
