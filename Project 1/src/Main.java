import java.util.Scanner;
import java.util.Random;

public class Main{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] symbols = {"🐥","✨","👛","💍","💎"};
        int balance;
        int bet;
        String[] row;
        String PlayAgain = "yes";

        System.out.println("-----------------------\n"+"  JAVA CASINO!!\n"+"-----------------------");
        System.out.print("Enter your balance amount: ");
        balance = scanner.nextInt();
        if(balance <= 0){
            System.out.print("Invalid amount, please enter again: ");
            balance = scanner.nextInt();
        }
        do {
            System.out.print("Enter your bet amount: ");
            bet = scanner.nextInt();

            do {
                if (bet > balance) {
                    System.out.print("Insufficient balance, please enter an appropriate amount: ");
                    bet = scanner.nextInt();
                } else if (bet < 0) {
                    System.out.print("You've entered an invalid bet amount,please enter an appropriate bet: ");
                    bet = scanner.nextInt();
                }
            } while (bet < 0 || bet > balance);
            scanner.nextLine();
            int payout = 0;

            row = spin();
            System.out.println(" " + String.join(" | ", row));
            payout = pay(row,bet);
            if(payout>0){
                balance += payout;
                System.out.println("Congratulations!! You have received a payout of " + payout + "\nYour current balance is " + balance);
            }else{
                balance -= bet;
                System.out.println("You've Lost! Better luck next time!\nYour current balance is " + balance);
            }

            System.out.println();
            System.out.println("Would you like you play again?(yes or no): ");
            PlayAgain = scanner.nextLine().toLowerCase();
            while(!PlayAgain.equals("yes") && !PlayAgain.equals("no")){
                    System.out.println("Invalid Input\nWould you like you play again?(yes or no): ");
                    PlayAgain = scanner.nextLine().toLowerCase();
            }
            if(PlayAgain.equals("yes")){
                System.out.println("Very well, restarting game.....");
            }else if(PlayAgain.equals("no")){
                System.out.println("Thank you for playing with us, Here is your final balance: " + balance);
            }

        }while(PlayAgain.equals("yes"));

        scanner.close();
    }

    static String[] spin(){
        String[] symbols = {"🐥","✨","👛","💍","💎"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i=0;i<row.length;i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static int pay(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
                case "🐥" -> bet*3;
                case "✨" -> bet*6;
                case "👛" -> bet*9;
                case "💍" -> bet*12;
                case "💎" -> bet*15;
                        default -> 0;
            };
        }
        return 0;
    }
}



