package JavaChapersTest.ClassExamples;

import java.util.ArrayList;
import java.util.HashMap;


public class ReverseStatement {


    public static String reverseWord(String word) {
        String reversedWord = "";
        StringBuilder reversed = new StringBuilder();
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (!(c == ' ' || c == '\t')) {
                reversed.append(c);
            } else {
                words.add(reversed.toString());
                reversed = new StringBuilder();
            }


        }
        words.add(reversed.toString());
        for (int i = 0; i < words.size(); i++) {
            reversedWord += words.get(words.size() - i - 1) + " ";
        }

        return reversedWord.trim();
    }


    public static int[] outputNumberPositionFromLargestToSmallestOfAnInput(int[] inputArray) {
        int largestNumber = inputArray[0];
        int largestNumberPosition = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > largestNumber) {
                largestNumber = inputArray[i];
                largestNumberPosition = i;
            }
        }
        int[] outputArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = inputArray[inputArray.length - i - 1];
        }
        return outputArray;
    }

    public static int[] addOneToTheLastIndexOfAndArrayInput(int[] inputArray) {
        for (int index = inputArray.length - 1; index >= 0; index--) {
            if (inputArray[index] < 9) {
                inputArray[index] += 1;
                return inputArray;
            } else {
                inputArray[index] = 0;
            }
        }
        int[] newArray = new int[inputArray.length + 1];
        newArray[0] = 1;
        return newArray;
    }

    public static int[] getTheMeanOfNumbersInAnArray(int[] inputArray) {
        int[] meanArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            meanArray[inputArray[i]] += 1;
        }
        int mean = 0;
        for (int i = 0; i < meanArray.length; i++) {
            if (meanArray[i] > mean) {
                mean = meanArray[i];
            }
        }
        return new int[]{mean};
    }

    public static int[] getTheModeOfNumbersInAnArray(int[] inputArray) {
        int maxCount = 0;
        int mode = 0;

        for (int i = 0; i < inputArray.length; i++) {
            int count = 0;
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[j] == inputArray[i]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = inputArray[i];
            }
        }

        return new int[]{mode};
    }


    public static int addTwoNumbersWithoutThePlusOperator(int firstNumber, int secondNumber) {
        int sum = firstNumber - (-secondNumber);
        return sum;
    }


    public static HashMap<Object, Object> displayTheNumberOfElementPresent(int[] inputArray) {

        HashMap<Object, Object> newMap = new HashMap<>();

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) ;
            }
            newMap.keySet();
        }
        return newMap;


    }
}