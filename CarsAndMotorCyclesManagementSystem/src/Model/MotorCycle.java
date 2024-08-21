package Model;

public class MotorCycle extends Vehicle{

	private String engineCapacity;
	private final static int maxMotorCycleCount = 100;
	private static int MotorCycleCount = 0;
	
	 public MotorCycle(Vehicle vehicle,String engineCapacity) {
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

}
