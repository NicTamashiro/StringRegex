package RemovendoEspacosEmBranco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Nome sem espacos: " + nome.trim());
        scanner.close();
    }
}
