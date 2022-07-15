package colletion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excecao {

	// demostra o lancamento de uma exceção quando ocorre uma divisão por zero

	public static int quociente (int numerador,int denominador) throws ArithmeticException {
			return numerador / denominador;
		}

	public static void main(String[] args) {
			Scanner leia = new Scanner (System.in);
			
			boolean continueLoop = true; //  variavel 
			
			do {
				try {
			
				System.out.println("\n Entre com um numero:");
				int numerador =leia.nextInt();
				
				System.out.println("\n Entre com um denominador:");
				int denominador =leia.nextInt();
				int resultado = quociente (numerador ,denominador);
				System.out.printf("\n Resultado %d / %d = %d", numerador,denominador,resultado);
				
			//	continueLoop = false; se quiser que a opeção pare quando o usuario digitar o numero e denominador
				}
				
				catch(InputMismatchException inputMismatchException) {
					
			//	System.err.printf("Exceção :\n %s\n", inputMismatchException); /se quiser mostrar o erro ao usuario
				leia.nextLine();
				System.out.println("|n você deve entrar com um valor tipo inteiro, por favor!");
				
					
				}
				catch(ArithmeticException arithmaticException ) {
				// 	System.err.printf("\n Exceção: %s\n ", arithmaticException); / se quiser mostrar o erro ao usuario
					System.out.println("\n Zero é um denominador invalido! por favor tente novamente...");
				}
			}
				while(continueLoop);
			
		}
		
}
