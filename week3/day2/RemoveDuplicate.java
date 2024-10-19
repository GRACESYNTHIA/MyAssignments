package week3.day2;

public class RemoveDuplicate {

	public static void main(String[] args) {
	String text ="We learn Java basics as part of java sessions in java week1";
	int count=0;
	String[]textarray=text.split(" ");
	for(String s:textarray) {
	
	}
	for(int i=0;i<textarray.length;i++) {
		for(int j=i+1;j<textarray.length;j++) {
			if(textarray[i].equalsIgnoreCase(textarray[j]) && !textarray[i].equalsIgnoreCase(" ")) {
				textarray[j]=" ";
				count=count+1;
			}
		}
	}
	
	System.out.println(count);
	for(String sentence : textarray)
	{
		if(!textarray.equals(" ")) {
			System.out.print(sentence+" ");
		}
	}
	
	}

}
