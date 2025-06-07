package atividadesfaculdade;

public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public void mudarLados(double novoComprimento, double novaLargura) {
        this.comprimento = novoComprimento;
        this.largura = novaLargura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }
}