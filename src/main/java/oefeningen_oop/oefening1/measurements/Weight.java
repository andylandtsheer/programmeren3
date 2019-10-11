package oefeningen_oop.oefening1.measurements;

public class Weight {
    private final double weight;
    private final Measurement measurement;

    public Weight(double weight, Measurement measurement) {
        this.weight = weight;
        this.measurement = measurement;
    }

    public double getWeight() {
        return weight;
    }
}
