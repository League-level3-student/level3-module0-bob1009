package _03_More_Array_Fun;

import javax.swing.JOptionPane;

public class Checkpoint {
public static void main(String[] args) {
	int[]nums=new int[5];
	for (int i = 0; i < nums.length; i++) {
	 String numbers=JOptionPane.showInputDialog("put in one number");
	 nums[i]=Integer.parseInt(numbers);
	 
}
	int together=nums[0];
	for (int i = 0; i < nums.length; i++) {
	together=together+nums[i];	
	}
	together-=nums[0];
	JOptionPane.showMessageDialog(null, ""+together);
}}
