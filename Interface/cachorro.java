package questao;

public class cachorro extends Animal implements correr {
	
	private String raca;
	
	public cachorro ( String nome, int idade, String raca)
	{
		super ( nome , idade, raca, raca);
		this.raca = raca;		
	}
	
	@Override
	
	public String toString()
	{
		return " é um cachorro, " +super.toString()+ ", Raça: "+raca;
		
	}
	

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void correr() {
		System.out.println("ele corre!");
		
	}

}
