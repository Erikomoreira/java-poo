package br.com.devmedia.aula15;

public class Pessoa {

     private String nome;

    public Pessoa(){

        System.out.println("Pessoa");

    }

    public Pessoa(String nome) {
        this.nome = nome;

        System.out.println("Pessoa(String nome)");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
