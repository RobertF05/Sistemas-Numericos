package SistemasNumericos;

import java.util.Scanner;

public class Decimal_Hexadecimal {

	
	    public static void main(String[] args) {
	        Scanner tc = new Scanner(System.in);
	        System.out.print("Ingrese un valor decimal: ");
	        int decimalValue = tc.nextInt();

	        String hexValue = decimalToHex(decimalValue);
	        System.out.println("El valor hexadecimal es: " + hexValue);
	    }

	    public static String decimalToHex(int decimalValue) {
	        StringBuilder hexBuilder = new StringBuilder();

	        while (decimalValue > 0) {
	            int remainder = decimalValue % 16;
	            char hexDigit;

	            if (remainder < 10) {
	                hexDigit = (char) (remainder + '0');
	            } else {
	                hexDigit = (char) (remainder - 10 + 'A');
	            }

	            hexBuilder.insert(0, hexDigit);
	            decimalValue /= 16;
	        }

	        return hexBuilder.toString();
	    }
	
}
