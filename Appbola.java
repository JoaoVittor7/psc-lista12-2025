package atividadesfaculdade;

public class App {
public static void main(String[] args) {
        Bola minhaBola = new Bola("Azul", 70.0, "Borracha");

        System.out.println("Cor da bola atual: " + minhaBola.mostraCor());

        minhaBola.trocaCor("Vermelha");

        System.out.println("Nova cor: " + minhaBola.mostraCor());
    }

}