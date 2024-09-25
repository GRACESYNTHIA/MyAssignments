package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int input=1262;
		int output=0,rem;
		int i=input;
		while(i!=0)
		{
			rem=i%10;
			output=(output*10)+rem;
			i=i/10;
		}
		if(input==output)
		{
		System.out.println("yes,the given number " + input +" is a palindrome.");	
		}
		else
		{
			System.out.println("No,the given number "+input+" is not a Palindrome.");
		}
		
		
	}

}
