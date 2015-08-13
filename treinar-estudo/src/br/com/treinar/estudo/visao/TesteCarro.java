package br.com.treinar.estudo.visao;

import br.com.treinar.estudo.modelo.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		Carro c = null;
		c = new Carro();
		c.velocidadeAtual = 0;
		c.velocidadeMaxima = 160;
		c.qtdMarcha = 6;
		c.placa = "AAA-1234";
		
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		System.out.println(c.velocidadeAtual);
		
		c.trocarMarcha(9);
		System.out.println(c.marchaAtual);
		c.trocarMarcha(6);
		System.out.println(c.marchaAtual);
		
	}
	
}