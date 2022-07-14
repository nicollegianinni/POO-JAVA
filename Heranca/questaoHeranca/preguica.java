package questaoHeranca;

public class preguica extends Animal{
	
	private String SobeArvores;
	private String NaoSom;
	
	public preguica (String nome, int idade, String SobeArvores,String NaoSom )
	{
		super (nome,idade);
		this.SobeArvores = SobeArvores;
		this.NaoSom = NaoSom;
		
	}

	public String getSobeArvores() {
		return SobeArvores;
	}

	public void setSobeArvores(String sobeArvores) {
		SobeArvores = sobeArvores;
	}

	public String getNaoSom() {
		return NaoSom;
	}

	public void setNaoSom(String naoSom) {
		NaoSom = naoSom;
	}
	

}
