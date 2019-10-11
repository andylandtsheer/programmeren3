package oefeningen_oop.oefening1.animals;

import oefeningen_oop.oefening1.measurements.Size;
import oefeningen_oop.oefening1.measurements.Weight;

public class Cat extends Animal implements MakeNoise {
    public Cat(Weight weight, Size size) {
        super(weight,size);
    }

    @Override
    public boolean isAnimalToHeavy() {
        return this.getWeight().getWeight() > this.getSize().getSize();
    }

    @Override
    public void makeSoundWhenRubbed() {
        System.out.println("miauw");
    }
}
