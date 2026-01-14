
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTotal = 0, numCount=0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num > 0) {
                numTotal += num;
                numCount += 1;
            }
            if (num == 0) {
                break;
            }
        }
        if (numCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((float)numTotal/numCount);
        }
    }
}
