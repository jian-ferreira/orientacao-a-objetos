package com.jianferreira.poo.generics.exercice;

public class ProgramBolsaSupermercado {
    public static void main(String[] args) {
        BolsaSupermercado<Lactea> lactea = new BolsaSupermercado<>();
        BolsaSupermercado<Fruta> fruta = new BolsaSupermercado<>();
        BolsaSupermercado<Limpeza> limpeza = new BolsaSupermercado<>();
        BolsaSupermercado<NaoPerecivel> naoPericivel = new BolsaSupermercado<>();

        Lactea leite = new Lactea("Leite", 2.75, 4, 20);
        Fruta maca = new Fruta("Maçã", 2.50, 1.400, "Verde");
        Limpeza sabao = new Limpeza("Sabão Líquido", 7.90, "Hidrogênio", 2.00);
        NaoPerecivel pastel = new NaoPerecivel("Pastel", 3.00, 22, 800);

        lactea.add(leite);
        lactea.add(new Lactea("Iorgute", 5.80, 5, 200));
        lactea.add(new Lactea("Leite Condensado", 4.50, 2,400));
        fruta.add(maca);
        fruta.add(new Fruta("Banana", 2.4, 1.4, "Amarela"));
        limpeza.add(sabao);
        naoPericivel.add(pastel);
        naoPericivel.add(new NaoPerecivel("Coxinha", 5.00, 50, 500));

        lactea.getProdutos();
        fruta.getProdutos();
        limpeza.getProdutos();
        naoPericivel.getProdutos();

    }
}
