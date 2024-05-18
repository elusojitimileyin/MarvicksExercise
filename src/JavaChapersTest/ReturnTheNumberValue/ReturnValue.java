package JavaChapersTest.ReturnTheNumberValue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReturnValue {

    public static int returnTheNumberOfDigitInTheFile(String input) throws IOException {

        int count = 0;
        Path path = Paths.get(input);
        String fileContent = Files.readString(path);
    for (int i = 0; i < fileContent.length(); i++){
        if (String.valueOf(fileContent.charAt(i)).matches("\\d"));
        count++;
        }
    return count;
    }


    public static int returnTheNumberOfSentenceInTheFile(String input) throws IOException{

        int count = 0;
        Path path = Paths.get(input);
        String fileContent = Files.readString(path);
        for (int i = 0; i < fileContent.length(); i++){
            if (String.valueOf(fileContent.charAt(i)).matches("\\."))
            count++;
        }
return count;
    }
}
