package br.edu.ifpb.entidade;

public class Usuario {
	
	private String nome;
	private String data_nascimento;
	private String matricula;
	
	public Usuario() {		
		this.nome = " ";
		this.data_nascimento = " ";
		this.matricula = " ";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
