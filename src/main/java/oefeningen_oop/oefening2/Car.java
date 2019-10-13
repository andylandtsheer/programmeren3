package oefeningen_oop.oefening2;

public class Car extends Vehicle {

    public static final int WEIGHT_OF_A_CAR = 1000;
    public static final int AMOUNT_OF_PLACES_TAKEN_BY_A_CAR = 1;

    @Override
    public int getWeight() {
        return WEIGHT_OF_A_CAR;
    }

    @Override
    public int getNumberOfPlaces() {
        return AMOUNT_OF_PLACES_TAKEN_BY_A_CAR;
    }
}
