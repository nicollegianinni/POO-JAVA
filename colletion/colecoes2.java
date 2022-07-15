package colletion;

import java.util.ArrayList;
import java.util.Scanner;

public class colecoes2 {

	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do{
			System.out.println("\n -------------------------------------------------------");
			System.out.println("\n (1) deseja adicionar produtos ao estoque? ");
			System.out.println("\n (2)  desejo remover produtos do estoque? ");
			System.out.println("\n (3) desejo atualizar produtos do estoque ?");
			System.out.println("\n (4) deseja mostrar todos os produtos do estoque");
			System.out.println("\n (0) deseja encerrar o programa  ?");
			System.out.println("\n---------------------------------------------------------");
			System.out.println("\n digite uma opção:");
			op = leia.nextInt();
			
						
			switch (op) {
			case 1:
			leia.nextLine();
			System.out.println("\n Digite o produto para adicionar ao estoque: ");
			String produto = leia.nextLine();
			estoque.add(produto);
			break;
			
			case 2:
			leia.nextLine();
			System.out.println("\n Digite o produto que quer remover : ");
			String produtor = leia.nextLine(); // produtor nome do produto que quer remover 
			estoque.add(produtor);
			
			if (estoque.contains(produtor))	{
				estoque.remove(produtor);
			}
			else {
				System.out.println("\n  produto nao existe no estoque !");
				break;
			}
				
				
				case 3:
					System.out.println("\n digite o produto que quer atualizar:");
					String verifica = leia.nextLine();
					System.out.println("\n digite o produto que entrara no lugar dele:"+verifica+ " ; ");
					String novo = leia.nextLine();
				    
							if(estoque.contains(verifica)){
								estoque.remove(verifica);
								estoque.add(novo);
							
							}
							else 
								System.out.println("\n produto nao existe no estoque !");
							System.out.println(estoque);
							break;
							
				case 4: System.out.println("\n Todos os produtos são esse :");
				System.out.println(estoque);
				break;
				
				case 0 :
					System.out.println("\n finalizou o programa.");
					
				default:
					System.out.println("\na Opção invalida!!!");
			}
			}
		
			while (op!=0);
			
		
		
		}
 }

