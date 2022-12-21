package com.jianferreira.poo.generics.exercice;

public class NaoPerecivel extends Produto {

    private Integer conteudo;
    private Integer calorias;

    public NaoPerecivel(String nome, Double preco, Integer conteudo, Integer calorias) {
        super(nome, preco);
        this.conteudo = conteudo;
        this.calorias = calorias;
    }

    public Integer getConteudo() {
        return conteudo;
    }

    public Integer getCalorias() {
        return calorias;
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
