package week3.day1;

public class TextField extends WebElement {
	public void getText() {
		System.out.println("Get text from application in TextField class");
	}

	public static void main(String[] args) {
		TextField obj=new TextField();
		obj.getText();
		obj.click();
		obj.setText("text");
			
		

	}

}
