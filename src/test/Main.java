package test;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] dates = new int[3];

		System.out.println("Dear user enter the specifications of the vehicle \n");
		System.out.println("enter the register of vehicle");
		System.out.println("enter the register of engine");
		System.out.println("enter the register of the seats");

		for (int i = 0; dates.length < 3; i++) {
			dates[i] = input.nextInt();
		}
		
		for(int element : dates) {
			System.out.println("valor dato " + element);
		}
	}
}