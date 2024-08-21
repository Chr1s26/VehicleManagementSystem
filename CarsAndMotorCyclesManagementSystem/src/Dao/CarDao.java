package Dao;

import Model.Car;
import Model.Car;

public interface CarDao {

	void addCarModel(Car car);
	Car getCarModelByLicenseNumber(String name);
	void deleteCarModelByLicenseNumber(String license);

}
