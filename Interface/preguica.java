package questao;

public class preguica extends Animal{
	
 private int lenta;
 private String subir;
 
	public preguica ( String nome, int idade, String subir)
	{
		super (nome, idade, subir, subir);
		this.lenta = lenta;
		
	}
	
	@Override
	
	public String toString()
	{
		return " O animal é uma preguiça, "+super.toString()+ ", Velocidade "+lenta;
		
	}

	public int getLenta() {
		return lenta;
	}

	public void setLenta(int lenta) {
		this.lenta = lenta;
	}

	public String getSubir() {
		return subir;
	}

	public void setSubir(String subir) {
		this.subir = subir;
	}
	
}
