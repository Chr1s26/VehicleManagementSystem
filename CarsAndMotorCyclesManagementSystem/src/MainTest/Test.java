package MainTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Service.VehicleManagementService;

public class Test {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		VehicleManagementService service = new VehicleManagementService();
		System.out.println("----Welcome From Car and Motorcycle Management System----");
		int number = 0;
		do {
			System.out.println("\n1.To add a Vehicle to the system");
			System.out.println("2.To rent Vehicle");
			System.out.println("3.To show Sale Report");
			System.out.println("4.Display Vehicle for each group that exists in the system");
			System.out.println("5.Exit");
			number = Integer.parseInt(bufferedReader.readLine());
			
			switch (number) {
			case 1:
				service.addVehicle();
				break;
			case 2:
				service.RentVehicle();
				break;
			case 3:
				service.ShowSaleReport();
				break;
			case 4:
				service.DisplayVehicle();
				break;
			default:
				break;
			}
		}while(number != 5);
		System.out.println("Thank you for using the Car and Motorcycle Management System.GoodBye!");
	}

}
