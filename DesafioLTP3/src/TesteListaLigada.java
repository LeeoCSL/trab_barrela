import javax.swing.JOptionPane;

public class TesteListaLigada {
	public static void main(String [] args){
		ListaLigada lista = new ListaLigada();
		int opcao=0;
		while(opcao!=6){
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: 1-Adicionar, 2-Adicionar em uma posição, 3-Remover de uma posição, 4-Imprimir, 5-Buscar, 6-Sair."));
			switch(opcao){
			case 1:
				lista.adiciona(JOptionPane.showInputDialog("Informe um nome: "));
				break;
			case 2:
				int posicaoAd=Integer.parseInt(JOptionPane.showInputDialog("Informe a posição para inserir o nome: "));
				String elemento =JOptionPane.showInputDialog("Informe um nome: ");
				lista.adiciona(posicaoAd, elemento);
				break;
			case 3:
				int posicaoRem=Integer.parseInt(JOptionPane.showInputDialog("Informe a posição do elemento a ser removido: "));
				lista.remove(posicaoRem);
				break;
			case 4: 
				System.out.println(lista.imprimirLista());
				break;
			case 5:
				String nome = null;
				if (lista.contem(JOptionPane.showInputDialog  ("informe um nome"))==true){
				JOptionPane.showMessageDialog(null, "O elemento está na lista");
				}
				else {
				JOptionPane.showMessageDialog(null, "O elemento não está na lista");
				}
				break;
			case 6:
				JOptionPane.showInputDialog(null, "O programa será encerrado!");				
				break;
								
				default:
					break;
					  
					                                                                                                                                       
			}
		}
	}

}
