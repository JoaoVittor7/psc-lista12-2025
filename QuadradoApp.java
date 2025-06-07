package atividadesfaculdade;

public class App {
public static void main(String[] args) {
   Quadrado q = new Quadrado(5.0);

        System.out.println("Lado atual: " + q.retornarLado());
        System.out.println("Área do quadrado: " + q.calcularArea());

        q.mudarLado(8.0);

        System.out.println("Novo lado: " + q.retornarLado());
        System.out.println("Nova área: " + q.calcularArea());
    }
}
