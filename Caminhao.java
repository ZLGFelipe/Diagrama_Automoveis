public class Caminhao extends Veiculo {
    int capacidade;

    Caminhao(String nome, double potencia, int capacidade) {
        this.nome = nome;
        this.potencia = potencia;
        this.capacidade = capacidade;
    } 

    @Override
    public int deslocar() {
        System.out.println("Caminhão " + nome + " está se deslocando.");
        return capacidade;
    }

    // Método transportar
    public int transportar() {
        System.out.println("Caminhão " + nome + " transportando carga de capacidade " + capacidade + " kg.");
        return capacidade;
    }

    // Sobrecarga do método transportar
    public int transportar(int quantidade) {
        if (quantidade <= capacidade) {
            System.out.println("Caminhão " + nome + " transportando " + quantidade + " kg.");
            return quantidade;
        } else {
            System.out.println("Capacidade excedida! Máximo permitido: " + capacidade + " kg.");
            return capacidade;
        }
    }
}
