package escola;

public class Escola {
    public static void main(String[] args) {
        aluno felipe = new aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(30);
        System.out.println("O nome é " + felipe.getNome() + " e tem " + felipe.getIdade());
    }
}
