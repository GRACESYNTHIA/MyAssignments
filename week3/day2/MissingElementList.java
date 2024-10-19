package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MissingElementList {

	public static void main(String[] args) {
		// Declare an array
		Integer[] givenarray = { 1, 2, 3, 4, 10, 6, 8 };
		// convert to list
		List<Integer> listforarray =  Arrays.asList(givenarray);
		System.out.println("The given array is "+ listforarray);
		//Sort using collections in ascending order
		Collections.sort(listforarray,Comparator.naturalOrder());
		System.out.println("The array in ascending order"+listforarray);
		//to find the missing numbers
		System.out.print( "Missing numbers ");
		for(int i=0;i<listforarray.size()-1;i++) {

			if((listforarray.get(i)+1 )!=listforarray.get(i+1)) {
				System.out.print(listforarray.get(i)+1+ " ");
			}
		}
		
		
		}
	}


