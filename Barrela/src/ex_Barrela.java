import java.util.Scanner;

public class ex_Barrela {
	
	

	
	public static void main(String[] args){
	String msg;
int p1, p2;
boolean inicio = false;
	
	Scanner sc = new Scanner(System.in);
	


	
		System.out.println("Digite a mensagem");
		
		msg = sc.nextLine().toUpperCase();
		
		msg = msg.replace(" ", "");

//		p1 = msg.length()-2;
//		System.out.println("p1" + p1);
//		p2 = msg.length()-1;
//		System.out.println("p2"+p2);
		
		//teste cada par de caracteres
		
		for(int i = 0, j=1; i <= msg.length()-2 && j<=msg.length()-1; i=i+2, j=j+2){
			String primeiro, segundo;
			primeiro = String.valueOf(msg.charAt(i));
			segundo = String.valueOf(msg.charAt(j));
			System.out.println("primeiro: " + msg.charAt(i) + " segundo: " + msg.charAt(j));
		
			//testa se é inicio ou fim da mensagem
			if(msg.charAt(i) == '7' && msg.charAt(j) == 'E' ){
				if(i+3 > msg.length() ){
					System.out.println("fim da mensagem");
				}
				else if(inicio == false && i+3 < msg.length() ){
					System.out.println("inicio da mensagem");
					
					inicio = true;
				}
			} // fim do teste inicio fim

			
		
			

			
			
		}//fim do teste de pares
		
		//metodo que vai imprimir
		msg = msg.replace("7E", "7D5D");
		System.out.println("mensagem decodificada(7E>7D5D)");
		for(int a = 4 , b = 5; a<= msg.length()-6 && b <=msg.length()-5; a=a+2, b=b+2){
			String in, jn;
			in = String.valueOf(msg.charAt(a));
			jn = String.valueOf(msg.charAt(b));
			
			System.out.print(in + jn + " ");
		}//fim do metodo que imprime
		
		//metodo que vai ler a msg e decodificar
		
		msg = msg.replace("7D5D", "7E");
		System.out.println(" ");
		System.out.println("mensagem codificada(7D5D>7E)");
		for(int c = 0, d = 1; c <=msg.length() - 2 && d <=msg.length()-1; c=c+2, d = d+2){
			String in, jn;
			in = String.valueOf(msg.charAt(c));
			jn = String.valueOf(msg.charAt(d));
			
			System.out.print(in + jn + " ");
		}
	}
	
}
