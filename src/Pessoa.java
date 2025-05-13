import java.lang.System;

public abstract class Pessoa{
    protected String cpf;
    protected String nome;
    protected int idade;

    // metodo construtor da classe Pessoa
    public Pessoa(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    // getters e setters dos atributos
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // metodo que incrementa idade
    public void fazerAniversario() {
        int aniversario = getIdade()+1;
        System.out.println("Parabéns por fazer "+aniversario+" anos");
    }

    // adicionando metodo toString() que exibe os atributos da classe
    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}