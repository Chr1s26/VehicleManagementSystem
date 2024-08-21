package Dao;

import Model.Rental;

public interface RentalDao {

	void addRentalModel(Rental Rental);
	Rental getRentalModelByLicenseName(String name);
	Rental[] getAllRentalModels();

}
