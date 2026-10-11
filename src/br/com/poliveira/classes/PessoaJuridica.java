package br.com.poliveira.classes;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(Integer id, String nome, String cnpj) {
        super(id, nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Pessoa Jurídica [ID: " + getId() + ", Nome: " + getNome() + ", CNPJ: " + cnpj + "]";
    }
}
