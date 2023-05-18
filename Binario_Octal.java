package SistemasNumericos;

import java.util.Scanner;

public class Binario_Octal {

	    public static void main(String[] args) {
	        Scanner tc = new Scanner(System.in);
	        System.out.print("Ingrese un valor binario: ");
	        String binaryValue = tc.nextLine();

	        String octalValue = binaryToOctal(binaryValue);
	        System.out.println("El valor octal es: " + octalValue);
	    }

	    public static String binaryToOctal(String binaryValue) {
	        StringBuilder octalBuilder = new StringBuilder();
	        int binaryLength = binaryValue.length();

	        // Rellenar con ceros a la izquierda para que la longitud sea múltiplo de 3
	        while (binaryLength % 3 != 0) {
	            binaryValue = "0" + binaryValue;
	            binaryLength++;
	        }

	        // Convertir grupos de 3 bits a dígitos octales
	        for (int i = 0; i < binaryLength; i += 3) {
	            String binaryDigit = binaryValue.substring(i, i + 3);
	            int decimalValue = Integer.parseInt(binaryDigit, 2);
	            String octalDigit = Integer.toOctalString(decimalValue);
	            octalBuilder.append(octalDigit);
	        }

	        return octalBuilder.toString();
	    }
	
}
