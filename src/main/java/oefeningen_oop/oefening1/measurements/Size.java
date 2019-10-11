package oefeningen_oop.oefening1.measurements;

public class Size {
    private final int size;
    private final Measurement measurement;

    public Size(int size, Measurement measurement) {
        this.size = size;
        this.measurement = measurement;
    }

    public int getSize() {
        return size;
    }
}
