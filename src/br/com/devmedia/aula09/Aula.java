package br.com.devmedia.aula09;

public class Aula {

    public enum Option { // enumm é o objeto

        YES, NO

    }

    public static final String OURO = "ouro";
    public static final String PAUS = "paus";
    public static final String ESPADAS = "espadas";
    public static final String COPAS = "copas";

    public static void main(String[] args) {


        Carta carta = Carta.COPAS;

        switch (carta) {
            case OURO:
                System.out.println("Sua Carta é de Ouro");
                break;
            case PAUS:
                System.out.println("Sua Carta é de Paus");
                break;

            case ESPADAS:
                System.out.println("Sua Carta é de Espadas");
                break;

            case COPAS:
                System.out.println("Sua Carta é de Copas");
                break;

            default:
                System.out.println("Nenhum naipe está presente");
                break;
        }

    }

}
