package br.com.devmedia.aula14;

public class MP3 implements Player, Audio{

    @Override
    public void play() {

        System.out.println("Play");

    }

    @Override
    public void stop() {

        System.out.println("Stop");

    }

    @Override
    public void pause() {

        System.out.println("Pause");

    }

    @Override
    public void volume(int volume) {

        System.out.println(volume + 1);

    }

    @Override
    public void taxaDeBits() {

        System.out.println("128 Bits");

    }
}