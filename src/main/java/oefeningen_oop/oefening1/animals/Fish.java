package oefeningen_oop.oefening1.animals;

import oefeningen_oop.oefening1.measurements.Size;
import oefeningen_oop.oefening1.measurements.Weight;

public class Fish extends Animal implements MakeNoise{
    public Fish(Weight weight, Size size) {
        super(weight, size);
    }

    @Override
    public boolean isAnimalToHeavy() {
        return false;
    }

    @Override
    public void makeSoundWhenRubbed() {
        System.out.println("Blub");
    }
}
