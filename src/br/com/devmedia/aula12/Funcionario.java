package br.com.devmedia.aula12;

public abstract class Funcionario {

    public abstract double calculaSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private String nome;
    private double salario;


}
