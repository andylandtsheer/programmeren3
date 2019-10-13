package oefeningen_oop.oefening1.animals;

import oefeningen_oop.oefening1.measurements.Size;
import oefeningen_oop.oefening1.measurements.Weight;

import java.util.Objects;

public abstract class Animal {
    public static final int SIZE_TO_WEIGHT_RATIO = 10;
    private final Weight weight;
    private final Size size;

    Animal(Weight weight, Size size) {
        this.weight = weight;
        this.size = size;
    }

    Weight getWeight() {
        return weight;
    }

    Size getSize() {
        return size;
    }

    public boolean isAnimalToHeavy() {
        if (weight.getWeight() > size.getSize() - SIZE_TO_WEIGHT_RATIO) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.isAnimalToHeavy()) {
            return "Hey, I'm a " + getClass().getSimpleName() + " and I need to go and see the Weightwatchers";
        }
        return "Hey, I'm a "+ getClass().getSimpleName() +" and I'm not Fat!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return getBMI() == animal.getBMI();
    }

    private double getBMI() {
        return weight.getWeight() / Math.pow(size.getSize(), 2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBMI());
    }
}
