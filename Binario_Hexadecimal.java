package SistemasNumericos;

import java.util.Scanner;

public class Binario_Hexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner tc = new Scanner(System.in);
		        System.out.print("Ingrese un valor binario: ");
		        String binaryValue = tc.nextLine();

		        String hexValue = binaryToHex(binaryValue);
		        System.out.println("El valor hexadecimal es: " + hexValue);
		    }

		    public static String binaryToHex(String binaryValue) {
		        StringBuilder hexBuilder = new StringBuilder();
		        int binaryLength = binaryValue.length();

		        // Rellenar con ceros a la izquierda para que la longitud sea múltiplo de 4
		        while (binaryLength % 4 != 0) {
		            binaryValue = "0" + binaryValue;
		            binaryLength++;
		        }

		        // Convertir grupos de 4 bits a dígitos hexadecimales
		        for (int i = 0; i < binaryLength; i += 4) {
		            String binaryDigit = binaryValue.substring(i, i + 4);
		            int decimalValue = Integer.parseInt(binaryDigit, 2);
		            String hexDigit = Integer.toHexString(decimalValue).toUpperCase();
		            hexBuilder.append(hexDigit);
		        }

		        return hexBuilder.toString();
		    }
		}
