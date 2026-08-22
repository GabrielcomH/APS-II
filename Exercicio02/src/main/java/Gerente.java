
public class Gerente extends FuncionarioCLT{
	
	private int tamanhoEquipe;
	private double percentualBonus;
	
	public Gerente (String nome, String matricula, double salarioBase, String dataAdmissao, double valeTransporte, double valeAlimentacao, int tamanhoEquipe, double percentualBonus){
		
		super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
		this.tamanhoEquipe = tamanhoEquipe;
		this.percentualBonus = percentualBonus;
	}
	
	@Override
	public double calcularSalario() {
		double bonus = getSalarioBase() * this.percentualBonus;
		return super.calcularSalario() + bonus;
	}
	
	@Override
	public double calcularDesconto() {
		double descontoTotal = super.calcularDesconto();
		if (this.tamanhoEquipe > 10) {
		
			descontoTotal += 100.00;
		}
		
		return descontoTotal;
		
	}
	
}
