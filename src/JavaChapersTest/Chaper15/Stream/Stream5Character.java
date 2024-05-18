package JavaChapersTest.Chaper15.Stream;

import java.io.FileReader;
import java.io.IOException;

public class Stream5Character {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\JavaChatpersTest\\Chaper15\\file\\files\\samples.txt";
        char[] fileChars = new char[1024];
        try(FileReader fileReader = new FileReader(fileLocation)){
        int length = fileReader.read(fileChars);
        displayFileContent(length, fileChars);
    }catch (IOException e){


            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void displayFileContent(int length, char[] fileChars) {
        for (int counter = 0; counter < length; counter++) {
            System.out.print(fileChars[counter]);
        }
    }
    }
