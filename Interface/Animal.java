package questao;

public class Animal {
	
	private String nome;
	private int idade;
	
	public String naoEmiteSom ()
	{
		return "nao emite som aparente.";
	}
	public String EmiteSom ()
	{
		return "Emite Som !";
	}
	
	public Animal (String nome, int idade, String corre, String Som)
	{
	this.nome = nome;
	this.idade = idade;
	}

	@Override
	
	public  String toString ()
	{
		return "Seu Nome é " +nome+ ", a idade dele é " +idade+ " anos";
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
	