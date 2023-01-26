package test;

public class Car {
	
	String model;
	int price;
	Seat[] seats;
	String mark;
	Engine engine;
	int registerCar = 55555;
	static int amountCreated;
	
	public int numberOfSeats() {
		int numSeatsNonulls=0;
		for(int i=0; i<=seats.length; i++) {
			if(seats != null) {
				numSeatsNonulls++;
			}
		}
		return numSeatsNonulls;
	}
	
//	private String VerifyIntegrity(String registerMotor, ){
		
//	}
}	
	
	


