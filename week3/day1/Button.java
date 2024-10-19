package week3.day1;

public class Button extends WebElement {

	public void submit() {
		System.out.println("Need to click Submit in Button Class");
	}
	public static void main(String[] args) {
		Button press=new Button();
		press.submit();
		press.click();
		press.setText("text");
		
			

	}

}
