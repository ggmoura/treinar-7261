package br.com.treinar.estudo.atividade.bruno.metodo.arquivos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class LogSys {// trocar o nome 
	public void logsistema(String texto ) {
		try {
			
			//**trabalhando no carregamento e transforma��o do texto
			OutputStream arq = new FileOutputStream("log.txt", Boolean.FALSE);
			OutputStreamWriter arqw = new OutputStreamWriter(arq);
			BufferedWriter txt = new BufferedWriter(arqw);
			//**
						
			txt.write(texto);
			
			txt.close();
		} catch (FileNotFoundException e) {
			System.out.println("Voc� n�o tem permiss�o para ler o arquivo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
