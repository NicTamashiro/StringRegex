import java.util.Scanner;

public class PalavraComEntre3E10Letras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();

        String regex = "^[A-Za-z]{3,10}$";

        if(palavra.matches(regex)){
            System.out.println("Valido");
        } else {
            System.out.println("Invalido");
        }
    }
}
