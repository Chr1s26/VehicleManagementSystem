package Dao;

import Model.MotorCycle;
import Model.MotorCycle;

public interface MotorCycleDao {

	void addMotorCycleModel(MotorCycle motorcycle);
	MotorCycle getMotorCycleModelByLicenseNumber(String name);
	void deleteMotorCycleModelByLicenseNumber(String license);

}
