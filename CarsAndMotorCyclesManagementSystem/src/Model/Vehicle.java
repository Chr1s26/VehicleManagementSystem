package Model;

public class Vehicle {

	private String ownerName;
	private String model;
	private String licenseNo;
	private double pricePerDay;
	private static int vehicleCount = 0;
	private static final int maxVehicleCount = 100;
	
	public Vehicle(String ownerName,String model,String licenseNo,double pricePerDay) {
		this.ownerName = ownerName;
		this.model = model;
		this.licenseNo = licenseNo;
		this.pricePerDay = pricePerDay;
	}
	
	public Vehicle (Vehicle vehicleModel) {
		this.ownerName = vehicleModel.ownerName;
		this.model = vehicleModel.model;
		this.licenseNo = vehicleModel.licenseNo;
		this.pricePerDay = vehicleModel.pricePerDay;
		this.vehicleCount ++;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getModel() {
		return model;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public double getPricePerDay() {
		return pricePerDay;
	}

	public static int getVehicleCount() {
		return vehicleCount;
	}

	public static int getMaxvehiclecount() {
		return maxVehicleCount;
	}

	public static void setVehicleCount(int vehicleCount) {
		Vehicle.vehicleCount = vehicleCount;
	}

}
