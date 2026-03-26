package prjLista02;

import java.util.Scanner;

public class ex15 {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a temperatura: ");
	        double temperatura = scanner.nextDouble();

	        if (temperatura < 15) {
	            System.out.println("Frio");
	        } else if (temperatura <= 25) {
	            System.out.println("Agradável");
	        } else {
	            System.out.println("Quente");
	        }

	    }
	}