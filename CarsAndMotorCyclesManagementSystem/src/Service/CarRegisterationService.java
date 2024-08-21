package Service;

import java.io.IOException;

import Dao.CarDaoImp;
import Model.Car;
import Model.Vehicle;

public class CarRegisterationService extends VehicleRegisterationService {
	
	private CarDaoImp carDaoImp;
	
	public CarRegisterationService() {
		carDaoImp = new CarDaoImp();
	}
		
	
	@Override
	public void getTypeInfo(Vehicle vehicle) throws IOException {
		System.out.println("Enter the number of seats : ");
		int seats = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Enter the car type : ");
		String type = bufferedReader.readLine();
		Car car = new Car(vehicle, seats, type);
		carDaoImp.addCarModel(car);
		}
	
	@Override
	public void DisplayVehicle() {
		System.out.println("Avaliable Cars : ");
		Car[] cars = CarDaoImp.getCars();
		for(int i = 0; i < Car.getCarCount(); i++) {
			if(cars[i] != null) {
				System.out.println(cars[i].getModel()+" (License No : "+cars[i].getLicenseNo()+", Price : $"+cars[i].getPricePerDay()+"/day)");}}
	}
	
}	

	


