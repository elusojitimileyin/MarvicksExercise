package JavaChapersTest.Chaper15.Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Stream4Addition {
    public static void main(String[] args) {
    String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\JavaChapersTest\\Chaper15\\Stream\\samples.txt";
        try{
        FileOutputStream fileOutputStream =
                new FileOutputStream(fileLocation,true);
        String data = "\n more money";
        fileOutputStream.write(data.getBytes());

    }catch(
    IOException e){
        e.printStackTrace();
        System.err.println("Error:" + e.getMessage());
    }
}
}
