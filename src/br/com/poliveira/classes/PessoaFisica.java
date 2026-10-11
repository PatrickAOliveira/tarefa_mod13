package br.com.poliveira.classes;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(Integer id, String nome, String cpf) {
        super(id, nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa Física [ID: " + getId() + ", Nome: " + getNome() + ", CPF: " + cpf + "]";
    }
}
