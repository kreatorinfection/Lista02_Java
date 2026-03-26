package prjLista02;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a idade: ");
	        int idade = scanner.nextInt();

	        if (idade <= 12) {
	            System.out.println("Criança");
	        } else if (idade >= 13 && idade <= 17) {
	            System.out.println("Adolescente");
	        } else {
	            System.out.println("Adulto");
	        }

	       
	    }
}


// Eu tambémf fiz uma versão, só que com bebê:

package prjLista02;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a idade: ");
	        int idade = scanner.nextInt();

	        if (idade == 4 && idade <=13) {
	            System.out.println("Criança");
	        }else if (idade <=3) {
	        	System.out.println("Bebê");
	        } else if (idade >= 13 && idade <= 17) {
	            System.out.println("Adolescente");
	        } else {
	            System.out.println("Adulto");
	        }

	       
	    }
}
