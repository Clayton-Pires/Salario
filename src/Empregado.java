
public class Empregado {
	private String nome;
	private String cargo;
	private double salario;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentarSalario(double percentual) {
		salario = salario + (salario * percentual)/100;
	}

	public void imprimir() {
		System.out.println("==================================");
		System.out.println("Nome = " + nome);
		System.out.println("Cargo = " + cargo);
		System.out.printf("Salário   = %.2\n" , salario);
		
	}
}
