package prjLista02;

import java.util.Scanner;

public class ex05 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a temperatura: ");
	        double temperatura = scanner.nextDouble();

	        if (temperatura > 30) {
	            System.out.println("A temperatura é maior que 30 graus");
	        } else {
	            System.out.println("A temperatura não é maior que 30 graus");
	        }

	        
	    }
	}