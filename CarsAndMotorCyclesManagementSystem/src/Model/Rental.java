package Model;

public class Rental {

	private static int rentalId = 0;
	private String vehicleType;
	private Vehicle vehicle;
	private int rentedDays;
	private double totalPrice;
	private final static int maxRentalCount = 100;
	private static int rentalCount = 0;
	private static int carRentalCount = 0;
	private static int motorCycleRentalCount = 0;
	

	public Rental(String vehicleType,int rentedDays,double totalPrice) {
		this.vehicleType = vehicleType;
		this.rentedDays = rentedDays;
		this.totalPrice = totalPrice;
		rentalCount++;
		this.rentalId = rentalCount;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public static int getMaxrentalcount() {
		return maxRentalCount;
	}

	public static int getRentalCount() {
		return rentalCount;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public int getRentedDays() {
		return rentedDays;
	}

	public void setRentedDays(int rentedDays) {
		this.rentedDays = rentedDays;
	}

	public static int getRentalId() {
		return rentalId;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public static int getCarRentalCount() {
		return carRentalCount;
	}

	public static void setCarRentalCount(int carRentalCount) {
		Rental.carRentalCount = carRentalCount;
	}

	public static int getMotorCycleRentalCount() {
		return motorCycleRentalCount;
	}

	public static void setMotorCycleRentalCount(int motorCycleRentalCount) {
		Rental.motorCycleRentalCount = motorCycleRentalCount;
	}
}
