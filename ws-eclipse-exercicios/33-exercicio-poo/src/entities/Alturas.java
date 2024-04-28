package entities;

public class Alturas {
	
	//ATTRIBUTE
	private String nome;
	private int idade;
	private double altura;
	
	//CONSTRUCTOR
	public Alturas() {
		
	}
	
	public Alturas(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	//GETTER AND SETTER
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
	
	public double getAltura() {
		return altura;
	}
	
	public void setNome(double altura) {
		this.altura = altura;
	}
}


