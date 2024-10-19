package week3.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		String text = "I am a software tester"; 
		String[]textarray=text.split(" ");
		for(int i=0;i<textarray.length;i++) {
			if(i%2==1) {
				char[] charray=textarray[i].toCharArray();
				for(int j=charray.length-1;j>=0;j--){
					System.out.print(charray[j]);
				}
				
							}
			
			else
			{
				System.out.print(" "+textarray[i]+" ");
			}
		}
		
		
	}

}
