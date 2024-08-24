public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("123455332", "Marcos");
        
        marcos.setEndereco("Rua das marias");
        
        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
