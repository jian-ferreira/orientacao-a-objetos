package com.jianferreira.poo.generics.exercice;

public class Lactea extends Produto {

    private Integer quantidade;
    private Integer proteinas;

    public Lactea(String nome, Double preco, Integer quantidade, Integer proteinas) {
        super(nome, preco);
        this.quantidade = quantidade;
        this.proteinas = proteinas;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Integer getProteinas() {
        return proteinas;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
