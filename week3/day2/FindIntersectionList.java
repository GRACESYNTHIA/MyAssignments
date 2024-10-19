package week3.day2;

import java.util.ArrayList;

public class FindIntersectionList {

	public static void main(String[] args) {
		// Declare an array
		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		// Declare another array
		int[] array2 = { 1, 2, 8, 4, 9, 7 };
		// Add first array to list
		ArrayList<Integer> List1 = new ArrayList<Integer>();
		for (int i = 0; i < array1.length; i++) {
			List1.add(array1[i]);
		}
		System.out.println(List1);
		// Add second array to List
		ArrayList<Integer> List2 = new ArrayList<Integer>();
		for (int i = 0; i < array2.length; i++) {
			List2.add(array2[i]);
		}
		System.out.println(List2);
		// create List to store the result
		ArrayList<Integer> List3 = new ArrayList<Integer>();

		for (int i = 0; i < List1.size(); i++) {
			for (int j = 0; j < List2.size(); j++) {
				// compare both arrays
				if (List1.get(i) == List2.get(j)) {
					// print the values if equal
					List3.add(List1.get(i));
				}

			}
		}
System.out.println("The Intesection of two arrays is" +List3);
	}

}
