package br.com.devmedia.aula07;

public class Aula {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("Maria");
        p1.setIdade(20);

        System.out.println("Nome: "+ p1.getNome() + " Idade: " + p1.getIdade());


    }
}
