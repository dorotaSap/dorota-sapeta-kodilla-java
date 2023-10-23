package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTest {
    @Test
    void testProbablyIWillThrowException(){
//        Given
        SecondChallenge secondChallenge = new SecondChallenge();
//        When i  Then
        assertAll("Test probablyWillThrowException",
                () -> assertEquals("Done!", secondChallenge.probablyIWillThrowException(1.0, 2.0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5, 1.0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.0, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(Double.MIN_VALUE, Double.MIN_VALUE)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(Double.MAX_VALUE, Double.MAX_VALUE)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.0, 1.5))
                );
    }
}
