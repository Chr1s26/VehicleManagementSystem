package Service;

import java.io.IOException;

import Model.Vehicle;

public abstract class VehicleRegisterationService extends BaseService{
	
	public void addVehicle() throws IOException {
		System.out.println("Enter the ownerName : ");
		String name = bufferedReader.readLine();
		System.out.println("Enter the model : ");
		String model = bufferedReader.readLine();
		System.out.println("Enter the license Number : ");
		String number = bufferedReader.readLine();
		System.out.println("Enter the price Per day : ");
		double price = Double.parseDouble(bufferedReader.readLine());
		Vehicle vehicle = new Vehicle(name, model, number,price);
		this.getTypeInfo(vehicle);
		}
	
	public abstract void getTypeInfo(Vehicle vehicle) throws IOException;
	
	public abstract void DisplayVehicle();
	
}
