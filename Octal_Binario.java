package SistemasNumericos;

import java.util.Scanner;

public class Octal_Binario {

	    public static void main(String[] args) {
	        Scanner tc = new Scanner(System.in);
	        System.out.print("Ingrese un valor octal: ");
	        String octalValue = tc.nextLine();

	        String binaryValue = octalToBinary(octalValue);
	        System.out.println("El valor binario es: " + binaryValue);
	    }

	    public static String octalToBinary(String octalValue) {
	        StringBuilder binaryBuilder = new StringBuilder();

	        for (int i = 0; i < octalValue.length(); i++) {
	            char octalDigit = octalValue.charAt(i);

	            // Convertir cada dígito octal a su representación binaria de 3 bits
	            String binaryDigit = Integer.toBinaryString(Character.getNumericValue(octalDigit));

	            // Rellenar con ceros a la izquierda para asegurar 3 bits
	            while (binaryDigit.length() < 3) {
	                binaryDigit = "0" + binaryDigit;
	            }

	            binaryBuilder.append(binaryDigit);
	        }

	        return binaryBuilder.toString();
	    }

}
