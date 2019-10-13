package oefeningen_oop.oefening2;

public class Ship {
    public static final int MAX_AMOUNT_OF_PLACES = 100;
    public static final int MAX_WEIGHT_OF_VEHICLES = 95000;
    private Vehicle[] vehicles = new Vehicle[100];
    private int vehicleCounter= 0;
    private int placeCounter = 0;


    public void addVehicle(Vehicle vehicle){
        if (placeCounter== MAX_AMOUNT_OF_PLACES || this.totalWeight() > MAX_WEIGHT_OF_VEHICLES) {
            throw new IllegalArgumentException("Ship is full");
        }
        vehicles[vehicleCounter++]= vehicle;
        placeCounter += vehicle.getNumberOfPlaces();
    }

    public void removeVehicle(){
        if (vehicleCounter<= 0){
            throw new IllegalArgumentException("Ship is already Empty");
        }
        placeCounter -= vehicles[--vehicleCounter].getNumberOfPlaces();
        vehicles[vehicleCounter]=null;
    }

    public int totalWeight() {
        int weight = 0;
        for (int index = 0; index < vehicleCounter; index++) {
            if (!(vehicles[index]==null)) {
                weight += vehicles[index].getWeight();
            }
        }
        return weight;
    }

    public String getContent(){
        return totalWeight() + " kg and " + placeCounter + " places taken";
    }
}
