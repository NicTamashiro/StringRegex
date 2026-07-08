import java.util.Scanner;

public class StringSoMinusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        String regex = "^[a-z]+";
        if(palavra.matches(regex)){
            System.out.println("Todas as letras sao minusculas");
        } else {
            System.out.println("Todas as letras nao sao minusculas");
        }


    }
}
