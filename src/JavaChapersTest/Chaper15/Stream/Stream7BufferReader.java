package JavaChapersTest.Chaper15.Stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class Stream7BufferReader {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\JavaChatpers\\files\\samples.txt";
        try
                (FileInputStream fileInputStream = new FileInputStream(fileLocation)){
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                System.out.println(bufferedReader.lines().collect(Collectors.joining("\n")));

        }catch(IOException e){
            System.err.println("error: " + e.getMessage());

        }
    }
}