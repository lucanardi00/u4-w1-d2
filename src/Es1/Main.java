package Es1;

public class Main {
    public static <Int> void main(String[] args) {
        String parola = "Parola";

        if (parola.length() % 2 == 0) {
            System.out.print("Pari");
        } else {
            System.out.print("Dispari");
        }

        int anno = 1800;

        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                if (anno % 400 == 0) {
                    System.out.print("Anno Bisestile");
                } else {
                    System.out.print("Anno Non Bisestile");
                }
            }
        } else {
            System.out.print("Anno Non Bisestile");
        }
    }
}
