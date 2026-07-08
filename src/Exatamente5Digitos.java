import java.util.Scanner;

public class Exatamente5Digitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String digitos = scanner.nextLine();

        String regex = "^\\d{5}$";

        if (digitos.matches(regex)){
            System.out.println("Valido");
        } else {
            System.out.println("Invalido");
        }
    }
}
