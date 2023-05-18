package SistemasNumericos;

import java.util.Scanner;

public class Decimal_Octal {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese un valor decimal: ");
	        int decimalValue = scanner.nextInt();

	        String octalValue = decimalToOctal(decimalValue);
	        System.out.println("El valor octal es: " + octalValue);
	    }

	    public static String decimalToOctal(int decimalValue) {
	        StringBuilder octalBuilder = new StringBuilder();

	        while (decimalValue > 0) {
	            int remainder = decimalValue % 8;
	            octalBuilder.insert(0, remainder);
	            decimalValue /= 8;
	        }

	        return octalBuilder.toString();
	    }

}
