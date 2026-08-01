import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adj1;
        String noun1;
        String adj2;
        String verb1;
        String adj3;

        System.out.println("Enter an adjective(description): ");
        adj1 = scanner.nextLine();
        System.out.println("Enter a noun(animal or place): ");
        noun1 = scanner.nextLine();
        if(!noun1.isEmpty()){
            noun1 = noun1.substring(0,1).toUpperCase() + noun1.substring(1).toLowerCase();
        }

        System.out.println("Enter an adjective(description): ");
        adj2 = scanner.nextLine();
        System.out.println("Enter a verb that ends with -ing: ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective(action): ");
        adj3 = scanner.nextLine();

        System.out.println("Today I went to a " + adj1 + " zoo.\nIn an exhibit, I saw a " +
                noun1 + ".\n"+ noun1 + " was very " + adj2 + " and " + verb1 + "!\nI was very " + adj3);

        scanner.close();

    }
}
