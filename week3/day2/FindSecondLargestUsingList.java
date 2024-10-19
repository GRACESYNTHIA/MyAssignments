package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestUsingList {

	public static void main(String[] args) {
		// Declare an array
		int[] array = { 3, 2, 11, 4, 6, 7 };
		// add to list
		List<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			arrayList.add(array[i]);
		}
		//Arrange the collection in ascending order
		Collections.sort(arrayList);
		//Print the second largestno
		 int SecondLargestNo=arrayList.get(arrayList.size()-2);
		System.out.println("The second largest number is "+SecondLargestNo);

	}

}
