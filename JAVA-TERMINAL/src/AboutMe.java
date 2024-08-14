
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main (String[] args) {

        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite eu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
        System.out.println("Minha idade é " + idade);
        System.out.println("Tenho " + altura + " de altura");
        scanner.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Informações inválidas");
        }
    }


}
