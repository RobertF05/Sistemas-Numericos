package SistemasNumericos;

import java.util.Scanner;

public class Hexadecimal_Binario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);

		        System.out.print("Ingrese un valor hexadecimal: ");
		        String hex = tc.nextLine();

		        String binario = hexToBinary(hex);
		        System.out.println("El valor binario de "+hex+" es: " + binario);
		    }

		    public static String hexToBinary(String hex) {
		        StringBuilder binarioBuilder = new StringBuilder();

		        for (int i = 0; i < hex.length(); i++) {
		            char hexDigit = hex.charAt(i);
		            String binarioDigit = "";

		            if (hexDigit >= '0' && hexDigit <= '9') {
		                binarioDigit = Integer.toBinaryString(hexDigit - '0');
		            } else if (hexDigit >= 'A' && hexDigit <= 'F') {
		                binarioDigit = Integer.toBinaryString(hexDigit - 'A' + 10);
		            } else if (hexDigit >= 'a' && hexDigit <= 'f') {
		                binarioDigit = Integer.toBinaryString(hexDigit - 'a' + 10);
		            } else {
		                System.out.println("Valor hexadecimal inválido: " + hexDigit);
		            }

		            while (binarioDigit.length() < 4) {
		                binarioDigit = "0" + binarioDigit;
		            }

		            binarioBuilder.append(binarioDigit);
		        }

		        return binarioBuilder.toString();
		    }

	}
