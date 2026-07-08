import java.util.Scanner;

public class SimOuNao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();

        String regex = "^(não|sim)$";

        if(texto.matches(regex)){
            System.out.println("Valido");
        } else {
            System.out.println("Invalido");
        }
    }
}
