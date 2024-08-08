public class Operadores {
    
    public static void main(String[] args) {

        //Operadores - 2
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        //Operadores - 3
        int numero = 5;

        numero = - numero;

        System.out.println(numero);
        
        numero = numero * -1;

        System.out.println(numero);

        //x repetição - Operadores - 4
        System.out.println( numero -- );

        System.out.println(numero);

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        //Operadores - 5
        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado);

        //Operadores - 6
        String nomeUm = "GABRIEL";
        String nomeDois = new String("GABRIEL");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2) {
            System.out.println("a nossa condição é verdadeira!");
        }

        System.out.println("numeroUm é igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente do numeroDois?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que o numeroDois?" + simNao);

        //Operadores - 7
        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && ( 7 > 4 ) ) {
            System.out.println("As duas condições são verdadeiras!");
        }

        if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira!");
        }

        System.out.println("Fim!");
    }

}
