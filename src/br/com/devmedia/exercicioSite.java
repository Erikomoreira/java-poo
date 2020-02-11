package br.com.devmedia;

public class exercicioSite {

    public static void main(String[] args) {

        final float km = 4023f;
        final float kmPorLitro = 15.1f;
        final float litros = 142f;

        float abastecimentos = km / litros + kmPorLitro;

        System.out.println(abastecimentos);

    }

}
