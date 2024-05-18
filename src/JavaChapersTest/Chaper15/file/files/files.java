package JavaChapersTest.Chaper15.file.files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class files {
//    java.io and java.nio

    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\DataStructureArray\\");


            try (DirectoryStream<Path> directoryStream =
                         Files.newDirectoryStream(path)){
                directoryStream.forEach(System.out::println);
            }catch (IOException exception){
                System.err.println(exception.getMessage());
                exception.printStackTrace();
            }}
    }
//
//       DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
//        directoryStream.forEach((Consumer<? super Path>) path);
//    }catch (IOException exception){
//            exception.printStackTrace();
//    }

//        try{
//        Path path = Paths.get("C:\\Users\\DELL\\IdeaProjects\\mavericksExercise\\src\\DataStructureArray\\mavericksExercise.txt");
//
//        Files.createFile(path);
//    }catch (IOException exception){
//
//            exception.printStackTrace();
//        }
//        }

