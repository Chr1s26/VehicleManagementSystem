package Service;

import java.io.IOException;
import Dao.MotorCycleDaoImp;
import Dao.RentalDaoImp;
import Model.MotorCycle;
import Model.Rental;

public class MotorCycleRentalService extends VehicleRentalService {

	private MotorCycleDaoImp motorcycleDaoImp;
	private RentalDaoImp rentalDaoImp;
	
	public MotorCycleRentalService() {
		motorcycleDaoImp = new MotorCycleDaoImp();
		rentalDaoImp = new RentalDaoImp();
	}

	@Override
	public void rentInfo(String licenseNumber,int days) throws IOException {
		MotorCycle motorCycle = motorcycleDaoImp.getMotorCycleModelByLicenseNumber(licenseNumber);
		if(motorCycle != null) {
			double price = motorCycle.getPricePerDay();
			double totalprice = motorCycleRentalTotalPrice(days,price);
			Rental rental = new Rental("motorCycle", days, totalprice);
			rentalDaoImp.addRentalModel(rental);
			motorcycleDaoImp.deleteMotorCycleModelByLicenseNumber(licenseNumber);
			System.out.printf("Car rented successfully! Total price is %.2f",totalprice);}
	}


	public double motorCycleRentalTotalPrice(int days,double price) {
		double total = days * price;
		return total;
		}
	
	@Override
	public void displaySaleReport() {
		System.out.printf("\nMotorCycle Rented : %d",Rental.getMotorCycleRentalCount());
		System.out.printf("\nMotorCycle Remaining : %d",MotorCycle.getMotorCycleCount());
		System.out.printf("\nRevenue from Motorcycle : %.2f",totalMotorCycleRevenue());}


	public double totalMotorCycleRevenue() {
		double total = 0;
		Rental[] rentalModel = rentalDaoImp.getAllRentalModels();
		for(int i = 0; i < Rental.getRentalCount();i++) {
			if(rentalModel[i].getVehicleType().equalsIgnoreCase("motorcycle")) {
				total += rentalModel[i].getTotalPrice();}}
		return total;}

}
