package Practica2;

import java.util.Arrays;

public class Prac2 {
	
	public Prac2() {
		// TODO Auto-generated constructor stub
	}
	
	public int canDigitosPares(int num) {
		
		int cont = 0;
			
		while(num != 0) {
			if(num % 2 == 0) 
				cont++;
				
			num = num/10;
		}
		
		return cont;
	}
	
	public boolean palindromo(String texto) {
		
		boolean es = true;
		int letraFin = texto.length()-1;
		
		for(int i = 1; i < texto.length(); i++) {
			if(texto.toUpperCase().charAt(i) != (texto.toUpperCase().charAt(letraFin - i))) 
				es = false;
					
		}
		
		return es;
	}
	
	public boolean numCapicua(int numero) {
		
		boolean es = true;
		String numText = numero + "";
		int NumFin = numText.length()-1;
		
		for(int i = 1; i < numText.length(); i++) {
			if(numText.charAt(i) != (numText.charAt(NumFin - i))) 
				es = false;
					
		}
		
		return es;
	}
	
	public int RepiteFlotante(float arreglo [], float busca) {	
		int repite = 0;
		for(int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == busca) 
				repite++;
		}
		return repite;
	}
	
	public int [] ordenaChaquiras(int chaquira[]) {
		boolean usado[] = new boolean [chaquira.length];
		int repite[] = new int [5];
		Arrays.sort(chaquira);
		
		for(int i = 0; i < chaquira.length; i++) {
			
			if (chaquira[i] == chaquira[i+1]) {
			
				
				
			}
			
		}
		
		return chaquira;
	}
	

	

}
