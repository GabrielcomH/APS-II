public class FuncionarioCLT extends Funcionario{
	
	private double valeTransporte;
	private double valeAlimentacao;
	
	public FuncionarioCLT (String nome, String matricula, double salarioBase, String dataAdmissao, double valeTransporte, double valeAlimentacao) {
		super(nome, matricula, salarioBase, dataAdmissao);
		this.valeAlimentacao = valeAlimentacao;
		this.valeTransporte = valeTransporte;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + this.valeAlimentacao + this.valeTransporte;
	}
	
	@Override 
	public double calcularDesconto() {
		return super.calcularDesconto() + 50.00;
	}
	
}
