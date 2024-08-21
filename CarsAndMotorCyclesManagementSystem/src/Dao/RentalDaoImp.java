package Dao;

import Model.Rental;

public class RentalDaoImp implements RentalDao {
	
	private static Rental[] rentals = new Rental[Rental.getMaxrentalcount()];
	
	@Override
	public void addRentalModel(Rental rental) {
		rentals[Rental.getRentalCount()-1] = rental;
	}

	@Override
	public Rental getRentalModelByLicenseName(String name) {
		return null;
	}

	@Override
	public Rental[] getAllRentalModels() {
		return rentals;
	}

}
