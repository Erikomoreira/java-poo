package br.com.devmedia.aula10;

import sun.util.resources.LocaleData;

public class Aula {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        a1.setNome("Erik");
        a1.setSobremnome("oliveira");
        a1.setSexo('M');
        a1.setTurno(Turno.MANHA);

        System.out.println(a1.toString());

        Professor p1 = new Professor();
        p1.setNome("Erik");
        p1.setSobremnome("oliveira");
        p1.setSexo('M');
        p1.setHoras(Horas.QUARENTA_HORAS);

        System.out.println(p1.toString());

        }
}
