public class SmartFleet {
    public static void main(String[] args) {
        
        java.util.ArrayList<Vehicle> fleet = new java.util.ArrayList<>();
        
        
        fleet.add(new Car("C001", "Toyota Camry", 50.0, true));
        fleet.add(new Car("C002", "Honda Civic", 45.0, false));
        fleet.add(new Truck("T001", "Ford F-150", 75.0, 6.5));
        fleet.add(new Truck("T002", "Chevrolet Silverado", 70.0, 4.0));
        
        
        System.out.println("===== FLEET RENTAL COSTS (5 DAYS) =====");
        for (Vehicle vehicle : fleet) {
            double cost = vehicle.calculateRentalCost(5);
            System.out.println("Vehicle: " + vehicle.getVehicleId() + 
                             " (" + vehicle.getModel() + ")");
            System.out.println("Rental Cost: ZMW" + String.format("%.2f", cost));
            
            
            if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                System.out.println("Cargo Capacity: " + truck.getCargoCapacity() + " tons");
                if (truck.needsService()) {
                    System.out.println(" SERVICE NEEDED!");
                } else {
                    System.out.println("Vehicle is in good condition");
                }
            }
            System.out.println();
        }
    }
}