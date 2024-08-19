package Service;

import java.io.IOException;

import Dao.RentalDaoImp;
import Dao.VehicleDaoImp;
import Model.CarModel;
import Model.RentalModel;
import Model.VehicleModel;

public class CarService extends BaseService {
	
	private VehicleDaoImp vehicleDaoImp;
	private RentalDaoImp rentalDaoImp;
	
	
	
	public CarService() {
		vehicleDaoImp = new VehicleDaoImp();
		rentalDaoImp = new RentalDaoImp();}
	
	
	
	public void getCarInfo() throws NumberFormatException, IOException {
		System.out.println("Enter the number of seats : ");
		int seats = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Enter the car type : ");
		String type = bufferedReader.readLine();
		VehicleModel vehicle = new CarModel(VehicleManagementService.getVehicle() , seats, type);		
		VehicleManagementService.setVehicle(vehicle);}
	
	
	
	
	public void CarRentalService(String licenseNumber,int days) {
		VehicleModel vehicleModel = vehicleDaoImp.getVehicleModelByLicenseNumber(licenseNumber,"car");
		if(vehicleModel != null) {
			double price = vehicleModel.getPricePerDay();
			double totalprice = carRentalTotalPrice(days,price);
			RentalModel rentalModel = new RentalModel("car", days, totalprice);
			rentalDaoImp.addRentalModel(rentalModel);
			vehicleDaoImp.deleteVehicleModelByLicenseNumber(licenseNumber, "car");
			System.out.printf("Car rented successfully! Total price is %.2f",totalprice);}}
	
	
	
	
	
	public double carRentalTotalPrice(int days,double price) {
		double total = days * price;
		return total;}
	
	
	
	
	public double totalCarRevenue() {
		double total = 0;
		RentalModel[] rentalModel = rentalDaoImp.getAllRentalModels();
		for(int i = 0; i < RentalModel.getRentalCount();i++) {
			if(rentalModel[i].getVehicleType().equalsIgnoreCase("car")) {
				total += rentalModel[i].getTotalPrice();}}
		return total;}
	
	
	
	
	public void displayCarSaleReport() {
		System.out.printf("\nCarRented : %d",CarModel.getCarRentCount());
		System.out.printf("\nCarRemaining : %d",CarModel.getCarCount());
		System.out.printf("\nRevenue from Cars %.2f",totalCarRevenue());
	}
	
	
	
	public void DisplayCar(){
		System.out.println("Avaliable Cars : ");
		VehicleModel[][] vehicleModel = vehicleDaoImp.getAllVehicleModels();
		for(int i = 0; i < CarModel.getCarCount(); i++) {
			if(vehicleModel[0][i] != null) {
				System.out.println(vehicleModel[0][i].getModel()+" (License No : "+vehicleModel[0][i].getLicenseNo()+", Price : $"+vehicleModel[0][i].getPricePerDay()+"/day)");}}}
	
}	

	


