package Exercicio01;

public class Aniversariante {
	private String nome;
	private DataAniversario dataAniversario;
	
	public String getNome() {
	    return nome;
	}

	public DataAniversario getDataAniversario() {
	    return dataAniversario;
	}
	
    public Aniversariante(String nome, int dia, int mes) {
        this.nome = nome;
        this.dataAniversario = new DataAniversario(dia, mes);
    }

    public Aniversariante(String nome, DataAniversario dataAniversario) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }
	
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    Aniversariante outro = (Aniversariante) obj;
	    return this.nome.equals(outro.nome)
	            && this.dataAniversario.equals(outro.dataAniversario);
	}
	
}
