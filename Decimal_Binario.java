package SistemasNumericos;

import java.util.Scanner;

public class Decimal_Binario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		int decimal, aux;
		String binario = "";
		
		System.out.println("Ingrese e valor decimal: ");
		decimal = tc.nextInt();
		
		if(decimal == 0) {
			binario = "0";

		}else {
			while(decimal > 0) {
				aux = decimal % 2;
				binario = aux + binario;
				decimal /= 2;
			}
		}
		System.out.println("El valor de "+decimal+" en binario es: "+binario);
	}

}
