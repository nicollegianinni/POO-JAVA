package Herança;

public class exAnimal {
	
	
	//ATRIBUTOS = ESTADOS
	
	private int patas;
	private String revestimento;
	
	//METODOS = COMPORTAMENTOS
	
	public void movimento()
	{
		System.out.println("movimentando ");
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getRevestimento() {
		return revestimento;
	}

	public void setRevestimento(String revestimento) {
		this.revestimento = revestimento;
	}
	

}
