class Car extends Vehicle {
    private boolean hasGPS;
    private final double GPS_PREMIUM = 5.0; 
    
    public Car(String vehicleId, String model, double baseRentalRate, boolean hasGPS) {
        super(vehicleId, model, baseRentalRate);
        this.hasGPS = hasGPS;
    }
    
    public boolean isHasGPS() {
	 return hasGPS; 
	}
    public void setHasGPS(boolean hasGPS) { 
	this.hasGPS = hasGPS;
	 }
    
    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (hasGPS) {
            cost += GPS_PREMIUM * days;
        }
        return cost;
    }
}

