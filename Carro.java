public class Carro extends Veiculo {   
  public int numeroPassageiros;
  
  @Override
  public int deslocar() {
        System.out.println("O Carro " + nome + " está se deslocando com " + numeroPassageiros + " passageiros.");
        return numeroPassageiros;
    }
}
