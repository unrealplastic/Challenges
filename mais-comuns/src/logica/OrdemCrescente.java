package logica;

public class OrdemCrescente {

	public static void main(String[] args) {
		int [] array = {4,2,1,3,7};
		
		for(int i = 0; i<array.length; i++) {
			for(int j = i+1; j<array.length; j++) {
				
				if(array[i]>array[j]) {
					int ordemCrescente = array[i];
					array[i] = array[j];
					array[j] = ordemCrescente;
				}
			}
		}
		
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
