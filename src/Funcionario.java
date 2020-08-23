
public class Funcionario {
	private int matricula;
	private String nome;
	private double salarioinicial;
	private double salarioatual;
	private double taxa;
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioinicial() {
		return salarioinicial;
	}

	public void setSalarioinicial(double salarioinicial) {
		this.salarioinicial = salarioinicial;
	}

	public double getSalarioatual() {
		return salarioatual;
	}

	public void AtualizarSalario() {
		this.salarioatual = salarioinicial + salarioinicial*(this.taxa/100);
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
}
