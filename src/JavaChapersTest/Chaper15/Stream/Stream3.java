package JavaChapersTest.Chaper15.Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Stream3 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\JavaChatpersTest\\Chaper15\\file\\files\\samples.txt";
        try{
            FileOutputStream fileOutputStream =
                    new FileOutputStream(fileLocation);
            fileOutputStream.write("Money is very key, 100%".getBytes());
//            var  inputStream = new FileInputStream(fileLocation);
//            var dataInputStream = new DataInputStream(inputStream);
//            byte[] fileData = dataInputStream.readAllBytes();
//            System.out.println(new String(fileData));

    }catch(IOException e){
            e.printStackTrace();
        System.err.println("Error:" + e.getMessage());
        }
    }
}
