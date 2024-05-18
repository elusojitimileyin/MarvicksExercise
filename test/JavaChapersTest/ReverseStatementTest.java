package JavaChapersTest;

import JavaChapersTest.ClassExamples.ReverseStatement;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStatementTest {


    @Test
    void testReverseStatement() {
        ReverseStatement reverseStatement = new ReverseStatement();
            String words = "It is still a beautiful world";
            String reverse = "world beautiful a still is It";

            assertEquals(reverse, reverseStatement.reverseWord(words));

    }

    @Test
    void testReturnArrayPositionWithDescendingInputArray() {
        int[] inputArray = {10, 9, 8};
        int[] arrayOutputPosition = {1, 2, 3};


        assertArrayEquals(arrayOutputPosition, ReverseStatement.outputNumberPositionFromLargestToSmallestOfAnInput(inputArray));
    }

    @Test
    void testAddOneToTheLastIndexOfAndArrayInput() {
        int[] inputArray = {2,4,0,9,9};

        int[] arrayOutputPosition = {2,4,1,0,0};


        assertArrayEquals(arrayOutputPosition, ReverseStatement.addOneToTheLastIndexOfAndArrayInput(inputArray));
    }

    @Test
    void testToGetTheMeanOfNumbersInAnArray() {
        int[] inputArray = {1,1,2,2,2,2,5,5,5,5,5,5,5,5,};

        int[] arrayOutputPosition = {8};


        assertArrayEquals(arrayOutputPosition, ReverseStatement.getTheMeanOfNumbersInAnArray(inputArray));
    }

    @Test
    void testToGetTheModeOfNumbersInAnArray() {
        int [] inputArray = {1,1,2,2,4,4,4,4,4,};

        int[] arrayOutputPosition = {4};


        assertArrayEquals(arrayOutputPosition, ReverseStatement.getTheModeOfNumbersInAnArray(inputArray));
    }

    @Test
    void testAddTwoNumbersWithoutThePlusOperator() {
        int firstNumber = 2;
        int secondNumber = 1;
        int sum = 3;
        assertEquals(sum, ReverseStatement.addTwoNumbersWithoutThePlusOperator( firstNumber, secondNumber));
    }
    @Test
    void testAddTwoNumbersWithoutThePlusOperator2() {
        int firstNumber = -2;
        int secondNumber = -1;
        int sum = -3;
        assertEquals(sum, ReverseStatement.addTwoNumbersWithoutThePlusOperator( firstNumber, secondNumber));
    }


//    @Test
//    void testToDisplayTheNumberOfElementPresent() {
//        String inputArray = "[1,2,2,1,3]";
//
//         HashMap<> Output = {"1" : 2, "2" : 2, "3" : 1};
//
//
//        assertArrayEquals(Output, ReverseStatement.getTheModeOfNumbersInAnArray(inputArray));
//    }
}