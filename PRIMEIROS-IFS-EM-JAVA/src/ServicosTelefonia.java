import java.util.Scanner;

public class ServicosTelefonia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String servico = scanner.nextLine().toLowerCase();
        
        String entradaCliente = scanner.nextLine();
        
        String[] partes = entradaCliente.split(",");
        boolean contratado = false;
        for (String servicov : partes) {
          if (servicov.toLowerCase().equals(servico)) {
          contratado = true;
          break;
          }
        }
        
        scanner.close();
        System.out.println(contratado ? "Sim" : "Não");
    }
    
    
}
