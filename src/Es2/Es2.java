package Es2;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dammi un numero");

        int numero = Integer.parseInt(scanner.nextLine());

        switch (numero) {
            default: {
                System.out.print("Il numero non è compreso tra 0 e 3");
                break;
            }
            case 0: {
                System.out.print("Zero");
                break;
            }
            case 1: {
                System.out.print("Uno");
                break;
            }
            case 2: {
                System.out.print("Due");
                break;
            }
            case 3: {
                System.out.print("Tre");
                break;
            }
        }
    }
}
