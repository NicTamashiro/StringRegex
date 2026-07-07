package SubstituindoParteString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();
        System.out.println("Digite a palavra a ser substituída: ");
        String substituida = scanner.nextLine();

        if (!texto.contains(substituida)) {
            System.out.println("Palavra não encontrada.");
            scanner.close();
            return;
        }

        System.out.println("Digite a nova palavra: ");
        String novaPalavra = scanner.nextLine();

        String novoTexto = texto.replace(substituida, novaPalavra);

        System.out.println("Texto modificado: " + novoTexto);

        scanner.close();
    }
}
