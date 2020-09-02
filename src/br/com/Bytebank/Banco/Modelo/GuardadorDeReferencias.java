package br.com.Bytebank.Banco.Modelo;

public class GuardadorDeReferencias {

    private Object[] refecias;
    private int pos;

    public GuardadorDeReferencias(){
        this.refecias = new Conta[10];
        this.pos      = 0;
    }

    public void adicionar(Object ref){
        this.refecias[this.pos]= ref;
        this.pos++;
    }

    public int getQuantidadeElementos(){
        return this.pos;
    }

    public Object getRefencia(int pos) {
        return this.refecias[pos];
    }
}
