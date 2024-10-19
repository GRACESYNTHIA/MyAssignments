package week3.day2;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String test = "Changeme";
		char[] testarray = test.toCharArray();
		for (int i = 0; i < test.length(); i++) {
			if (i % 2 != 0) {
				testarray[i] = Character.toUpperCase(testarray[i]);
			}
		}
		System.out.println(String.valueOf(testarray));

	}

}
