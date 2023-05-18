package SistemasNumericos;

import java.util.Scanner;

public class Hexadecimal_Octal {

	    public static void main(String[] args) {
	        Scanner tc = new Scanner(System.in);
	        System.out.print("Ingrese un valor hexadecimal: ");
	        String hexValue = tc.nextLine();

	        String octalValue = hexToOctal(hexValue);
	        System.out.println("El valor octal es: " + octalValue);
	    }

	    public static String hexToOctal(String hexValue) {
	        // Primero, convertimos el valor hexadecimal a decimal
	        int decimalValue = Integer.parseInt(hexValue, 16);

	        // Luego, convertimos el valor decimal a octal
	        StringBuilder octalBuilder = new StringBuilder();

	        while (decimalValue > 0) {
	            int remainder = decimalValue % 8;
	            octalBuilder.insert(0, remainder);
	            decimalValue /= 8;
	        }

	        return octalBuilder.toString();
	    }

}
