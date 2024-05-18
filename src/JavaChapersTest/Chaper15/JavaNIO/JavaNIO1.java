package JavaChapersTest.Chaper15.JavaNIO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaNIO1 {
    public static void main(String[] args) {
        String location = "C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\JavaChapersTest\\Chaper15\\JavaNIO\\javaNioSample.txt";
        Path path = Paths.get(location);
        try {
            BufferedWriter writer = Files.newBufferedWriter(path);
            writer.write("Happy Married life, BJ");
            writer.close();
        } catch (IOException exception ) {
            System.err.println(exception.getMessage());

        }

    }
}
