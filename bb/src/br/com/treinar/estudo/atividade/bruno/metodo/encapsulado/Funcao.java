package br.com.treinar.estudo.atividade.bruno.metodo.encapsulado;

public class Funcao { // private so tem permi��o dentro da class. nao user o
						// private na propria class sen�o ele nao vai fazer sua
						// propria fun��o
	private String nome;
	private String nomeMae;

	public String getNome() {
		this.nome = "Sr." + nome;
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

}
