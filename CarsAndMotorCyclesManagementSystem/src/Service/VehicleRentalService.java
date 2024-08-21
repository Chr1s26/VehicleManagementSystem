package Service;

import java.io.IOException;

import Model.Customer;


public abstract class VehicleRentalService extends BaseService {
	
	
	public VehicleRentalService() {
		}
	
	public void RentVehicle() throws IOException {
		System.out.println("Enter the license number : ");
		String number = bufferedReader.readLine();
		System.out.println("Enter the number of days that you want to add : ");
		int days = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Enter the customer name : ");  
		String name = bufferedReader.readLine();
		System.out.println("Enter the customer id : ");
		String id = bufferedReader.readLine();
		Customer customer = new Customer(name, id);
		this.rentInfo(number,days,customer);
		}
	
	public abstract void rentInfo(String license,int days,Customer customer) throws IOException;
	
	public void ShowSaleReport() throws IOException {
		System.out.println("Sale Report: ");
		this.displaySaleReport();
	}
	
	public abstract void displaySaleReport() throws IOException;
	
}

