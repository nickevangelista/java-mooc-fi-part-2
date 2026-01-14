
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            if (command.equals("add")) {
                firstContainer.add(Integer.valueOf(parts[1]));
            } else if (command.equals("remove")) {
                secondContainer.remove(Integer.valueOf(parts[1]));
            } else if (command.equals("move")) {
                int amount = Integer.valueOf(parts[1]);
                if (amount > 0) {
                    int currentAmount = firstContainer.contains();
                    if (currentAmount < amount) {
                        amount = currentAmount;
                    }
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                }
            }

        }
    }

}
