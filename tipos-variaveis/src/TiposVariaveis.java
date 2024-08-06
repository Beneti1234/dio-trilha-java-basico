public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        String meuNome = "GABRIEL BENETI";
        
        double SalarioMinimo = 2.500;
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 98765432109L;
        float pi = 3.14F;
        System.out.println("Hello, World!");

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14F;
    }
}

//tipos e Variaveis Java
short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numeroNormal;