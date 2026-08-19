import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\udayc\\OneDrive\\Desktop\\text.txt";

        try(BufferedReader reader =  new BufferedReader(new FileReader(path))){
            System.out.println("This file exists");
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }

        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("Error opening file");
        }
    }
}
