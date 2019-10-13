package oefeningen_oop.oefening1.animals;

import oefeningen_oop.oefening1.measurements.Size;
import oefeningen_oop.oefening1.measurements.Weight;

public class Rabbit extends Animal implements MakeNoise{

    public static final int MAX_HEALTY_WEIGHT = 1;

    public Rabbit(Weight weight, Size size) {
        super(weight,size);
    }

    @Override
    public boolean isAnimalToHeavy() {
        return this.getWeight().getWeight() > MAX_HEALTY_WEIGHT;
    }

    @Override
    public void makeSoundWhenRubbed() {
        System.out.println("ribbit");
    }
}
