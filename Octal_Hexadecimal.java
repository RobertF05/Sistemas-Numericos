package SistemasNumericos;

import java.util.Scanner;

public class Octal_Hexadecimal {

	    public static void main(String[] args) {
	        Scanner tc = new Scanner(System.in);
	        System.out.print("Ingrese un valor octal: ");
	        String octalValue = tc.nextLine();

	        String hexValue = octalToHex(octalValue);
	        System.out.println("El valor hexadecimal es: " + hexValue);
	    }

	    public static String octalToHex(String octalValue) {
	        // Primero, convertimos el valor octal a decimal
	        int decimalValue = octalToDecimal(octalValue);

	        // Luego, convertimos el valor decimal a hexadecimal
	        String hexValue = Integer.toHexString(decimalValue);

	        return hexValue;
	    }

	    public static int octalToDecimal(String octalValue) {
	        int decimalValue = 0;
	        int power = 0;

	        for (int i = octalValue.length() - 1; i >= 0; i--) {
	            char octalDigit = octalValue.charAt(i);

	            // Convertir cada dígito octal a su valor decimal
	            int digitValue = Character.getNumericValue(octalDigit);

	            decimalValue += digitValue * Math.pow(8, power);
	            power++;
	        }

	        return decimalValue;
	    }

}
