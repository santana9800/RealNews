package command;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Noticia;
import service.NoticiaService;

public class DeleteNot implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		// Capturando o par�metro nome_contato
	     String id = request.getParameter("id_not");
		
		
		int idNot = Integer.parseInt(id);
		
	
		Noticia noticia = new Noticia();
		noticia.setId(idNot );
		
		
		NoticiaService serv = new NoticiaService();
		
		serv.excluirNot(noticia);
		
		
		//Se o user for null, então não existe o usuario com os dados informados cadastrados no sistema
		if(noticia != null) {
			//exiber msg de erro
			//adicionando uma informação na requisição
			request.setAttribute("mensagem", "Noticia deletada");

			try {
			//Redirecionando o user: (despachando)
			request.getRequestDispatcher("DeletarNot.jsp").forward(request, response);
			}catch(Exception ex) {
				ex.printStackTrace();
			} 
			    
			
		}
		
		
		
		
	}

}
