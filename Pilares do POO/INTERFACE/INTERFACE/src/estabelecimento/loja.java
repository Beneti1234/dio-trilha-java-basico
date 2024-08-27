package estabelecimento;

import equipamentos.impressora.Deskjet;
import equipamentos.impressora.impressora;

public class loja {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();
        impressora.imprimir();
    }
}
