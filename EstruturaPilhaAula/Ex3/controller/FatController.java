package controller;

import br.edu.fateczl.pilha.PilhaInt;

public class FatController {
	
	public int fatorial(int valor) throws Exception {
		
		PilhaInt p = new PilhaInt();
		int resultado=1;
		
		for(int i = 1; i<=valor; i++) {
			p.push(i);
		}
		
		for(int i = 1; i<=valor; i++) {
			resultado = resultado * p.pop();
		}
		
		return resultado;
	}
}
