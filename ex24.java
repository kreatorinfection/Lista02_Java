package prjLista02;

import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();

	        if (numero == 10 || numero == 20) {
	            System.out.println("O número é especial.");
	        } else {
	            System.out.println("O número não é especial.");
	        }

	        scanner.close();
	    }
	}