package Service;

import java.io.IOException;

import Dao.MotorCycleDaoImp;
import Model.MotorCycle;
import Model.Vehicle;

public class MotorCycleRegisterationService extends VehicleRegisterationService{
	
private MotorCycleDaoImp motorCycleDaoImp;
	

	public MotorCycleRegisterationService() {
		motorCycleDaoImp = new MotorCycleDaoImp();
	}
	
	
	@Override
	public void getTypeInfo(Vehicle vehicle) throws IOException {
		System.out.println("Enter the engine Capacity : ");
		String capacity = bufferedReader.readLine();
		MotorCycle motorCycle = new MotorCycle(vehicle, capacity);
		motorCycleDaoImp.addMotorCycleModel(motorCycle);
	}
	
	
	public double MotorCycleRentalTotalPrice(int days,double price) {
		double total = days * price;
		return total;}
	


	@Override
	public void DisplayVehicle() {
		System.out.println("\nAvaliable Motorcycles : ");
		MotorCycle[] motorCycles = MotorCycleDaoImp.getMotorCycles();
		
		for(int i = 0; i < MotorCycle.getMaxmotorcyclecount(); i++) {
			if(motorCycles[i] != null) {
			System.out.println(motorCycles[i].getModel()+" (License No : "+motorCycles[i].getLicenseNo()+", Price : $"+motorCycles[i].getPricePerDay()+"/day)");}}
	}
	
	}
	

