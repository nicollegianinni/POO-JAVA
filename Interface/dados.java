package questao;

public class dados {

	public static void main(String[] args) {
		
	cachorro brincalhao = new cachorro("toto", 2, "poodle");
	preguica esperta = new preguica("bibi", 10, "escala");
	cavalo rapido = new cavalo("pegasus", 6, "preto");
	
	
	System.out.println(" O nome do Animal é ");
	System.out.println(brincalhao.getNome());
	System.out.println("tem ");
	System.out.println(brincalhao.getIdade());
	System.out.println("anos");
	System.out.println("Ele emite som ?");
	System.out.println(brincalhao.EmiteSom());
	System.out.println();
	System.out.println("como ele se locomove?");
	System.out.println(" Ele corre! ");
	
	
	// outra maneira de puxar as informações, abaixo:
	
	// dados cachorro
	System.out.println("\n\t");
	System.out.println(brincalhao.toString());
	
	// dados cavalo
	System.out.println("\n\t");
	System.out.println(rapido.toString());
	// dados preguiça
	System.out.println("\n\t");
	System.out.println(esperta.toString());
	
	}
	
	
	

}
