package com.jianferreira.poo.generics.exercice;

public abstract class Produto {

    protected String nome;
    protected Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString(){
        return "Produto: " + this.nome + ", Preço: " + this.preco;
    }
}
