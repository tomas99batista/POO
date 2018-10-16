package aula05;

public class Pessoa {
	
	private String nome;
	private int cc;
	private Data dataNasc;
	
	public Pessoa(String nome, int cc, Data dataNasc) {
		this.nome = nome;
		this.cc = cc;
		this.dataNasc = dataNasc;
	}
	public Pessoa(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", CC: " + cc + ", Data de Nascimento: " + dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public Data getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	

	
}
