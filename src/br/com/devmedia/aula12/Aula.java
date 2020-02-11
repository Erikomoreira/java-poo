package br.com.devmedia.aula12;

public class Aula {

    public static void main(String[] args) {

        Programador p = new Programador();
        p.setNome("Erik");
        p.setSalario(2800.95);

        System.out.printf("Programador: %s - R$ %.2f \n", p.getNome(), p.calculaSalario());


        Analista a = new Analista();
        a.setNome("Erik");
        a.setSalario(2800.95);

        System.out.printf("Analista: %s - R$ %.2f", a.getNome(), a.calculaSalario());

    }
}
