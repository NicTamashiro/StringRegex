import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComecaComWww {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();

        Pattern pattern = Pattern.compile("^www\\.");
        Matcher matcher = pattern.matcher(texto);

        if(matcher.find()){
            System.out.println("Comeca com www.");
        }
    }
}
