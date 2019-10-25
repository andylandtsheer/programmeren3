package be.hogent.opdracht1.excercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntArrayManipulatorTest {

    @Test
    void sum() {
        Assertions.assertEquals(15,IntArrayManipulator.sum(new int[]{5,4,3,2,1}));
    }

    @Test
    void indexOf() {
        Assertions.assertEquals(1,IntArrayManipulator.indexOf(new int[]{5,4,3,2,1},4));
        Assertions.assertEquals(-1,IntArrayManipulator.indexOf(new int[]{5,4,3,2,1},6));
    }

    @Test
    void findGreatest() {
        Assertions.assertEquals(5,IntArrayManipulator.findGreatest(new int[]{5,4,3,2,1}));
        Assertions.assertEquals(10,IntArrayManipulator.findGreatest(new int[]{5,10,4,3,2,1}));
    }
}