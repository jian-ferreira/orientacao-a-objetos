package com.jianferreira.poo.generics.exercice;

public class Limpeza extends Produto {

    private String componentes;
    private Double litros;

    public Limpeza(String nome, Double preco, String componentes, Double litros) {
        super(nome, preco);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public Double getLitros() {
        return litros;
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
