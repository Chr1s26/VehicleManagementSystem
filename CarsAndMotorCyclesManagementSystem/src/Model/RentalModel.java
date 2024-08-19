package Model;

public class RentalModel {

	private static int rentalId = 0;
	private String vehicleType;
	private VehicleModel vehicle;
	private int rentedDays;
	private double totalPrice;
	private final static int maxRentalCount = 100;
	private static int rentalCount = 0;
	
	public RentalModel(String vehicleType,int rentedDays,double totalPrice) {
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

	public VehicleModel getVehicle() {
		return vehicle;
	}

	public void setVehicle(VehicleModel vehicle) {
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
}
