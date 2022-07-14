package questaoHeranca;

public class objeto {

	public static void main(String[] args) {

		Animal A1 = new Animal("toto", 2);
		cachorro A2 = new cachorro("rex", 22, "correr", "latir");
		preguica A3 = new preguica("tifany", 0, "sobeArvores", "NaoSom");
		cavalo A4 = new cavalo("julieta", 14, "correr", "relinchar");

		System.out.println("\n\t qual a idade do Animal?");
		System.out.println(A1.getIdade());
		
		System.out.println("\n\t o que esse animal A2 (cachorro) gosta de fazer ?");
		System.out.println(A2.getCorrer());
		
		System.out.println("\n\t o A3 (preguiça) Emite som ?");
		System.out.println(A3.getNaoSom());
		
		System.out.println("\n\to A4 (cavalo) emite som?");
		System.out.println(A4.getRelincha());
		
	}

}
