public class Carro extends Veiculo {
   

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void confereCombustivel() {
        System.out.println("COnferindo combustível");
    }
    private void confereCambio() {
        System.out.println("Conferindo câmbio");
    }
}
