package com.jianferreira.poo.generics.exercice;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {

    private T produto;
    private List<T> produtos;
    private final Integer MAX = 5;

    public BolsaSupermercado() {
        this.produtos = new ArrayList<>();
    }

    public void add(T produto){
        if (this.produtos.size() <= MAX) {
            this.produtos.add(produto);
        } else {
            throw new RuntimeException("A bolsa já chegou ao seu limite!");
        }
    }

    public void getProdutos(){
        int cont = 1;
        for (T p : produtos) {
            System.out.println(cont++ + " - " + p);
        }

        System.out.print("\n");
    }

}
