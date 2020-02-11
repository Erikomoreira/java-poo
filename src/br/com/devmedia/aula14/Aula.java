package br.com.devmedia.aula14;

public class Aula {

    private PlayerVideo video;

    void videos(){

        video =  new WMV();
        video.play();
        video.pause();
        video.volume(10);
        video.taxaDeBits();
        video.taxaDeQuadros();
        video.nomeArquivo("Erik");
        video.stop();

        System.out.println();

        video =  new RMV();
        video.play();
        video.pause();
        video.volume(7);
        video.taxaDeBits();
        video.taxaDeQuadros();
        video.nomeArquivo("Erik 2");
        video.stop();

    }


    public static void main(String[] args) {

        new Aula().videos();

        System.out.println();

        MP3 mp3 = new MP3();
        mp3.play();
        mp3.pause();
        mp3.volume(5);
        mp3.taxaDeBits();
        mp3.stop();

        System.out.println();

        AVI avi = new AVI();

        avi.play();
        avi.pause();
        avi.volume(4);
        avi.taxaDeBits();
        avi.taxaDeQuadros();
        avi.stop();
    }
}
