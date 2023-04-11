package src;

import java.util.Scanner;

public class matriz {

	/* Alunas: Roberta Mucuta Coelho, Gabrielly Gonçalves Abati e Laura Lima Pinheiro
	 * turma: 2 º TI, vespertino.
	 */
	
	public static void main (String[]args) {
		
			Scanner Leitor = new Scanner(System.in);
		
			System.out.println("Matriz dos cofatores");
			
			System.out.print("Número de linha da matriz: ");
			int LinhaM = Leitor.nextInt();
			
			System.out.print("Número de coluna da matriz: ");
			int ColunaM = Leitor.nextInt();
			
			
			int matriz[][] = new int[LinhaM][ColunaM];
			int contadorL = 0;
			int contadorC = 0; 	
			int cal1;
			int cal2;
			int cal3;
			int cal4;
			int cal5;
			int cal6;
			int Det;
			
package programation;

import java.util.Scanner;

public class matriz {
	/* Alunas: Roberta Mucuta Coelho, Gabrielly Gonçalves Abati e Laura Lima Pinheiro
	 * turma: 2 º TI, vespertino.
	 */
	
	public static void main (String[]args) {
		
			Scanner Leitor = new Scanner(System.in);
		
			System.out.println("Matriz dos cofatores");
			
			System.out.print("Número de linha da matriz: ");
			int LinhaM = Leitor.nextInt();
			
			System.out.print("Número de coluna da matriz: ");
			int ColunaM = Leitor.nextInt();
			
			
			int matriz[][] = new int[LinhaM][ColunaM];
			int contadorL = 0;
			int contadorC = 0; 	
			int cal1;
			int cal2;
			int cal3;
			int cal4;
			int cal5;
			int cal6;
			int Det;
			
		
			
			while(contadorL < LinhaM ) {
				contadorC = 0;
			
				while(contadorC < ColunaM) {
					System.out.print("Digite linha " + (contadorL + 1) + " e coluna " + (contadorC + 1)+ ":");
					matriz[contadorL][contadorC]= Leitor.nextInt();
					contadorC++;
			}
				contadorL++;
			}
			// calculo do determinante
			cal1 = matriz[0][0] * matriz[1][1] * matriz[2][2];
			cal2 = matriz[1][0] * matriz[2][1] * matriz[0][2];
			cal3 = matriz[2][0] * matriz[0][1] * matriz[1][2];
			cal4 = matriz[0][2] * matriz[1][1] * matriz[2][0];
			cal5 = matriz[1][2] * matriz[2][1] * matriz[0][0];
			cal6 = matriz[2][2] * matriz[0][1] * matriz[1][0];
			Det = cal1 + cal2 + cal3 - 1 * (cal4 + cal5 + cal6);
			System.out.println("O Determinante da matriz é: " + Det);
			
			// calculo da matriz dos cofatores
			
			matriz[0][0] = 1 * ((matriz[1][1] * matriz[2][2]) - (matriz[1][2] * matriz[2][1]));
			matriz[1][0] = 1 * ((matriz[0][1] * matriz[2][2]) - (matriz[0][2] * matriz[2][1]));
			matriz[2][0] = 1 * ((matriz[0][1] * matriz[1][2]) - (matriz[0][2] * matriz[1][1]));
			matriz[0][1] = 1 * ((matriz[1][0] * matriz[2][2]) - (matriz[1][2] * matriz[2][0]));
			matriz[1][1] = 1 * ((matriz[0][0] * matriz[2][2]) - (matriz[0][2] * matriz[2][0]));
			matriz[2][1] = 1 * ((matriz[0][0] * matriz[1][2]) - (matriz[0][2] * matriz[1][0]));
			matriz[0][2] = 1 * ((matriz[1][0] * matriz[2][1]) - (matriz[1][1] * matriz[2][0]));
			matriz[1][2] = 1 * ((matriz[0][0] * matriz[2][1]) - (matriz[0][1] * matriz[2][0]));
			matriz[2][2] = 1 * ((matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][1]));
			
			System.out.println("A matriz dos cofatores é: \n[" +matriz[0][0]+ "] [" +matriz[1][0]+ "] [" +matriz[2][0]+ "] \n[" +matriz[0][1]+ "] [" +matriz[1][1]+ "] [" +matriz[2][1]+ "] \n[" +matriz[0][2]+ "] [" +matriz[1][2]+ "] ["+ matriz[2][2]+ "]");
			
			// calculo da matriz transposta
			
			matriz[0][0]= matriz[0][0];
			matriz[0][1]= matriz[0][1];
			matriz[0][2]= matriz[0][2];
			matriz[1][0]= matriz[1][0];
			matriz[1][1]= matriz[1][1];
			matriz[1][2]= matriz[1][2];
			matriz[2][0]= matriz[2][0];
			matriz[2][1]= matriz[2][1];
			matriz[2][2]= matriz[2][2];
			
			System.out.println("A matriz transposta é: \n[" +matriz[0][0]+ "] [" +matriz[0][1]+ "] [" +matriz[0][2]+ "] \n[" +matriz[1][0]+ "] [" +matriz[1][1]+ "] [" +matriz[1][2]+ "] \n[" +matriz[2][0]+ "] [" +matriz[2][1]+ "] [" +matriz[2][2]+ "]");
			
			double inversa = matriz[0][0] + matriz[1][0] + matriz[2][0] + matriz[0][1]+ matriz[1][1] + matriz[2][1] + matriz[0][2] + matriz[1][2] + matriz[2][2]  / Det;
			System.out.println("A divisão da matriz transposta pelo determinante da matriz original é: " + inversa);
			
		
	}
	
}
