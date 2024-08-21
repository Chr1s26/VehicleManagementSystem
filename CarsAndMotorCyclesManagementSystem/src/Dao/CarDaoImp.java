package Dao;

import Model.Car;
import Model.Rental;
import Model.Car;

public class CarDaoImp implements CarDao{
	
	private static Car[] cars = new Car[Car.getMaxcarcount()];

	@Override
	public void addCarModel(Car car) {
		cars[Car.getCarCount()-1] = car;
	}
	

	@Override
	public Car getCarModelByLicenseNumber(String name) {
			for(int i = 0; i < Car.getCarCount();i++) {
				if(cars[i].getLicenseNo().equalsIgnoreCase(name)) {
					return cars[i];}}
			return null;
	}
	

	@Override
	public void deleteCarModelByLicenseNumber(String license) {
		
		 for (int i = 0; i < Car.getCarCount(); i++) {
	            if (cars[i] != null && cars[i].getLicenseNo().equalsIgnoreCase(license)) {
	            	
	                for (int j = i; j < Car.getCarCount() - 1; j++) {
	                    cars[j] = cars[j + 1];}
	                
	                cars[Car.getCarCount() - 1] = null; 
	                Car.setCarCount(Car.getCarCount() - 1);
	                Rental.setCarRentalCount(Rental.getCarRentalCount()+1);
	                break;}}
	}
	
	
	
	public static Car[] getCars() {
		return cars;
	}

}
