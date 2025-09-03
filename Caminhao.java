import java.util.Date;
public class Caminhao extends Veiculo {
    int capacidade;

    Caminhao(String marca, Date dataProducao, double potencia, int capacidade) {
        this.marca = marca;
        this.potencia = potencia;
        this.capacidade = capacidade;
        this.dataProducao = dataProducao;
    } 

    @Override
    public int deslocar() {
        System.out.println("Caminhão " + marca + " está se deslocando.");
        return capacidade;
    }

    // Método transportar
    public int transportar() {
        System.out.println("Caminhão " + marca + " transportando carga de capacidade " + capacidade + " kg.");
        return capacidade;
    }

    // Sobrecarga do método transportar
    public int transportar(int quantidade) {
        if (quantidade <= capacidade) {
            System.out.println("Caminhão " + marca + " transportando " + quantidade + " kg.");
            return quantidade;
        } else {
            System.out.println("Capacidade excedida! Máximo permitido: " + capacidade + " kg.");
            return capacidade;
        }
    }
}
