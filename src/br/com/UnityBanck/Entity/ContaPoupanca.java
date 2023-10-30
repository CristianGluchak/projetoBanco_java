package br.com.UnityBanck.Entity;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero, int agencia) {
        super(numero, agencia);
    }
    @Override
    public void Deposita(double saldo) {
        if(ValidaValorPositivo(saldo))return;
        super.saldo = +saldo;
    }
}
