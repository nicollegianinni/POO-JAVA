package questao;

public class cavalo extends Animal implements correr {

private String cor;
	
	public cavalo ( String nome, int idade, String cor)
	{
		super (nome,idade,cor, cor);
		this.cor =cor ;		
	}
	
	@Override
	
	public String toString()
	{
		return " O animal é um Cavalo, " +super.toString()+ ", Cor: "+cor;
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public void correr() {
		System.out.println("ele corre!");
		
	}


}


