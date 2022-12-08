package Callc;

public class Entitis {

	private String nome;
	private Double salario;
	private Integer id;

	public Entitis() {

	}

	public Entitis(String nome, Double salario, Integer id) {
		this.nome = nome;
		this.salario = salario;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public void percetSalario(Double PSalario) {
		salario += salario * PSalario / 100;
	}
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
	
	
}
