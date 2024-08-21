package Service;

import java.io.IOException;

import Dao.CarDaoImp;
import Dao.RentalDaoImp;
import Model.Car;
import Model.Rental;

public class CarRentalService extends VehicleRentalService{

	private CarDaoImp carDaoImp;
	private RentalDaoImp rentalDaoImp;
	
	public CarRentalService() {
		carDaoImp = new CarDaoImp();
		rentalDaoImp = new RentalDaoImp();
	}

	@Override
	public void rentInfo(String licenseNumber,int days) throws IOException {
		Car car = carDaoImp.getCarModelByLicenseNumber(licenseNumber);
		if(car != null) {
			double price = car.getPricePerDay();
			double totalprice = carRentalTotalPrice(days,price);
			Rental rental = new Rental("car", days, totalprice);
			rentalDaoImp.addRentalModel(rental);
			carDaoImp.deleteCarModelByLicenseNumber(licenseNumber);
			System.out.printf("Car rented successfully! Total price is %.2f",totalprice);}
	}


	public double carRentalTotalPrice(int days,double price) {
		double total = days * price;
		return total;
		}
	
	
	public double totalCarRevenue() {
		double total = 0;
		Rental[] rentalModel = rentalDaoImp.getAllRentalModels();
		for(int i = 0; i < Rental.getRentalCount();i++) {
			if(rentalModel[i].getVehicleType().equalsIgnoreCase("car")) {
				total += rentalModel[i].getTotalPrice();}}
		return total;}
	
	@Override
	public void displaySaleReport() {
		System.out.printf("\nCarRented : %d",Rental.getCarRentalCount());
		System.out.printf("\nCarRemaining : %d",Car.getCarCount());
		System.out.printf("\nRevenue from Cars %.2f",totalCarRevenue());
	}
	
	

	
}
