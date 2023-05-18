package SistemasNumericos;

import java.util.Scanner;

public class Binario_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		int decimal = 0, aux = 0, aux2;
		String binario;
		
		System.out.println("Ingrese un Valor Binario: ");
		binario = tc.nextLine();
		
		for(int i = binario.length() - 1; i >= 0; i--) {
			aux2 = binario.charAt(i) - '0';
			decimal += aux2 * Math.pow(2, aux);
			aux++;
		}
		System.out.println("El Valor de "+binario+" en decimal es: "+decimal);

	}

}
