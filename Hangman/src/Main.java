import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static String hangman(int wrongGuess){
        return switch(wrongGuess){
            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                       o   
                    
                    
                    """;
            case 2 -> """
                       o
                      / 
                    
                    
                    """;
            case 3 -> """
                       o
                      /|
                    
                    
                    """;
            case 4 -> """
                       o
                      /|\\
                    
                    
                    """;
            case 5 -> """
                       o
                      /|\\
                      /
                    
                    
                    """;
            case 6 -> """
                       o
                      /|\\
                      / \\
                    
                    
                    """;
            default -> throw new IllegalStateException("Unexpected value: " + wrongGuess);
        };
    }

    static void main(String[] args) {

        String filepath = "src/words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line = br.readLine())!= null){
                words.add(line.trim());
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            System.out.println("Error reading file");
        }
        System.out.println(words);

        Random rand = new Random();
        String word = words.get(rand.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuess = 0;

        for(int i=0; i<word.length(); i++){
            wordState.add('_');
        }

        System.out.println("=======================================");
        System.out.println("     Welcome to HANGMAN game!!!        ");
        System.out.println("=======================================");

        while(wrongGuess <6){
            System.out.println("The word: ");
            for(char c: wordState){
                System.out.print(c + " ");
            }
            System.out.print("\nEnter your guess:");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) != -1) {
                System.out.println("Your guess is correct");
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }
            } else {
                System.out.println("Your guess is incorrect");
                wrongGuess++;
            }
            System.out.println(hangman(wrongGuess));
            if(!wordState.contains('_')){
                System.out.println(hangman(wrongGuess));
                System.out.println("YOU WIN!!");
                System.out.println("The word is " + word);
                break;
            }

        }

        if(wrongGuess>=6){
            System.out.println(hangman(wrongGuess));
            System.out.println("GAME OVER");
            System.out.println("The word was \"" +  word + "\"");
        }
        scanner.close();
    }
}
