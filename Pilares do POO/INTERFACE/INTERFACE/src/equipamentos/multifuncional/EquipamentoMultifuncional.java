package equipamentos.multifuncional;
import equipamentos.digitalizadora.*;

public class EquipamentoMultifuncional implements  Copiadora, Digitalizadora, impressora {
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }
    public void digitalizar() {
        System.out.println("digitalizando via equipamento multifuncional");
    }
    public void imprimir() {
        System.out.println("imprimindo via equipamento multifuncional");
    }
}
