package br.com.devmedia.aula08;

public class Aula {

    public static void main(String[] args) {

        Livro l1 = new Livro();
        l1.setTitulo("Java 1");
        l1.setAutor("Beltrano");
        l1.setPaginas(50);
        l1.setLancamento(false);
        System.out.println(l1.toString());

        Livro l2 = new Livro();
        l2.setTitulo("Java 2");
        System.out.println(l2.toString());

        Livro l3 = new Livro("Java 3", "Beltrano", 58,true);
        System.out.println(l3.toString());

    }
}
