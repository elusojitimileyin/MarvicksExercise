package JavaChapersTest.Chaper15.Stream;

import java.io.IOException;
import java.io.PrintStream;

public class Stream1 {
    public static void main(String[] args) {
    System.out.println();
            try{
                PrintStream printStream = new PrintStream("C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\JavaChapersTest\\Chaper15\\Stream\\samples.txt");
                printStream.println("There is a problem");
            }catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
    }
}
