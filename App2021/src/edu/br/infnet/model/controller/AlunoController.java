package edu.br.infnet.model.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.br.infnet.model.domain.Aluno;

public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AlunoController() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Aluno aluno = new Aluno(request.getParameter("nome"), request.getParameter("email"));
		
		aluno.setNome(request.getParameter("nome"));
		aluno.setEmail(request.getParameter("email"));
		aluno.setIdade(Integer.valueOf(request.getParameter("idade")));
		aluno.setMensalidade(Float.valueOf(request.getParameter("mensalidade")));
		aluno.setCurso(request.getParameter("curso"));
		aluno.setRegiao(request.getParameter("regiao"));
		aluno.setDisciplinas(request.getParameterValues("disciplinas"));
		aluno.impressao();
		
		request.getRequestDispatcher("confirmacao.html").forward(request, response);
	}

}
