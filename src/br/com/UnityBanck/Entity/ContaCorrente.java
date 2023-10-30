package br.com.UnityBanck.Entity;


public class ContaCorrente extends Conta {
    public ContaCorrente(int numero, int agencia) {
        super(numero, agencia);
    }

    @Override
    public void Deposita(double saldo) {
        if(ValidaValorPositivo(saldo))return;
        super.saldo = +saldo;
    }

    /*
    Método sobrescrito pois com base na logica de uma conta Corrente é preciso tributar um certo valor em cima
    de transferencias
     */
    @Override
    public void Transfere(Conta clienteADepositar, double valor){
        if(ValidaValorPositivo(valor))return;
        if(ValidaSaldo(valor)) return;
        super.Saca(valor+(valor * 0.02));
        clienteADepositar.Deposita(valor);

    }
}
