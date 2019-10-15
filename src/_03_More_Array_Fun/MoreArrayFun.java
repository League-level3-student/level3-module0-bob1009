package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	
	public static void main(String[] args) {
		String[]num= {"1","2","3","4"};
//		writearray (num);
//		reverse(num);
//	everyother(num);
		random(num);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	static void writearray(String[]array) {
		 for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void reverse( String[]array) {
		for (int i = array.length-1; i >=0; i--) {
			System.out.println(array[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void everyother(String []array) {
			for (int i = 0; i < array.length; i++) {
				if (i%2==0) {
					System.out.println(array[i]);
				}
			}
		}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void random(String[]array) {
		Random ran=new Random();
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[ran.nextInt(array.length)]);
	}
	}
	
}
