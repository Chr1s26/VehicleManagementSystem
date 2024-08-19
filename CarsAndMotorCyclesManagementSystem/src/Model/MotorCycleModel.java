package Model;

public class MotorCycleModel extends VehicleModel{

	private String engineCapacity;
	private final static int maxMotorCycleCount = 100;
	private static int MotorCycleCount = 0;
	private static int MotorCycleRentCount = 0;
	
	 public MotorCycleModel(VehicleModel vehicle,String engineCapacity) {
		 super(vehicle);
		 this.engineCapacity = engineCapacity;
		 this.MotorCycleCount++;
	 }

	public static int getMotorCycleCount() {
		return MotorCycleCount;
	}

	public static void setMotorCycleCount(int motorCycleCount) {
		MotorCycleCount = motorCycleCount;
	}

	public static int getMaxmotorcyclecount() {
		return maxMotorCycleCount;
	}

	public static int getMotorCycleRentCount() {
		return MotorCycleRentCount;
	}

	public static void setMotorCycleRentCount(int motorCycleRentCount) {
		MotorCycleRentCount = motorCycleRentCount;
	}
	 
	 

}
