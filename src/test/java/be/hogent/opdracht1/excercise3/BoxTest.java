package be.hogent.opdracht1.excercise3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {
    @Test
    void putItemInBox() {
        Item item = new Item("television", 15 );
        Box box = new Box("doos" , 5);
        box.putItemInBox(item);

        Assertions.assertThat(box.getWeight()).isEqualTo(20);
    }

    @Test
    void takeItemOutBox() {
        Item item = new Item("television", 15 );
        Box box = new Box("doos" , 5);
        box.putItemInBox(item);
        box.takeItemOutBox();
        Assertions.assertThat(box.getWeight()).isEqualTo(5);
    }
}