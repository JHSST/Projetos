
interface Tributavel {
    double calculaTributos();
}

public class TestaTributavel {
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(1000.0);


        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(2000.0);


        SeguroDeVida seguroDeVida = new SeguroDeVida();


        System.out.println("Tributos da Conta Poupança: " + contaPoupanca.calculaTributos() + " reais");
        System.out.println("Tributos da Conta Corrente: " + contaCorrente.calculaTributos() + " reais");
        System.out.println("Tributos do Seguro de Vida: " + seguroDeVida.calculaTributos() + " reais");
    }
}
