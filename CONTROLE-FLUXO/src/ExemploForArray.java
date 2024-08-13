public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Carol", "Gabriel", "Guilherme"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno da posição " + x + " é " + alunos[x]);
        }

        //OU

        for (String aluno : alunos) {
            System.out.println("Aluno atual é: " + aluno);
        }
    }
}
