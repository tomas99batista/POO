package aula11;

public class Regiao {
	private String nome;
	private int populacao;
	
	public Regiao(String nome, int populacao) {
		this.nome = nome;
		this.populacao = populacao;
	}

	@Override
	public String toString() {
		return "Regiao [nome=" + nome + ", populacao=" + populacao + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	
	
	
	
}
