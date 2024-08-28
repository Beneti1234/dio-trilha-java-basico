

public class Iphone implements ReprodutorMusical, Navegador, LigacoesEMensagensApp {
    public void playMusicas(String musica) {
        System.out.println("Tocando musica " + musica);
    }
    public void pausarMusicas() {
        System.out.println("Musica pausada");
    }
    public void parar() {
        System.out.println("Musica suspendida");
    }
    
    public void ligarContatos(String numeroTelefone) {
        System.out.println("Realizando a chamada para " + numeroTelefone);
    }
    public void receberLigacao() {
        System.out.println("Recebendo chamada");
    }
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem para " + mensagem);
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    
    public void acessarSite(String url) {
        System.out.println("Entrando no site " + url);
    }
    public void voltarSite() {
        System.out.println("retornando a página anterior");
    }
    public void pesquisar(String url) {
        System.out.println("Verificando pesquisa " + url);
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.playMusicas("Dias de luta, Dias de glória");
        iphone.pausarMusicas();
        iphone.parar();

        iphone.ligarContatos("Rogério");
        iphone.receberLigacao();
        iphone.enviarMensagem("Dieguinho do grau");
        iphone.receberMensagem();

        iphone.acessarSite("https://www.google.com");
        iphone.voltarSite();
        iphone.pesquisar("https://github.com/Beneti1234");
    }
}