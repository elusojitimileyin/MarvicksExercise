package JavaChapersTest.Chaper15.file.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\JavaChatpersTest\\Chaper15\\Stream\\Stream.txt");

            Files.createFile(path);
        } catch (
                IOException exception) {

            exception.printStackTrace();
        }
    }
}