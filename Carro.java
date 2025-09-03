import java.util.Date;

public class Carro extends Veiculo {   
  public int numeroPassageiros;

   Carro(String marca, Date dataProducao, double potencia, int numeroPassageiros) {
        this.marca = marca;
        this.potencia = potencia;
        this.numeroPassageiros = numeroPassageiros;
        this.dataProducao = dataProducao;
    } 
  
  @Override
  public int deslocar() {
        System.out.println("O Carro " + marca + " está se deslocando com " + numeroPassageiros + " passageiros.");
        return numeroPassageiros;
    }
}
