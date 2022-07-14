package questaoHeranca;

public class cachorro extends Animal {
	private String correr;
	private String latir;
	
	public cachorro(String nome, int idade, String correr, String latir)
	{
		super (nome, idade);
		this.correr = correr;
		this.latir = latir;
		
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public String getLatir() {
		return latir;
	}

	public void setLatir(String latir) {
		this.latir = latir;
	}
					
		
}
