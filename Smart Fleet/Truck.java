class Truck extends Vehicle implements Maintainable {
    private double cargoCapacity; 
    private final double HEAVY_DUTY_FEE = 20.0; 
    private int milesSinceLastService = 0;
    
    public Truck(String vehicleId, String model, double baseRentalRate, double cargoCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.cargoCapacity = cargoCapacity;
    }
    
    public double getCargoCapacity() { return cargoCapacity; }
    public void setCargoCapacity(double cargoCapacity) { 
        this.cargoCapacity = cargoCapacity; 
    }
    
    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (cargoCapacity > 5) {
            cost += HEAVY_DUTY_FEE * days;
        }
        return cost;
    }
    
    
    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on truck: " + getVehicleId());
        milesSinceLastService = 0;
    }
    
    @Override
    public boolean needsService() {
        return milesSinceLastService > 5000;
    }
    
    public void addMiles(int miles) {
        milesSinceLastService += miles;
    }
}
