import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ListaLigada {
	private Celula primeira;
	private Celula ultima;
	private int totalDeElementos=0;

	public String imprimirLista(){
		// Verificando se a Lista está vazia
		if(this.totalDeElementos == 0){
			return "[]";
		}

		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeira;

		// Percorrendo até o penúltimo elemento.
		for (int i = 0; i < this.totalDeElementos - 1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProxima();
		}

		// último elemento
		builder.append(atual.getElemento());
		
		builder.append("]");

		return builder.toString();

	}


	private boolean posicaoOcupada(int posicao){
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	private Celula pegaCelula(int posicao) {
		if(!this.posicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição não existe");
			
		}
		Celula atual = primeira;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProxima();
		}
		return atual;
	}

	public void adiciona(Object elemento) {
		if (this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultima.setProxima(nova);
			this.ultima = nova;
			this.totalDeElementos++;
		}  
	}


	public void adiciona(int posicao, Object elemento) {
		if(posicao == 0){ // No começo.
			this.adicionaNoComeco(elemento);
		} else if(posicao == this.totalDeElementos){ // No fim.
			this.adiciona(elemento);
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula nova = new Celula(anterior.getProxima(), elemento);
			anterior.setProxima(nova);
			this.totalDeElementos++;
		}	
	}


	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}


	public void remove(int posicao){
		if (posicao==0) 
			removeDoComeco();
		else if (posicao==this.totalDeElementos-1) 
			removeDoFim();
		else{
			Celula celulaExistente = pegaCelula(posicao-1);
			System.out.println(celulaExistente.getElemento());
			celulaExistente.setProxima(pegaCelula(posicao).getProxima());
			System.out.println(celulaExistente.getProxima().getElemento());
			this.totalDeElementos--;
		}
			
	}

	public int tamanho() {
		return this.totalDeElementos;
	}

	public boolean contem(Object elemento) {
		Celula atual = this.primeira;
		while (atual != null) {
			if (atual.getElemento().equals(elemento)) {
				return true;
			}
			atual = atual.getProxima();
		}
		return false;	
	}

	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(this.primeira, elemento);
		this.primeira = nova;

		if(this.totalDeElementos == 0){
			this.ultima = this.primeira;
		}
		this.totalDeElementos++;
	}

	private void removeDoComeco() {
		if (!this.posicaoOcupada(0)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		this.primeira = this.primeira.getProxima();
		this.totalDeElementos--;
		if (this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}
	private void removeDoFim() {
		if (!this.posicaoOcupada(this.totalDeElementos-1)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		Celula celulaExistente =pegaCelula(this.totalDeElementos-2);
		this.ultima=celulaExistente;
		this.ultima.setProxima(null);
		this.totalDeElementos--;
		
		if (this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}
	
	


	}
