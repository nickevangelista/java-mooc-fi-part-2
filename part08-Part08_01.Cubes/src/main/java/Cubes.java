
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String answer = String.valueOf(scanner.nextLine());
            if (answer.equals("end")) {
                break;
            }
            int numero = Integer.parseInt(answer);
            numero = numero*numero*numero;
            System.out.println(numero);
        }
    }
}
