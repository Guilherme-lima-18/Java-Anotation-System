package Banco;
class Conta {

    protected int numConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(int numConta, Cliente cliente) {
        this.numConta = numConta;
        this.cliente = cliente;
        this.saldo = 0;
    }

    public int getNumConta() {
        return numConta;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void mostrarConta() {
        System.out.println("Conta: " + numConta);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo: " + saldo);
    }
}