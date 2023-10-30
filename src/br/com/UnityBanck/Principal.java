package br.com.UnityBanck;

import br.com.UnityBanck.Entity.Cliente;
import br.com.UnityBanck.Entity.Conta;
import br.com.UnityBanck.Entity.ContaCorrente;
import br.com.UnityBanck.Entity.ContaPoupanca;

public class Principal {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(10,3);
        Conta cp = new ContaPoupanca(10 ,5);
        Cliente cliente1 = new Cliente("Creiton","47775991089");

        cc.setNumero(-20);

        System.out.println(cc);

    }
}
