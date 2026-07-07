package ConvertingToUpperAndLower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String entrada = scanner.nextLine();

        String maiusculas = entrada.toUpperCase();
        String minusculas = entrada.toLowerCase();

        System.out.println("Texto em maiusculas: " + maiusculas);
        System.out.println("Texto em minusculas: " + minusculas);

        scanner.close();
    }
}
