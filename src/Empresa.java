
public class Empresa {
	
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setMatricula(1234);
		f.setNome("Maria Ribeiro");
		f.setTaxa(5);
		f.setSalarioinicial(2500);
		f.AtualizarSalario();
		
		System.out.println("Matrícula: " + f.getMatricula());
		System.out.println("Nome: " + f.getNome());
		System.out.println("Taxa: " + f.getTaxa());
		System.out.println("Salário Inicial: " + f.getSalarioinicial());
		System.out.println("Salário Atualizado: "+f.getSalarioatual());
	}
	
}
