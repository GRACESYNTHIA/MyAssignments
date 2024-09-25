package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] firstArray = { 3, 2, 11, 4, 6, 7 };
		int[] secondArray = { 1, 2, 8, 4, 9, 7 };
		int lengthOfFirstArray = firstArray.length;
		int lengthOfSecondArray = secondArray.length;
		for (int i = 0; i < lengthOfFirstArray; i = i + 1) {
			for (int j = 0; j < lengthOfSecondArray; j = j + 1) {
				if (firstArray[i] == secondArray[j]) {
					System.out.println(firstArray[i]);
				}
			}
		}
		System.out.println("***************************");
		for(int i:firstArray) {
			for(int j:secondArray) {
				if (i == j) {
					System.out.println(i);
				}
			}
		}

	}
	

}
