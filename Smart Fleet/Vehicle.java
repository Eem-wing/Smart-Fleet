abstract class Vehicle {
    
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    
    
    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
    }
    
    
    public String getVehicleId() { 
	return vehicleId;
	 }
    public void setVehicleId(String vehicleId) {
	this.vehicleId = vehicleId;
	 }
    
    public String getModel() {
	return model; 
	}
    public void setModel(String model) {
	 this.model = model;
	 }
    
    public double getBaseRentalRate() { 
	return baseRentalRate;
	 }
    public void setBaseRentalRate(double baseRentalRate) { 
        this.baseRentalRate = baseRentalRate; 
    }
    
    
    public abstract double calculateRentalCost(int days);
}

