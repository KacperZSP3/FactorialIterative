import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie liczby n
        System.out.print("Podaj liczbę n: ");
        int n = scanner.nextInt();

        // Obliczanie silni iteracyjnie
        long silnia = 1;
        for (int i = 1; i <= n; i++) {
            silnia *= i;
        }

        // Wyświetlenie wyniku
        System.out.println(n + "! = " + silnia);

        scanner.close();
    }
}