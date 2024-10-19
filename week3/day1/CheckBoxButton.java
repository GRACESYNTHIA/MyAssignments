package week3.day1;

public class CheckBoxButton extends Button{

	public void clickCheckButton() {
		System.out.println("Need to click check box in CheckBoxButton class");
	}

	public static void main(String[] args) {
		CheckBoxButton box=new CheckBoxButton();
		box.submit();
		box.click();
		box.setText("text");
		box.clickCheckButton();

	}

}
