package br.com.treinar.estudo.modelo;

public class Mulher extends Pessoa {

	public Boolean possuiSilicone;
	
	@Override
	public void caminhar() {
		System.out.println(nome + " est� caminha rebolando...");
	}

	
}
