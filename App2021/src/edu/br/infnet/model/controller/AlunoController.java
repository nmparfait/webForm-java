package edu.br.infnet.model.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.br.infnet.model.domain.Aluno;

public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private List<Aluno> alunos;
    
    public AlunoController() {
    	super();
    	alunos = new ArrayList<Aluno>();
        
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
		
		alunos.add(aluno);
		
		PrintWriter out = response.getWriter();
		
		out.println(" <!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"	<head>\r\n" + 
				"		<meta charset=\"ISO-8859-1\">\r\n" + 
				"		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n" + 
				"		<title>App_2021: Confirma</title>\r\n" + 
				"	</head>\r\n" + 
				"	<body>\r\n" + 
				"		<div class=\"container\">\r\n" + 
				"			<a href='home.html'>Voltar</a>\r\n" + 
				"			<h2>Aluno "+aluno.getNome() +" cadastro com sucesso!!!!</h2>\r\n" + 
				"			<h3>Quantidade de alunos existentes: "+ alunos.size() +" </h3>\r\n" +  
				"		</div>	\r\n" + 
				"	</body>\r\n" + 
				"</html>");
		
		
		//list of users printed on the screen
		for(Aluno a: alunos) {
			out.println(" <!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"	<head>\r\n" + 
					"		<meta charset=\"ISO-8859-1\">\r\n" + 
					"		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n" + 
					"		<title>App_2021: Confirma</title>\r\n" + 
					"	</head>\r\n" + 
					"	<body>\r\n" + 
					"		<div class=\"container\">\r\n" + 
					"       <hr>\r\n"+
					"			<h3>Aluno: " + aluno.getNome() +" </h3>\r\n" +  
					"		</div>	\r\n" + 
					"	</body>\r\n" + 
					"</html>");
					
					
		}
		
		
		//request.getRequestDispatcher("confirmacao.html").forward(request, response);
	}

}
