package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingNamesCollection {

	public static void main(String[] args) {
		//Declare a string array
//		String[] companyNames= ;
		// convert to list
		List<String> listofcompany =  Arrays.asList("HCL","Wipro","Aspire Systems","CTS");
		System.out.println("The given company names are "+ listofcompany);
		//Sort using collections in ascending order
		Collections.sort(listofcompany,Comparator.naturalOrder());
		System.out.println("The company names in ascending order"+listofcompany);
		//to reverse the names that is descending order
		System.out.print( "The company names in reverse order ");
		for(int i=listofcompany.size()-1;i>=0;i--) {
			System.out.print(listofcompany.get(i)+" ");
		}
		
				
		}

	}

