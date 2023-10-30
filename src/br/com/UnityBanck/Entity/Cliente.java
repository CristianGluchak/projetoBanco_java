package br.com.UnityBanck.Entity;

public class Cliente {
    private String nome;
    private String profissao = " não preenchido";

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
 /*
 Concatena os valores para exibir quando chamado somente o Cliente
 */
    @Override
    public String toString() {
        return "Nome: " + this.nome +
                "\n Cpf: " + this.cpf
                + "\n Profissão:" + this.profissao;
    }
}

