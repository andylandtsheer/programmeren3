package oefeningen_oop.oefening2;

public class Car extends Vehicle {
    @Override
    public int getWeight() {
        return 1000;
    }

    @Override
    public int getNumberOfPlaces() {
        return 1;
    }
}
