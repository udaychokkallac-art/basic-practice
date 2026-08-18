import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int count;

        System.out.println("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.println("What is the price of the item?(in $): ");
        price = scanner.nextDouble();

        System.out.println("How many " + item + "s would you like to buy?: ");
        count = scanner.nextInt();

        double total = count*price;
        System.out.printf("You have bought %d %s(s)\nThe total price is $%.2f", count, item, total);

        scanner.close();
    }
}
