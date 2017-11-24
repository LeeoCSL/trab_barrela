
public class Main {
	static ListaLigada lista = new ListaLigada();
	static ListaLigada listaInv = new ListaLigada();
	static int[] v = new int[25];
	public static void gerar(){
		int n;
		
		
		for(int i=0; i <25; i++){
			n = (int) (Math.random() * 101);
			v[i] = n;
		
			lista.adiciona(v[i]);
		}
	}
	
	public static void inverter(){
		int x, y;
		for (int i = 0, j = 24; i < 12 && j > 12; i++, j--){
			
			x = v[i];
			y = v[j];
			
			v[j] = x;
			v[i] = y;
		}
		
		for(int a=0; a< 25; a++){
			listaInv.adiciona(v[a]);
		
		}
		
		
	}
	
	public static void main (String [] args){

		gerar();
		System.out.println("numeros impressos");
		System.out.println(lista.imprimirLista());
		System.out.println("numeros invertidos impressos");
		inverter();
		System.out.println(listaInv.imprimirLista());
		
	}
}
