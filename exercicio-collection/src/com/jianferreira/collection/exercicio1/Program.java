package com.jianferreira.collection.exercicio1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LinkedList<String> nomes = new LinkedList<>();
        String nome;
        int resposta = 1;

        System.out.print("Deseja adicionar algum nome na lista? 1 - Sim e 2 - Não: ");
        resposta = sc.nextInt();
        if (resposta == 1) {
            System.out.print("Digite um nome: ");
            sc.nextLine();
            nomes.add(sc.nextLine());
        }

        if (resposta == 1) {
            do {
                System.out.print("Deseja continuar a adicionar nome na lista? 1 - Sim e 2 - Não: ");
                resposta = sc.nextInt();
                if (resposta == 1) {
                    System.out.print("Digite um nome: ");
                    sc.nextLine();
                    nomes.add(sc.nextLine());
                }
            } while (resposta == 1);
        }

        int index = 0;
        Iterator<String> it = nomes.iterator();
        if (nomes.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else {
            System.out.println("\nLista de nomes: ");
            while (it.hasNext()){
                System.out.println(++index + " - " + it.next());
            }
        }

        sc.close();
    }
}
