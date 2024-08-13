import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada > 0) {
            Double valorDoce = ValorAleatorio();
            
            /*if (valorDoce > mesada);
                valorDoce = mesada;*/

            System.out.println("Valor do doce " + valorDoce + " adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Jonas gastou toda sua mesada!");
    }

    private static double ValorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
