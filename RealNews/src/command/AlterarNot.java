package command;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Noticia;
import service.NoticiaService;

public class AlterarNot implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Capturando o par�metro id_not
				String id = request.getParameter("id_not");
				// Capturando o par�metro descricao_not
				String descricao = request.getParameter("descricao_not");
				// Capturando o par�metro titulo_not
				String titulo = request.getParameter("titulo_not");
				// Capturando o par�metro texto_not
				String texto = request.getParameter("texto_not");
				
				// Criando um objeto de sa�da de dados:
				PrintWriter saida = response.getWriter();
				
				int idNot = Integer.parseInt(id);
				
				
				Noticia not = new Noticia();
				not.setId(idNot);
				not.setDescricao(descricao);
				not.setTitulo(titulo);
				not.setTexto(texto);
				
				NoticiaService serv = new NoticiaService();
				serv.alterarNot(not);

				//Se o user for null, então não existe o usuario com os dados informados cadastrados no sistema
				if(not!= null) {
					//exiber msg de erro
					//adicionando uma informação na requisição
					request.setAttribute("mensagem", "Noticia Alterada");

					try {
					//Redirecionando o user: (despachando)
					request.getRequestDispatcher("AlterarNot.jsp").forward(request, response);
					}catch(Exception ex) {
						ex.printStackTrace();
					} 
					    
					
				}
		
	}

}
