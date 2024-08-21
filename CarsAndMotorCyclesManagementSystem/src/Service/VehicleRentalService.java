package Service;

import java.io.IOException;


public abstract class VehicleRentalService extends BaseService {
	
	
	public VehicleRentalService() {
		}
	
	public void RentVehicle() throws IOException {
		System.out.println("Enter the license number : ");
		String number = bufferedReader.readLine();
		System.out.println("Enter the number of days that you want to add : ");
		int days = Integer.parseInt(bufferedReader.readLine());
		this.rentInfo(number,days);
		}
	
	public abstract void rentInfo(String license,int days) throws IOException;
	
	public void ShowSaleReport() throws IOException {
		System.out.println("Sale Report: ");
		this.displaySaleReport();
	}
	
	public abstract void displaySaleReport() throws IOException;
	
}

