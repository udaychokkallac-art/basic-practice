import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String song1 = "src\\Lady_Brown.wav";
        File file = new File(song1);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while(!response.equals("Q")){
                System.out.println("P(Play)");
                System.out.println("S(Stop)");
                System.out.println("R(Reset)");
                System.out.println("Q(Quit)");
                System.out.print("Enter your response: ");

                response = scanner.next().toUpperCase();

                switch(response){
                    case "P"-> clip.start();
                    case "S"-> clip.stop();
                    case "R"-> {clip.stop();
                              clip.setMicrosecondPosition(0);}
                    case "Q"-> clip.close();
                    default -> System.out.println("Invalid response");
                }
            }
        }

        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (LineUnavailableException e) {
            System.out.println("unable to access audio file");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file not supported");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Quitting program");
            scanner.close();
        }
    }
}
