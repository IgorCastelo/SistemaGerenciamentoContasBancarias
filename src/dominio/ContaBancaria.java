package dominio;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;
    private Banco banco;

    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor){
        saldo+=valor;

    }
    public void sacar (double valor){
        saldo-=valor;
    }
    public double verificarSaldo(){
        return getSaldo();
    }
    public void transferir(ContaBancaria contaDestino, double valor){
            if (saldo>=valor){
                saldo-=valor;
                contaDestino.depositar(valor);
                System.out.println("Tranferencia realizada para o titular de numero"+contaDestino.getTitular());
            } else {
                 System.out.println("Saldo insuficiente para transferência.");
            }
    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }



    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
