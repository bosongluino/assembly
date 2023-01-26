package test;

public class Engine {
	int numberCylinders;
	String type;
	int recordMotor;

	public int changeRecord(int numberRecord) {
		this.recordMotor = recordMotor;
		return this.recordMotor;
	}
	
	public String assignType(String type) {
		if(type.equals("electrico") || type.equals("gasolina")) {
			this.type = type;
		}
		return "cadenaVacia";
		}
}