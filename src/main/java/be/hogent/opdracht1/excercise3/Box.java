package be.hogent.opdracht1.excercise3;

public class Box {
    private final String name;
    private final double emptyWeight;
    private double weight;
    private Item item;

    public Box(String name, double emptyWeight) {
        this.name = name;
        this.emptyWeight = emptyWeight;
        weight = emptyWeight;
    }

    public void putItemInBox(Item item) {
        if (this.item != null) {
            throw new IllegalArgumentException("Only one item can be in the box");
        }
        this.item = item;
        weight = emptyWeight + item.getWeight();
    }


    public void takeItemOutBox() {
        if (this.item == null) {
            throw new IllegalArgumentException("Nothing in the box to take out");
        }
        item = null;
        weight = emptyWeight;
    }

    public double getWeight() {
        return weight;
    }
}
