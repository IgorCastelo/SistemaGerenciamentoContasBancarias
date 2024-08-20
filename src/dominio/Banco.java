package dominio;

import java.util.ArrayList;

public class Banco {

    private ArrayList<ContaBancaria> contas;

    public Banco(ArrayList<ContaBancaria> contas) {
        this.contas = contas;
    }

    public Banco() {

    }
    public void adicionarConta2(ContaBancaria contasBancarias) {

    }
    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public ContaBancaria buscar(int numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numero) {
                return conta;
                }
            }
        return null;
    }
    public void listarContas(){
        for (ContaBancaria contaa : contas) {
            System.out.println(contaa.getTitular());
        }
    }

}








