class Conta {
    protected double saldo;

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double obterSaldo() {
        return saldo;
    }
}