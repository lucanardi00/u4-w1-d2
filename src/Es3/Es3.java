package Es3;

import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci parola");
            String input = scanner.nextLine();

            if (input.equals(":q")) {
                System.out.print("Uscito");
                break;
            }

            char[] chars = input.toCharArray();

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < chars.length; i++) {

                result.append(chars[i]);
                if (i < chars.length - 1) {
                    result.append(",");
                }

            }

            System.out.print(result.toString());
        }
    }
}
