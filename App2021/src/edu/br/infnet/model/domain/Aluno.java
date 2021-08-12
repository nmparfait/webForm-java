package edu.br.infnet.model.domain;

public class Aluno {
	
	private String nome;
	private String email;
	private int idade;
	private float mensalidade;
	private String curso;
	private String regiao;
	private String [] disciplinas;
	
	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public void impressao() {
		
		System.out.println(this);
		
		System.out.println("Disciplinas:");
		for (String disc : disciplinas) {
			System.out.println("-" + disc);
		}
		
		System.out.println("__________________________________");
	}

	
	//@Override
	//public String toString() {
	//	
	//	return String.format("[%s] O aluno %s tem %d anos; O seu email é (%s). Ele mora na região %s, está inscrito em %d disciplinas e paga R$ %f ! \n", 
	//			curso, nome, idade, email, regiao, disciplinas.length, mensalidade);	 
	//}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	

}
