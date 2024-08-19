package Dao;

import Model.CarModel;
import Model.MotorCycleModel;
import Model.VehicleModel;

public class VehicleDaoImp implements VehicleDao {
	 
	private static VehicleModel[][] vehicle = new VehicleModel[2][VehicleModel.getMaxvehiclecount()];
	
	@Override
	public void addVehicleModel(VehicleModel vehicleModel,String type) {
		if(type.equalsIgnoreCase("Car")) {
		vehicle[0][CarModel.getCarCount()-1] = vehicleModel;}
		else {
			vehicle[1][MotorCycleModel.getMotorCycleCount()-1] = vehicleModel;}}
	
	

	@Override
	public VehicleModel getVehicleModelByLicenseNumber(String name,String type) {
		if(type.equalsIgnoreCase("car")) {
		for(int i = 0; i < VehicleModel.getVehicleCount();i++) {
			if(vehicle[0][i].getLicenseNo().equalsIgnoreCase(name)) {
				return vehicle[0][i];}}}
		else {
			for(int i = 0; i < VehicleModel.getVehicleCount();i++) {
				if(vehicle[1][i].getLicenseNo().equalsIgnoreCase(name)) {
					return vehicle[1][i];}}}
		return null;}
	
	

	@Override
	public VehicleModel[][] getAllVehicleModels() {
		return vehicle;
	}
	
	

	@Override
	public void updateVehicleModel(VehicleModel VehicleModel) {
	}

	
	
	@Override
	public void deleteVehicleModelByLicenseNumber(String num, String type) {
	    if (type.equalsIgnoreCase("car")) {
	        for (int i = 0; i < VehicleModel.getVehicleCount(); i++) {
	            if (vehicle[0][i] != null && vehicle[0][i].getLicenseNo().equalsIgnoreCase(num)) {
	            	
	                for (int j = i; j < CarModel.getCarCount() - 1; j++) {
	                    vehicle[0][j] = vehicle[0][j + 1];}
	                
	                vehicle[0][CarModel.getCarCount() - 1] = null; 
	                CarModel.setCarCount(CarModel.getCarCount() - 1);
	                VehicleModel.setVehicleCount(VehicleModel.getVehicleCount() - 1);
	                CarModel.setCarRentCount(CarModel.getCarRentCount() + 1);
	                break;}}} 
	    
	    else {
	        for (int i = 0; i < VehicleModel.getVehicleCount(); i++) {
	            if (vehicle[1][i] != null && vehicle[1][i].getLicenseNo().equalsIgnoreCase(num)) {
	                
	                for (int j = i; j < MotorCycleModel.getMotorCycleCount() - 1; j++) {
	                    vehicle[1][j] = vehicle[1][j + 1];
	                }
	                vehicle[1][MotorCycleModel.getMotorCycleCount() - 1] = null; 
	                MotorCycleModel.setMotorCycleCount(MotorCycleModel.getMotorCycleCount() - 1);
	                VehicleModel.setVehicleCount(VehicleModel.getVehicleCount() - 1);
	                MotorCycleModel.setMotorCycleRentCount(MotorCycleModel.getMotorCycleRentCount() + 1);
	                break; 
	            }}}}


	

}
