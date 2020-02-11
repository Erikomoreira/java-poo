package br.com.devmedia.aula04;

public class ExercicioAula04 {

    void tabuada(int a) {

        for (int i = 1; i < 11; i++) {

            System.out.println(i + "X" + a + "=" + a * i);
        }
    }
        public static void main(String [] args){

            ExercicioAula04 e = new ExercicioAula04();

            e.tabuada(10);
        }

    }

