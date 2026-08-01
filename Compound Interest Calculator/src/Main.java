import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount;
        double principal;
        double rate;
        int comp_times;
        int years;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest: ");
        rate = scanner.nextDouble();

        System.out.print("Enter the no.of times Compounded each year: ");
        comp_times = scanner.nextInt();

        System.out.print("Enter the no.of years: ");
        years = scanner.nextInt();

        amount = principal*(Math.pow(1+(rate/100*comp_times), years*comp_times));

        System.out.println("The amount after " + years + " years is $" + amount + ".");

        scanner.close();
    }
}
