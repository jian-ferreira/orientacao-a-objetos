package com.jianferreira.cm.models;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	
	private Boolean minado;
	private Boolean aberto;
	private Boolean marcado;
	
	private final Integer linha;
	private final Integer coluna;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	Campo (int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	Boolean adicionarVizinho(Campo vizinho) {
		return false;
	}
	
}
