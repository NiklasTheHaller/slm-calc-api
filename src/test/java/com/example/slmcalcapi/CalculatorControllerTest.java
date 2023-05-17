package com.example.slmcalcapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    @Test
    void sumTest1(){
        // Arrange
        CalculatorController calculatorController = new CalculatorController();

        int a = 5;
        int b = 4;

        // Act
        int result = calculatorController.sum(a, b);

        // Assert
        assertEquals(9, result);

    }

    @Test
    void sumTest2(){
        CalculatorController calculatorController = new CalculatorController();

        int a = -10;
        int b = 10;

        int result = calculatorController.sum(a, b);

        assertEquals(0, result);
    }

    @Test
    void productTest(){
        CalculatorController calculatorController = new CalculatorController();

        int a = 4;
        int b = 5;

        int result = calculatorController.product(a, b);

        assertEquals(20, result);

    }

    @Test
    void suubtractTest(){
        CalculatorController calculatorController = new CalculatorController();

        int a = 4;
        int b = 5;

        int result = calculatorController.subtract(a, b);

        assertEquals(-1, result);

    }


}