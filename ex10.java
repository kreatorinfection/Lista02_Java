package prjLista02;

import java.util.Scanner;

public class ex10 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a nota do aluno: ");
	        double nota = scanner.nextDouble();

	        if (nota >= 7) {
	            System.out.println("Aluno aprovado!!!!!!");
	        } else {
	            System.out.println("Aluno reprovado");
	        }

	        scanner.close();
	    }
	}
