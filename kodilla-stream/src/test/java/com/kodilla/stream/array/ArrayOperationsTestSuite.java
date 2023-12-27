package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import stream.array.ArrayOperations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
//        Given
        int[] numbers = {2,3,5,21,4,56,3,26,37,10,11,22,31,41,15,16,41,42,50,8};
//        When
        double average = ArrayOperations.getAverage(numbers);
//        Then
        assertEquals(22.2, average, 0.001);


    }
}
