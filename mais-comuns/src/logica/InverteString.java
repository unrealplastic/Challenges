package logica;

public class InverteString {
	
	public static String inverter(String palavra) { //nova função para inverter as letras
		char[] letras = palavra.toCharArray(); //recebe uma palavra e converte em um array de caracteres
		int esquerda = 0; //posição do primeiro indice
		int direita = letras.length - 1; // posição do último indice
		
		while(esquerda<direita) { //enquanto não estiver no meio
			char troca = letras[esquerda]; //cria uma variavel char para armazenar as novas posições trocadas
			letras[esquerda] = letras[direita]; 
			letras[direita] = troca;
			
			esquerda++; //avança o primeiro indice
			direita--; //recua o ultimo indice
		}
		
		return new String (letras); //retorna a palavra trocada
	}

	public static void main(String[] args) {
		String novaPalavra = "Nicole"; //define a palavra a ser trocada
		String invertida = inverter(novaPalavra); // chama a função de inverter
		System.out.println(invertida);
		
		
		

	}

}
