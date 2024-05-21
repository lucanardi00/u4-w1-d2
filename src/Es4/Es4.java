package Es4;

import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dammi un numero");

        int numero = Integer.parseInt(scanner.nextLine());

        for (int i = numero; i >= 0; i--) {
            System.out.print(i);
        }
    }
}
