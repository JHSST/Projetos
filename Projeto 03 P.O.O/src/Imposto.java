abstract class Imposto {
    String nome;
    double aliquota;

    public Imposto(String nome, double aliquota) {
        this.nome = nome;
        this.aliquota = aliquota;
    }

    public double calcularImposto(double valor) {
        return valor * (aliquota / 100);
    }
}
