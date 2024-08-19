package Dao;

import Model.RentalModel;

public class RentalDaoImp implements RentalDao {
	
	private static RentalModel[] rentalModels = new RentalModel[RentalModel.getMaxrentalcount()];
	
	@Override
	public void addRentalModel(RentalModel rentalModel) {
		rentalModels[RentalModel.getRentalCount()-1] = rentalModel;
	}

	@Override
	public RentalModel getRentalModelByLicenseName(String name) {
		return null;
	}

	@Override
	public RentalModel[] getAllRentalModels() {
		return rentalModels;
	}

	@Override
	public void updateRentalModel(RentalModel RentalModel) {
	}

	@Override
	public void deleteRentalModel(int id) {
	}

	

}
