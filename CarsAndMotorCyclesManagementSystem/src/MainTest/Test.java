package MainTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model.Car;
import Service.CarRegisterationService;
import Service.CarRentalService;
import Service.MotorCycleRegisterationService;
import Service.MotorCycleRentalService;
import Service.VehicleRegisterationService;


public class Test {
	
	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	static CarRegisterationService carRegisterationService = new CarRegisterationService();
	static MotorCycleRegisterationService motorCycleRegisterationService = new MotorCycleRegisterationService();
	static CarRentalService carRentalService = new CarRentalService();
	static MotorCycleRentalService motorCycleRentalService = new MotorCycleRentalService();
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		System.out.println("----Welcome From Car and Motorcycle Rental System----");
		int number = 0;
		do {
			System.out.println("\n1.To add a Vehicle to the system");
			System.out.println("2.To rent Vehicle");
			System.out.println("3.To show Sale Report");
			System.out.println("4.Display Vehicle");
			System.out.println("5.Exit");
			number = Integer.parseInt(bufferedReader.readLine());
			
			switch (number) {
			case 1:  addVehicle(); break;
			
			case 2: rentVehicle(); break;
			
			case 3: displaySaleReportOfVehicle(); break;
			 
			case 4: displayVehicle(); break;
				
			default:break;}
		}while(number != 5);
		
		System.out.println("Thank you for using the Car and Motorcycle Management System.GoodBye!");
	}
	
	
	
	public static void addVehicle() throws IOException {
		if(getType().equalsIgnoreCase("car")) {
			carRegisterationService.addVehicle();
			System.out.println("Car added successfully!!");}
		else {
			motorCycleRegisterationService.addVehicle();
			System.out.println("MotorCycle added successfully!!");}
		}
	
	public static void displayVehicle() throws IOException{
			carRegisterationService.DisplayVehicle();
			motorCycleRegisterationService.DisplayVehicle();
	}
	
	public static void rentVehicle() throws IOException{
		if(getType().equalsIgnoreCase("car")) {
			carRentalService.RentVehicle();
		}
		else {
			motorCycleRentalService.RentVehicle();
		}
	}
	
	public static void displaySaleReportOfVehicle() throws IOException {
			carRentalService.displaySaleReport();
			motorCycleRentalService.displaySaleReport();
		}

		
	public static String getType() throws IOException {
		System.out.println("Enter the vehicle Type : ");
		String type = bufferedReader.readLine();
		return type;
	}


}
