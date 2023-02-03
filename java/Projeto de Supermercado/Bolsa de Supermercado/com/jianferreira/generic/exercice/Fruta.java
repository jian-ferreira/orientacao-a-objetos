package com.jianferreira.poo.generics.exercice;

public class Fruta extends Produto{

    private Double peso;
    private String cor;

    public Fruta(String nome, Double preco, Double peso, String cor) {
        super(nome, preco);
        this.peso = peso;
        this.cor = cor;
    }

    public Double getPeso() {
        return peso;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
