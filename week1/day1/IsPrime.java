package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n = 23;
		int count = 0;
		
		for(int i=2;i<=n-1;i=i+1)
		{
			if(n%i==0) 
			{
				count = count+1;
		    }
		}
		if(count>1)
			System.out.println(n +" is not a prime number");
		else
			System.out.println(n +" is a prime number");				

	}

}
