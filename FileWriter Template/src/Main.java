import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static void main(String[] args) {

        String path = "C:\\Users\\udayc\\OneDrive\\Desktop\\text.txt";
        String content = "I like games!\nI love playing them\nI am particularly fond of Dark Souls!!";

        try(FileWriter writer = new FileWriter(path)){
            writer.write(content);
            System.out.println("File is written!");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not find file.");
        }
        catch(IOException e){
            System.out.println("Could not write to file.");
        }


    }
}
