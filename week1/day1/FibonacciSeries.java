package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n =8;
		int num1 = -1;
		int num2 = 1;
		int sum;
		System.out.println("The fibonacci series of input range 8 are");
		for(int i=1;i<=n;i=i+1)
		{
			sum=num1+num2;
		System.out.println(sum);
		num1=num2;
		num2=sum;
		}

	}

}
