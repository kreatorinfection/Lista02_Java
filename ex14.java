package prjLista02;

import java.util.Scanner;

public class ex14 {
	
	 public static void main(String[] args) {

	 Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um número: ");
     int numero = scanner.nextInt();

     if (numero < 0) {
         System.out.println("Negativo");
     } else if (numero == 0) {
         System.out.println("Zero");
     } else {
         System.out.println("Positivo");
     }

    
 }
}