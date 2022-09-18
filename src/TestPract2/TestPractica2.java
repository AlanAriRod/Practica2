package TestPract2;
import Practica2.Prac2;
public class TestPractica2 {


	public static void main(String[] args) {
		
		Prac2 obj = new Prac2();
		
		float arreglo [] = {(float)1.6,(float) 2.5,(float) 3.5,(float) 8.7,(float) 2.5,(float) 2.5};
		
		int chaquira[] = {1,2,3,4,5,2};
		
		String imprimeChaquiras = "";
		
		for(int i = 0; i < obj.ordenaChaquiras(chaquira).length; i++) {
			imprimeChaquiras += obj.ordenaChaquiras(chaquira)[i] + ",";
		}
		
		System.out.println("Cantidad De Pares: " + obj.canDigitosPares(1365724));
		System.out.println("Palindromo: " + obj.palindromo("reconocer"));
		System.out.println("Capicúa: " + obj.numCapicua(1881));
		System.out.println("Flotante X Se Localiza : " + obj.RepiteFlotante(arreglo, (float) 2.5) + " Veces");
		System.out.println("Arreglo Ordenado: " + imprimeChaquiras);
		
		

	}

}
