package Service;

import java.io.IOException;

import Dao.RentalDaoImp;
import Dao.VehicleDaoImp;
import Model.MotorCycleModel;
import Model.RentalModel;
import Model.VehicleModel;

public class MotorCycleService extends BaseService{
	
private VehicleDaoImp vehicleDaoImps;
private RentalDaoImp rentalDaoImp;
	


	public MotorCycleService() {
		vehicleDaoImps = new VehicleDaoImp();
		rentalDaoImp = new RentalDaoImp();
	}
	
	

	public void getMotorCycleInfo() throws NumberFormatException, IOException {
		System.out.println("Enter the engine Capacity : ");
		String capacity = bufferedReader.readLine();
		VehicleModel vehicle = new MotorCycleModel(VehicleManagementService.getVehicle(), capacity);
		VehicleManagementService.setVehicle(vehicle);}
	
	
	
	
	public void MotorCycleRentalService(String licenseNumber,int days) {
		VehicleModel vehicleModel = vehicleDaoImps.getVehicleModelByLicenseNumber(licenseNumber,"motorcycle");
		if(vehicleModel != null) {
			double price = vehicleModel.getPricePerDay();
			double totalprice = MotorCycleRentalTotalPrice(days,price);
			RentalModel rentalModel = new RentalModel("motorcycle", days, totalprice);
			rentalDaoImp.addRentalModel(rentalModel);
			vehicleDaoImps.deleteVehicleModelByLicenseNumber(licenseNumber, "MotorCycle");
			System.out.printf("Motorcycle rented successfully! Total price is %.2f",totalprice);}}
	
	
	
	
	public double MotorCycleRentalTotalPrice(int days,double price) {
		double total = days * price;
		return total;}
	
	
	
	
	
	public void displaMotorCycleSaleReport() {
		System.out.printf("\nMotorCycle Rented : %d",MotorCycleModel.getMotorCycleRentCount());
		System.out.printf("\nMotorCycle Remaining : %d",MotorCycleModel.getMotorCycleCount());
		System.out.printf("\nRevenue from Motorcycle : %.2f",totalMotorCycleRevenue());}
	
	
	
	
	public double totalMotorCycleRevenue() {
		double total = 0;
		RentalModel[] rentalModel = rentalDaoImp.getAllRentalModels();
		for(int i = 0; i < RentalModel.getRentalCount();i++) {
			if(rentalModel[i].getVehicleType().equalsIgnoreCase("motorcycle")) {
				total += rentalModel[i].getTotalPrice();}}
		return total;}
	
	
	
	
	
	public void DisplayMotorcycle(){
		System.out.println("\nAvaliable Motorcycles : ");
		VehicleModel[][] vehicleModel = vehicleDaoImps.getAllVehicleModels();
		
		for(int i = 0; i < MotorCycleModel.getMaxmotorcyclecount(); i++) {
			if(vehicleModel[1][i] != null) {
			System.out.println(vehicleModel[1][i].getModel()+" (License No : "+vehicleModel[1][i].getLicenseNo()+", Price : $"+vehicleModel[1][i].getPricePerDay()+"/day)");}}}
	

}
