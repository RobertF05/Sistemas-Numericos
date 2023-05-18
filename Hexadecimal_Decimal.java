package SistemasNumericos;

import java.util.Scanner;

public class Hexadecimal_Decimal {
	
	    public static void main(String[] args) {
	        Scanner tc = new Scanner(System.in);
	        System.out.print("Ingrese un valor hexadecimal: ");
	        String hexValue = tc.nextLine();

	        int decimalValue = hexToDecimal(hexValue);
	        System.out.println("El valor decimal es: " + decimalValue);
	    }

	    public static int hexToDecimal(String hexValue) {
	        int decimalValue = 0;
	        int power = 0;

	        for (int i = hexValue.length() - 1; i >= 0; i--) {
	            char hexDigit = hexValue.charAt(i);
	            int digitValue = 0;

	            if (hexDigit >= '0' && hexDigit <= '9') {
	                digitValue = hexDigit - '0';
	            } else if (hexDigit >= 'A' && hexDigit <= 'F') {
	                digitValue = hexDigit - 'A' + 10;
	            } else if (hexDigit >= 'a' && hexDigit <= 'f') {
	                digitValue = hexDigit - 'a' + 10;
	            } else {
	                System.out.println("Valor hexadecimal inválido: " + hexDigit);
	                return 0;
	            }

	            decimalValue += digitValue * Math.pow(16, power);
	            power++;
	        }

	        return decimalValue;
	    }
}
