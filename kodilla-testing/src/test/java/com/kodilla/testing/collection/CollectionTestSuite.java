package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import javax.swing.plaf.TableHeaderUI;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionTestSuite {
    private OddNumbersExterminator exterminator;

    @BeforeEach
    public void before (){
        exterminator = new OddNumbersExterminator();
    }
    @AfterEach
    public void after(){
        exterminator = null;
    }
@DisplayName("Testing Odd Numbers Exterminator with an empty list")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        List<Integer> inputNumbers = new ArrayList<>();
        List<Integer> evenNumbers = exterminator.exterminate(inputNumbers);

        Assertions.assertEquals(0, evenNumbers.size());
    }

@DisplayName("Testing Odd Numbers Exterminator with a normal list")

    @Test
    public void testOddNumberExterminatorNormalList() {
//        Given
        List<Integer> inputNumbers = new ArrayList<>();
//        When
        inputNumbers.add(1);
        inputNumbers.add(2);
        inputNumbers.add(3);
        inputNumbers.add(4);
        inputNumbers.add(5);
        inputNumbers.add(6);

        List<Integer> evenNumbers = exterminator.exterminate(inputNumbers);

        List<Integer> expectedEvenNumbers = new ArrayList<>();
        expectedEvenNumbers.add(2);
        expectedEvenNumbers.add(4);
        expectedEvenNumbers.add(6);
//      Then
        Assertions.assertEquals(expectedEvenNumbers, evenNumbers);
    }
}
