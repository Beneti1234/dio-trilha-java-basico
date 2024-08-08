public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTV = new SmartTv();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("canal atual? " + smartTV.canal);
        System.out.println("volume atual? " + smartTV.volume);

        smartTV.ligar ();
        System.out.println("Novo status -> Tv ligada? " + smartTV.ligada);

        smartTV.desligar ();
        System.out.println("Novo status -> Tv ligada? " + smartTV.ligada);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume atual: " + smartTV.volume);
        
        smartTV.mudarCanal(32);
        System.out.println("Novo Canal: " + smartTV.canal);
    }
}
