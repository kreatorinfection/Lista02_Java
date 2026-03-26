package prjLista02;

import java.util.Scanner;

public class ex16 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();

	        if (numero > 0) {
	            System.out.println("O número é positivo");

	            if (numero > 50) {
	                System.out.println("Além disso o número é maior que 50");
	            }
	        } else {
	            System.out.println("O número não é positivo");
	        }

	        
	    }
	}