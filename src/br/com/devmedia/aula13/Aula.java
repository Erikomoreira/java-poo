package br.com.devmedia.aula13;

public class Aula {

    private Veiculo veiculo;
    private Carro carro;
    private Moto moto;

    void carrosEMotos(){

        carro = new Ford();
        carro.setCor("Roxo");
        carro.setPeso(600);
        System.out.println(carro.toString());

        moto = new Honda();
        moto.setCor("Roza");
        moto.setPeso(200);
        System.out.println(moto.toString());


    }

    void veiculos(){

        veiculo = new Ford();
        veiculo.setCor("Roxo");
        veiculo.setPeso(600);
        System.out.println(veiculo.toString());

        veiculo = new Honda();
        veiculo.setCor("Roza");
        veiculo.setPeso(200);
        System.out.println(veiculo.toString());

    }

    public static void main(String[] args) {

        new Aula().carrosEMotos();

        Ford f = new Ford();
        f.setCor("Preta");
        f.setPeso(600);
        System.out.println(f.toString());

        Honda h = new Honda();
        h.setCor("Verde");
        h.setPeso(200);
        System.out.println(h.toString());

    }
}
