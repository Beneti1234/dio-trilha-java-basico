public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("G4F3C23");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("DER3G345");
        z400.ligar();
    }
}