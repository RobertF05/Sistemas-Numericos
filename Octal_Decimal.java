package SistemasNumericos;

import java.util.Scanner;

public class Octal_Decimal {

	    public static void main(String[] args) {
	        Scanner tc = new Scanner(System.in);
	        System.out.print("Ingrese un valor octal: ");
	        String octalValue = tc.nextLine();

	        int decimalValue = octalToDecimal(octalValue);
	        System.out.println("El valor decimal es: " + decimalValue);
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
