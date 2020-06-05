package command;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Noticia;
import service.NoticiaService;

public class CadastroNot implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
				//Capturando o parametro descricao_not
				String descricao = request.getParameter("descricao_not");
				//Capturando o parametro titulo_not
				String titulo = request.getParameter("titulo_not");
				//Capturando o parametro texto_not
				String texto = request.getParameter("texto_not");				
								
				Noticia not = new Noticia();
				not.setDescricao(descricao);
				not.setTitulo(titulo);
				not.setTexto(texto);
				
				NoticiaService serv = new NoticiaService();				
				serv.cadastrarNot(not);
				
				//Se o user for null, então não existe o usuario com os dados informados cadastrados no sistema
				if(not != null) {
					//exiber msg de erro
					//adicionando uma informação na requisição
					request.setAttribute("mensagem", "Noticia cadastrada com sucesso!");

					try {
					//Redirecionando o user: (despachando)
					request.getRequestDispatcher("CadastroNot.jsp").forward(request, response);
					}catch(Exception ex) {
						ex.printStackTrace();
					}
				}

	}
}
