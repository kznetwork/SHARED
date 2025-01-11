package com.samsung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreCollectionTest {

    @Test
    void answersArithmeticMeanOfTwoNumbers() {
        // Arrange
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        // Act
        int actualResult = collection.arithmeticMean();

        // Assert
        assertEquals(6, actualResult);
    }
}
