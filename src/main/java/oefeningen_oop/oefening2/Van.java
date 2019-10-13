package oefeningen_oop.oefening2;

public class Van extends Vehicle {

    public static final int WEIGHT_OF_A_VAN = 1500;
    public static final int AMOUNT_OF_PLACE_TAKEN_BY_A_VAN = 2;

    @Override
    public int getWeight() {
        return WEIGHT_OF_A_VAN;
    }

    @Override
    public int getNumberOfPlaces() {
        return AMOUNT_OF_PLACE_TAKEN_BY_A_VAN;
    }
}
