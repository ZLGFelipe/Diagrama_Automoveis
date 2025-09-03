import java.util.Date;

public class Cliente extends Pessoa {
    private Contrato[] alugueis;
    private int qtdAlugueis;

    public Cliente(String nome, int maxAlugueis) {
        this.alugueis = new Contrato[maxAlugueis];
        this.qtdAlugueis = 0;
    }

    // Criar novo contrato ao alugar veículo
    public boolean alugar(Veiculo v) {
        if (qtdAlugueis < alugueis.length) {
            alugueis[qtdAlugueis] = new Contrato(v, new Date(), null);
            qtdAlugueis++;
            return true;
        }
        return false;
    }
}
