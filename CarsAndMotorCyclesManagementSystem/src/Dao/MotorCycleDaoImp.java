package Dao;

import Model.MotorCycle;
import Model.Rental;

public class MotorCycleDaoImp implements MotorCycleDao {
	
	private static MotorCycle[] motorCycles = new MotorCycle[MotorCycle.getMaxmotorcyclecount()];

	@Override
	public void addMotorCycleModel(MotorCycle motorcycle) {
		motorCycles[MotorCycle.getMotorCycleCount()-1] = motorcycle;
	}

	
	@Override
	public MotorCycle getMotorCycleModelByLicenseNumber(String name) {
		for(int i = 0; i < MotorCycle.getMotorCycleCount();i++) {
			if(motorCycles[i].getLicenseNo().equalsIgnoreCase(name)) {
				return motorCycles[i];}}
		return null;
	}


	@Override
	public void deleteMotorCycleModelByLicenseNumber(String license) {
		 for (int i = 0; i < MotorCycle.getMotorCycleCount(); i++) {
	            if (motorCycles[i] != null && motorCycles[i].getLicenseNo().equalsIgnoreCase(license)) {
	            	
	                for (int j = i; j < MotorCycle.getMotorCycleCount() - 1; j++) {
	                    motorCycles[j] = motorCycles[j + 1];}
	                
	                motorCycles[MotorCycle.getMotorCycleCount() - 1] = null; 
	                MotorCycle.setMotorCycleCount(MotorCycle.getMotorCycleCount() - 1);
	                Rental.setMotorCycleRentalCount(Rental.getMotorCycleRentalCount()+1);
	                break;}}
	}
	
	
	
	public static MotorCycle[] getMotorCycles() {
		return motorCycles;
	}

}
