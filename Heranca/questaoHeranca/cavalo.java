package questaoHeranca;

public class cavalo extends Animal {

	private String correr;
	private String relincha;
	
	public cavalo (String nome, int idade, String correr, String relincha)
	{
		super (nome,idade);
		this.correr = correr;
		this.relincha = relincha;
		
	
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public String getRelincha() {
		return relincha;
	}

	public void setRelincha(String relincha) {
		this.relincha = relincha;
	}
}
