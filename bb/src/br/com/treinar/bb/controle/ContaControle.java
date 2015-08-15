package br.com.treinar.bb.controle;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.util.BancoDados;

/**
 * Camada de controle, importante para evitar que 
 * a camada de visao converse diretamente com a camada
 * de modelo evitando assim que uma camada de vis�o seja
 * reescrita sempre que uma nova vis�o seja criada
 * @author ADM
 *
 */
public class ContaControle {

	public BancoDados bancoDados;
	
	public ContaControle() {
		bancoDados = new BancoDados();
	}
	
	public void gravarConta(Conta conta) {
		conta.saldo = 0d;
		bancoDados.conta = conta;
		
	}

	public void efetuarDeposito(Double valor) {
		bancoDados.conta.depositar(valor);
	}

	/**
	 * M�todo para efetuar saques na conta, caso o saque seja efetuado
	 * o saldo da conta ser� reduzido do valor sacado
	 * 
	 * @param valor a ser sacado
	 * @return true caso o saque seja efetuado e false caso contr�rio
	 */
	public Boolean efetuarSaque(Double valor) {
		//Efetua o saque na conta
		return bancoDados.conta.sacar(valor);
	}

	public Double recuperarSaldo() {
		return bancoDados.conta.saldo;
	}
	
}