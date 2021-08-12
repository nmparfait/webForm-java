package edu.br.infnet.model.testes;

import java.util.ArrayList;
import java.util.List;

import edu.br.infnet.model.domain.Aluno;

public class AlunoTeste {
	
	public static void main(String[] args) {
		//caso1: criacao
		
		List<Aluno> alunos; 
		alunos = new ArrayList<Aluno>();
		
		Aluno a1 = new Aluno("Elberth", "elberth@gmail.com");
		Aluno a2 = new Aluno("Jose", "jose@jose.com");
		Aluno a3 = new Aluno("Robert", "robert@roberto.com");
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
	
		System.out.println("Aluno: " + alunos.get(0).getEmail());
		System.out.println("Quantindade: " + alunos.size());	
	
		for(Aluno aluno: alunos) {
			System.out.println("Aluno: " + aluno.getNome());
		}
		
	}

}
