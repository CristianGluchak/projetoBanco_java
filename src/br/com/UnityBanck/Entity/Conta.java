package br.com.UnityBanck.Entity;

public abstract class Conta {
    private int numero;
    private int agencia;
    protected double saldo;
    private Cliente cliente;


    public Conta(int numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(ValidaValorPositivo(numero))return;
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(ValidaValorPositivo(numero))return;
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public abstract void Deposita(double saldo);


    public void Saca(double valor) {
        if(ValidaValorPositivo(valor))return;
        if (ValidaSaldo(valor)) return;
        this.saldo -= valor;
    }

    public void Transfere(Conta clienteADepositar, double valor){
        if(ValidaValorPositivo(valor))return;
        if(ValidaSaldo(valor)) return;
        this.Saca(valor);
        clienteADepositar.Deposita(valor);

    }


/*
    Método extraido das funções Transfere e Saca
 */
    public boolean ValidaSaldo(double saldo) {
        if (this.saldo < saldo) {
            System.out.println("Saque Negado!!!" +
                    "\nSaldo Atual: R$" + this.saldo +
                    "\nSaldo insuficiente");
            return true;
        }
        return false;
    }

    public boolean ValidaValorPositivo(double valor){
        if (valor < 0){
            System.out.println("Não é possivel realizar o processo com valores negativos");
            return true;
        }
        return false;
    }

 /*
 Concatena os valores para exibir quando chamado somente a Conta
 */

    @Override
    public String toString() {
        return "Agencia: " + this.agencia +
                "\n Numero da Conta: " + this.numero +
                "\n Saldo da Conta: R$" + this.saldo +
                "\n Dono da Conta: " + this.cliente;
    }
}
