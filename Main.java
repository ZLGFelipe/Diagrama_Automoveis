import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando veículos
        Carro carro = new Carro("Monza", new Date(), 75.0, 5);
        Caminhao caminhao = new Caminhao("Volvo", new Date(), 400.0, 20);
        caminhao.deslocar();
        caminhao.transportar();

        // Criando cliente
        Cliente cliente = new Cliente("Maria", 5);

        // Cliente aluga veículos
        System.out.println("Alugando veículos");
        cliente.alugar(carro);
        cliente.alugar(caminhao);
    }
 }