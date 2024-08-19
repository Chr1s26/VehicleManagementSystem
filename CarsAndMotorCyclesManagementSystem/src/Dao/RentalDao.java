package Dao;

import Model.RentalModel;

public interface RentalDao {

	void addRentalModel(RentalModel RentalModel);
	RentalModel getRentalModelByLicenseName(String name);
	RentalModel[] getAllRentalModels();
	void updateRentalModel(RentalModel RentalModel);
	void deleteRentalModel(int id);

}
