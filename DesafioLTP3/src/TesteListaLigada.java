import javax.swing.JOptionPane;

public class TesteListaLigada {
	public static void main(String [] args){
		ListaLigada lista = new ListaLigada();
		int opcao=0;
		while(opcao!=6){
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o: 1-Adicionar, 2-Adicionar em uma posi��o, 3-Remover de uma posi��o, 4-Imprimir, 5-Buscar, 6-Sair."));
			switch(opcao){
			case 1:
				lista.adiciona(JOptionPane.showInputDialog("Informe um nome: "));
				break;
			case 2:
				int posicaoAd=Integer.parseInt(JOptionPane.showInputDialog("Informe a posi��o para inserir o nome: "));
				String elemento =JOptionPane.showInputDialog("Informe um nome: ");
				lista.adiciona(posicaoAd, elemento);
				break;
			case 3:
				int posicaoRem=Integer.parseInt(JOptionPane.showInputDialog("Informe a posi��o do elemento a ser removido: "));
				lista.remove(posicaoRem);
				break;
			case 4: 
				System.out.println(lista.imprimirLista());
				break;
			case 5:
				String nome = null;
				if (lista.contem(JOptionPane.showInputDialog  ("informe um nome"))==true){
				JOptionPane.showMessageDialog(null, "O elemento est� na lista");
				}
				else {
				JOptionPane.showMessageDialog(null, "O elemento n�o est� na lista");
				}
				break;
			case 6:
				JOptionPane.showInputDialog(null, "O programa ser� encerrado!");				
				break;
								
				default:
					break;
					  
					                                                                                                                                       
			}
		}
	}

}
