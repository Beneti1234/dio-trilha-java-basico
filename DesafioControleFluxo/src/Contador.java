import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o parâmetro um:");
        int parametroUm = terminal.nextInt(); 
        System.out.println("Digite o parâmetro dois:");
        int parametroDois = terminal.nextInt(); 
        
        try {
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        } finally {
            terminal.close(); 
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro tem que ser maior que o primeiro");
        }
        
        int contagem = parametroDois - parametroUm;
        
        for (int i = 1; i <= contagem; i++) {
            System.out.println(" número " + i);
        }
    }
}

