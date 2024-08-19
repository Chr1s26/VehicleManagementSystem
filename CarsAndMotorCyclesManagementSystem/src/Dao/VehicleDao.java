package Dao;

import Model.VehicleModel;

public interface VehicleDao {

	void addVehicleModel(VehicleModel VehicleModel,String type);
	VehicleModel getVehicleModelByLicenseNumber(String name,String type);
	VehicleModel[][] getAllVehicleModels();
	void updateVehicleModel(VehicleModel VehicleModel);
	void deleteVehicleModelByLicenseNumber(String license,String type);

}
