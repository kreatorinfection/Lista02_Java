package prjLista02;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();

	        if (numero < 10) {
	            System.out.println("Pequeno");
	        } else if (numero <= 50) {
	            System.out.println("Médio");
	        } else {
	            System.out.println("Grande");
	        }

	        
	    }
	}