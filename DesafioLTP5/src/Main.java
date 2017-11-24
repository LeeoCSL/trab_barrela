import java.util.Scanner;

public class Main {
public static void testar(){
	Scanner entrada = new Scanner(System.in);

	
	String s;
	System.out.println("Digite o texto");
	s = entrada.nextLine();
	System.out.println(s);
	s.toLowerCase();
	s.replace(" ", "_");
	System.out.println(s);
//	for(int a=0; a< s.length(); a++ ){
//		if(s.charAt(a) == charVazio){
//			System.out.println("jcf");
//		}
//	}
//	
	for(int i = 0, j = s.length() -1; i<= (s.length()/2) && j >= (s.length()/2); i++, j--){
//		char x = s.charAt(i);
//		char y = s.charAt(j);
		
		if(s.charAt(i)==s.charAt(j)){
			System.out.println("char i " + s.charAt(i) + ", char j " + s.charAt(j));
			continue;
		}
		
		else{
			System.out.println("Não é um palindromo");
			
			System.exit(0);
		}

	}
//	System.out.println(s.charAt(2));
	System.out.println("É um palindromo");

}

public static void main(String[] args){
	testar();
}
}


