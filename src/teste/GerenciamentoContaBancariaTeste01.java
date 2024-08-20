package teste;

import dominio.Banco;
import dominio.ContaBancaria;

import java.util.ArrayList;

public class GerenciamentoContaBancariaTeste01 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Usuario",1);
        ContaBancaria contaBancaria2 = new ContaBancaria("Usuario2",2);
        ContaBancaria contaBancaria3 = new ContaBancaria("Usuario3",3);
        ContaBancaria contaBancaria4 = new ContaBancaria("Usuario4",4);
        ContaBancaria contaBancaria5 = new ContaBancaria("Usuario5",5);
        ArrayList<ContaBancaria> lista = new ArrayList<>();
        lista.add(contaBancaria);
        lista.add(contaBancaria2);
        lista.add(contaBancaria3);
        lista.add(contaBancaria4);
        lista.add(contaBancaria5);

        Banco bancoA= new Banco(lista);

        ContaBancaria contaBancaria6 = new ContaBancaria("Usuario6",6);
        bancoA.adicionarConta(contaBancaria6);

        contaBancaria6.depositar(300);
        System.out.println("Usuario:"+ contaBancaria6.getTitular()+"  saldo: "+contaBancaria6.verificarSaldo());
        contaBancaria6.transferir(contaBancaria5,200);
        System.out.println("Usuario: "+ contaBancaria5.getTitular()+"  saldo: " +contaBancaria5.verificarSaldo());
        System.out.println("Usuario: "+ contaBancaria6.getTitular()+"  saldo: " +contaBancaria6.verificarSaldo());



    }

}
