package oefeningen_oop.oefening1;

import oefeningen_oop.oefening1.animals.Cat;
import oefeningen_oop.oefening1.animals.Fish;
import oefeningen_oop.oefening1.animals.Rabbit;
import oefeningen_oop.oefening1.measurements.Measurement;
import oefeningen_oop.oefening1.measurements.Size;
import oefeningen_oop.oefening1.measurements.Weight;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AnimalTest {

    @Test
    void giveToHeavyCat_whenIsAnimalToHeavy_thenTrueIsReturned() {
        Cat cat = new Cat(new Weight(20, Measurement.KG), new Size(19, Measurement.CM));

        Assertions.assertThat(cat.isAnimalToHeavy()).isTrue();
    }

    @Test
    void giveNormalCat_whenIsAnimalToHeavy_thenFalseIsReturned() {
        Cat cat = new Cat(new Weight(20, Measurement.KG), new Size(21, Measurement.CM));


        Assertions.assertThat(cat.isAnimalToHeavy()).isFalse();
    }

    @Test
    void giveNormalRabbit_whenIsAnimalToHeavy_thenFalseIsReturned() {
        Rabbit rabbit = new Rabbit(new Weight(0.9, Measurement.KG), new Size(10, Measurement.CM));

        Assertions.assertThat(rabbit.isAnimalToHeavy()).isFalse();
    }

    @Test
    void giveToHeavyRabbit_whenIsAnimalToHeavy_thenFalseIsReturned() {
        Rabbit rabbit = new Rabbit(new Weight(1.5, Measurement.KG), new Size(10, Measurement.CM));

        Assertions.assertThat(rabbit.isAnimalToHeavy()).isTrue();
    }

    @Test
    void giveNormalFish_whenIsAnimalToHeavy_thenFalseIsReturned() {
        Fish fish = new Fish(new Weight(0.9, Measurement.KG), new Size(10, Measurement.CM));

        Assertions.assertThat(fish.isAnimalToHeavy()).isFalse();
    }

    @Test
    void giveReallyHeavyFish_whenIsAnimalToHeavy_thenFalseIsReturned() {
        Fish fish = new Fish(new Weight(2000, Measurement.KG), new Size(10, Measurement.CM));

        Assertions.assertThat(fish.isAnimalToHeavy()).isFalse();
    }

    @Test
    void testToStringForToHeavyCat() {
        Cat cat = new Cat(new Weight(20, Measurement.KG), new Size(19, Measurement.CM));

        Assertions.assertThat(cat.toString()).isEqualTo("Hey, I'm a Cat and I need to go and see the Weightwatchers" );
    }

    @Test
    void testToStringForAFish() {
        Fish fish = new Fish(new Weight(2000, Measurement.KG), new Size(10, Measurement.CM));

        Assertions.assertThat(fish.toString()).isEqualTo("Hey, I'm a Fish and I'm not Fat!" );
    }
}