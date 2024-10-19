package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	
		 String str1 = "stops";
		 String str2 = "potss";
		    
		    str1 = str1.toLowerCase();
		    str2 = str2.toLowerCase();

		    // check if length are equal
		    if(str1.length() == str2.length()) {

		      // convert strings to char array
		      char[] charArray1 = str1.toCharArray();
		      char[] charArray2 = str2.toCharArray();

		      // sort the char array
		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2);

		      // if sorted char arrays are equal
		      // then the string is anagram
		      boolean result = Arrays.equals(charArray1, charArray2);

		      if(result) {
		        System.out.println(str1 + " and " + str2 + " are anagram.");
		      }
		      else {
		        System.out.println(str1 + " and " + str2 + " are not anagram.");
		      }
		    }
		    else {
		      System.out.println("Lengths Mismatch therefore, "+str1 + " and " + str2 + " are not anagram.");
		    }
		  }
		}

	


