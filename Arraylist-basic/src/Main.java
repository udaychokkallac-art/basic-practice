import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the no.of food items: ");
        int numOfItems = scanner.nextInt();
        scanner.nextLine();//to remove the line that won't be copied in nextInt

        for(int i=0;i<numOfItems;i++){
            System.out.print("Enter food item #" + (i+1) + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }
        System.out.println(foods);

        scanner.close();
    }
}
