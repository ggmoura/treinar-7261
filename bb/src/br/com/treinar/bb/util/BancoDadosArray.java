package br.com.treinar.bb.util;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.SituacaoConta;

/**
 * Padrao de projeto singleton
 * 
 * esta classe so pode ser instanciada internamente
 * eh possivel recuperar a instancia dela a partir do metodo 
 * getInstance
 * 
 * @author ADM
 *
 */
public class BancoDadosArray implements IBancoDados<Conta[]> {

	private static BancoDadosArray instance;
	
	private Conta[] contas;
	private Integer index;
	
	private BancoDadosArray() {
		contas = new Conta[5];
		index = 0;
	}

	public void adicionarConta(Conta conta/*parametro do metodop*/) {
		if (index < contas.length) {
			contas[index++] = conta;			
		}
	}
	
	public Conta recuperarConta(Long numeroConta) {
		Conta conta = null;
		for (Conta contaTemp : contas) {
			if (contaTemp != null && 
					contaTemp.getNumeroConta().equals(numeroConta)) {
				conta = contaTemp;
				break;
			}
		}
		return conta;
	}
	
	static {
		instance = new BancoDadosArray();
	}
	
	
	public static BancoDadosArray getInstance() {
		return instance;
	}

	public Conta[] recuperarContas() {
		Integer qtd = 0;
		for (Conta conta : contas) {
			if (conta != null && conta.getSituacao().equals(SituacaoConta.ATIVA)) {
				qtd++;
			}
		}
		Conta[] contasAtivas = new Conta[qtd];
		for (int j = 0; j < contas.length; j++) {
			if (contas[j] != null && contas[j].getSituacao().equals(SituacaoConta.ATIVA)) {
				contasAtivas[j] = contas[j];
			}			
		}
		return contasAtivas;
	}

	public void cancelarConta(Conta c) {
		c.setSituacao(SituacaoConta.CANCELADA);
	}
	
}