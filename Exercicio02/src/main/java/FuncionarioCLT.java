public class FuncionarioCLT extends Funcionario{
	
	private double valeTransporte;
	private double valeAlimentacao;
	
	public funcionarioCLT (String nome, String matricula, double salarioBase, String dataAdmissao, double valeTransporte, double valeAlimentacao) {
		super(nome, matricula, salarioBase, dataAdmissao);
		this.valeAlimentacao = valeAlimentacao;
		this.valeTransporte = valeTransporte;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + this.valeAlimentacao + this.valeTransporte //parei aqui
	}
	
}
