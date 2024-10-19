package week3.day1;

public class RadioButton extends Button {
	public void selectRadioButton() {
		System.out.println("Need to click Radio Button in RadioButton class");
	}

	public static void main(String[] args) {
		RadioButton radio=new RadioButton();
		radio.submit();
		radio.click();
		radio.setText("text");
		radio.selectRadioButton();
		
	}

}
