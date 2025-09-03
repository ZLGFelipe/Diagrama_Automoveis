import java.util.Date;

public class Contrato {
    private Veiculo veiculo;
    private Date dataRetirada;
    private Date dataDevolucao;

    public Contrato(Veiculo veiculo, Date dataRetirada, Date dataDevolucao) {
        this.veiculo = veiculo;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }

    public Veiculo alugado() {
        return veiculo;
    }

    public Date dataRetirada() {
        return dataRetirada;
    }

    public Date dataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
