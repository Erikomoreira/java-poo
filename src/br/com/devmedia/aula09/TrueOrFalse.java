package br.com.devmedia.aula09;

public enum TrueOrFalse {
    FALSE(0, "false"), TRUE(1, "true");

    private int index;
    private String descr;

    private TrueOrFalse(int index, String descr){

        this.index = index;
        this.descr = descr;

    }


    public int getIndex() {
        return index;
    }


    public String getDescr() {
        return descr;
    }






}
