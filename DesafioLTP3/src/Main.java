import javax.swing.JOptionPane;

public class Main {
	static ListaLigada lista = new ListaLigada();
	static int[] v = new int[25];
	public static void gerar(){
		int n;
		
		
		for(int i=0; i <25; i++){
			n = (int) (Math.random() * 101);
			v[i] = n;
		
			lista.adiciona(v[i]);
		}
	}
	
	public static void soma(){
		int s = 0;
		
		for(int i=0; i<25; i++){
			s = s+v[i];
		}
		System.out.println("soma " + s);
	}
	
	public static void media(){
		int m = 0;
		
		for(int i=0; i<25; i++){
			m = m+v[i];
		}
		m = m/25;
		System.out.println("media " + m);
	}
	
	public static void ordenar(){
		for(int o = 0; o<25;o++){
			for(int p = 0; p<25; p++){
				int y = 0;
				if(v[p] > v[o]){
					y = v[p];
					v[p] = v[o];
					v[o] = y;
				}
				
			}
		}
		
			}
	
	public static String imprimirOrd(){
		StringBuilder builder = new StringBuilder("[");
		for(int b=0; b<25; b++){
			System.out.println(v[b]);
		builder.append(v[b]);
		builder.append(", ");
	
		
		}
		builder.append("]");
		return builder.toString();
	}
	
	public static void main (String [] args){
		System.out.println("numeros gerados");
		gerar();
		System.out.println("numeros impressos");
		System.out.println(lista.imprimirLista());
		System.out.println("numeros somados");
		soma();
		System.out.println("numeros Media");
		media();
		System.out.println("numeros ordenados");
		ordenar();
		imprimirOrd();
		
	}
}
