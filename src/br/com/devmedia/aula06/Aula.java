package br.com.devmedia.aula06;

import br.com.devmedia.aula05.ClassB;

public class Aula extends ClassB {

    public static void main(String[] args) {

        ClassA a = new ClassA();

        a.pacote = "pacote A";
        a.protegido = "protegido A";
        a.publico = "publico A";

        ClassB b = new ClassB();
        b.publico = "publico b";

        Aula aula = new Aula();
        aula.publico = "publico b";
        aula.protegido = "protegido b por herança";

        ClassD d = new ClassD();
        d.metodoD();

    }
}



