package br.com.devmedia.aula16;

public class Teste {

    public static void main(String[] args) {

       final String cep = "22343-909";

        String regiao = "Não identificada";

        System.out.println(cep.charAt(0));

        switch (cep.charAt(0)) {
            case 0:
                    regiao = "GRANDE SÃO PAULO";

                    System.out.println(regiao);
            break;

            case 1:
                    regiao = "Interior de São Paulo";
            break;

            case '2':
                    regiao = "Rio de Janeiro e Espírito Santo";
                System.out.println(regiao);
            break;

            case 3:
                    regiao = "Minas Gerais";
            break;

            case 4:
                    regiao = "Bahia e Sergipe";
            break;

            case 5:
                    regiao = "Pernambuco, Alagoas, Paraíba e Rio Grande do Norte";
            break;

            case 6:
                    regiao = "Ceará, Piauí, Maranhão, Pará, Amazonas, Acre, Amapá e Roraima";
            break;

            case 7:
                    regiao = "Distrito Federal, Goiás, Tocantins, Mato Grosso, Mato Grosso do Sul e Rondônia";
            break;

            case 8:
                    regiao = "Paraná e Santa Catarina";
            break;

            case 9:
                    regiao = "Rio Grande do Sul";
            break;
        }

        }
}
