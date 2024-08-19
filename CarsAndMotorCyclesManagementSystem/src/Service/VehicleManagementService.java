package Service;

import java.io.IOException;
import Dao.VehicleDaoImp;
import Model.VehicleModel;

public class VehicleManagementService extends BaseService {
	
	private static VehicleModel vehicle ;
	private VehicleDaoImp vehicleDaoImp;
	private CarService carService;
	private MotorCycleService motorCycleService;
	
	public VehicleManagementService() {
		vehicleDaoImp = new VehicleDaoImp();
		carService = new CarService();
		motorCycleService = new MotorCycleService();}

	
	
	
	public void addVehicle() throws IOException {
		System.out.println("Enter the Vehicle type : ");
		String type = bufferedReader.readLine();
		
		this.vehicleInfo();
		
		if(type.equalsIgnoreCase("car")) {
			carService.getCarInfo();
			vehicleDaoImp.addVehicleModel(vehicle,type);
			System.out.println("Car added successfully!!");}
		else if(type.equalsIgnoreCase("motorcycle")) {
			motorCycleService.getMotorCycleInfo();
			vehicleDaoImp.addVehicleModel(vehicle,type);
			System.out.println("Motorcycle added successfully");}}
	
	
	
	
	public void vehicleInfo() throws IOException {
		System.out.println("Enter the ownerName : ");
		String name = bufferedReader.readLine();
		System.out.println("Enter the model : ");
		String model = bufferedReader.readLine();
		System.out.println("Enter the license Number : ");
		String number = bufferedReader.readLine();
		System.out.println("Enter the price Per day : ");
		double price = Double.parseDouble(bufferedReader.readLine());
	    vehicle = new VehicleModel(name, model, number,price);
	}
	
	
	
	public void RentVehicle() throws IOException {
		System.out.println("Enter the Vehicle type : ");
		String type = bufferedReader.readLine();
		System.out.println("Enter the license number : ");
		String number = bufferedReader.readLine();
		System.out.println("Enter the number of days that you want to add : ");
		int days = Integer.parseInt(bufferedReader.readLine());
		if(type.equalsIgnoreCase("car")) {
			carService.CarRentalService(number,days);}
		else {motorCycleService.MotorCycleRentalService(number, days);}}
	
	
	
	
	public void ShowSaleReport() {
		System.out.println("Sale Report: ");
		carService.displayCarSaleReport();
		motorCycleService.displaMotorCycleSaleReport();
	}
	
	
	
	
	public void DisplayVehicle(){
		carService.DisplayCar();
		motorCycleService.DisplayMotorcycle();}	
	
	
	
	
	public static VehicleModel getVehicle() {
		return vehicle;}
	
	public static void setVehicle(VehicleModel vehicle) {
		VehicleManagementService.vehicle = vehicle;}

}

