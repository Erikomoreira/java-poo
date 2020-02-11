package br.com.devmedia.aula11;

public class Aula {

    public static void main(String[] args) {

        Aluno a = new Aluno();
        a.setNome("Joana da Silva");
        a.setMatricula("123323232");
        System.out.println("Nome:" + a.getNome()+", Matricula: "+a.getMatricula());

        Aluno a1 = new Aluno();
        a1.setNome("Joana da Silva");
        a1.setMatricula("1234567891");
        System.out.println("Nome:" + a1.getNome()+", Matricula: "+a1.getMatricula());


        Professor p1 = new Professor();
        p1.setNome("Elton");
        p1.setMatricula("1234567891");
        System.out.println("Nome:" + p1.getNome()+", Matricula: "+p1.getMatricula());

    }
}
