package br.com.devmedia.aula10;

import sun.util.resources.LocaleData;

public class Pessoa{

    private String nome;
    private String sobremnome;
    private char sexo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobremnome() {
        return sobremnome;
    }

    public void setSobremnome(String sobremnome) {
        this.sobremnome = sobremnome;
    }


    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", sobremnome='" + sobremnome + '\'' +
                ", sexo=" + sexo +
                ", ";
    }



}
