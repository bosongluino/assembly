package test;

public class Seat {

	String color = "white";
	int price = 20000;
	int registerSeat = 00234;

	private boolean isValidColor(String colour) {
		String[] validsColors = { "red", "green", "yellow", "black", "white" };
		for (int i = 0; i < validsColors.length; i++) {
			if(color.equals(validsColors[i])) {
				return true;
			}
		}
		return false;
	}

	/*
	 * public void changeColor(String colour) { if(colorIsValid(String colour){
	 * this.colour = colour; } else{ system.out.println("colour not valid"); }
	 */
}