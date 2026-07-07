package ValidandoCpf;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o CPF: ");
        String cpf = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
        Matcher matcher = pattern.matcher(cpf);

        if(matcher.matches()){
            System.out.println("o CPF " + cpf + " está no formato válido.");
        } else {
            System.out.println("o CPF " + cpf + " nao está no formato válido.");
        }

        scanner.close();
    }
}
