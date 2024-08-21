package Model;

public class Car extends Vehicle{

	private int numSeats;
	private String carType;
	private static final int maxCarCount = 100;
	private static int CarCount = 0;
	
	public Car(Vehicle vehicle, int numSeats,String carType) {
		super(vehicle);
		this.numSeats = numSeats;
		this.carType = carType;
		this.CarCount++;
	}

	public static int getCarCount() {
		return CarCount;
	}

	public static void setCarCount(int carCount) {
		CarCount = carCount;
	}

	public static int getMaxcarcount() {
		return maxCarCount;
	}
}
