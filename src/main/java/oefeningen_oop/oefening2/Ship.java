package oefeningen_oop.oefening2;

public class Ship {
    private Vehicle[] vehicles = new Vehicle[100];
    private int vehicleCounter= 0;
    private int placeCounter = 0;


    public void addVehicle(Vehicle vehicle){
        if (vehicleCounter==100 || this.totalWeight() > 95000) {
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
