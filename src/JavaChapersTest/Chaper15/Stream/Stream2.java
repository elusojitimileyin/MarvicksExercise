package JavaChapersTest.Chaper15.Stream;

import java.io.IOException;
import java.io.PrintStream;

public class Stream2 {
    public static void main(String[] args) {
        String fileLocation ="C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\JavaChatpers\\files\\samples.txt";
        try {
            PrintStream printStream = new PrintStream(fileLocation);
            System.setOut(printStream);
            System.out.println("Hello World");


        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
