package br.com.treinar.estudo.modelo;

import br.com.treinar.estudo.modelo.principal.Pessoa;

/**
 * 
 * 
 * @author ADM
 *
 */
public final class Mulher extends Pessoa {

	public Boolean possuiSilicone;
	
	@Override
	public void caminhar() {
		System.out.println(getNome() + " est� caminha rebolando...");
	}

	
}
