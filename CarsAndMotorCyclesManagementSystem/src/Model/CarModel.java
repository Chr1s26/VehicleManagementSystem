package Model;

public class CarModel extends VehicleModel{

	private int numSeats;
	private String carType;
	private static final int maxCarCount = 100;
	private static int CarCount = 0;
	private static int CarRentCount = 0;
	
	public CarModel(VehicleModel vehicle, int numSeats,String carType) {
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

	public static int getCarRentCount() {
		return CarRentCount;
	}

	public static void setCarRentCount(int carRentCount) {
		CarRentCount = carRentCount;
	}
	
	

}
