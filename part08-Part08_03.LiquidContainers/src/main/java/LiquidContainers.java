
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/" + 100);
            System.out.println("Second: " + secondContainer + "/" + 100);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            if(command.equals("add")) {
                if (Integer.valueOf(parts[1]) > 0) {
                    if ((Integer.valueOf(parts[1]) + firstContainer) > 100) {
                        firstContainer = 100;
                    } else {
                        firstContainer += Integer.valueOf(parts[1]);
                    }
                }
            } else if (command.equals("move")) {
                if (firstContainer !=  0 && Integer.valueOf(parts[1]) > 0) {
                    if ((firstContainer - Integer.valueOf(parts[1])) < 0) {
                        secondContainer += firstContainer;
                        firstContainer = 0;
                    } else if ((Integer.valueOf(parts[1]) + secondContainer) > 100) {
                        firstContainer -= Integer.valueOf(parts[1]);
                        secondContainer = 100;
                    } 
                    else {
                        firstContainer -= Integer.valueOf(parts[1]);
                        secondContainer += Integer.valueOf(parts[1]);
                    }
                }
            } else if (command.equals("remove")) {
                if (Integer.valueOf(parts[1]) > 0) {
                    if ((secondContainer - Integer.valueOf(parts[1])) < 0) {
                        secondContainer = 0;
                    } else {
                        secondContainer -= Integer.valueOf(parts[1]);
                    }
                }
            }
        }
    }

}
