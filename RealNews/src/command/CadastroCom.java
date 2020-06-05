package command;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Comentario;
import service.ComentarioService;

	public class CadastroCom implements Command {

		@Override
		public void executar(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			// Capturando o par�metro descricao_not
						String nome = request.getParameter("nome_com");
						// Capturando o par�metro titulo_not
						String texto = request.getParameter("texto_com");
						// Capturando o par�metro texto_not
						String fk = request.getParameter("fk_com");
						
						// Criando um objeto de sa�da de dados:
						PrintWriter saida = response.getWriter();
						

						int fk_com = Integer.parseInt(fk);
						
						
						Comentario com = new Comentario();
						com.setNome(nome);
						com.setTexto(texto);
						com.setFk_noticia_id(fk_com);
						
						ComentarioService serv = new ComentarioService();
						
						serv.cadastrarCom(com);
						
						//Se o user for null, então não existe o usuario com os dados informados cadastrados no sistema
						if(com != null) {
							//exiber msg de erro
							//adicionando uma informação na requisição
							request.setAttribute("mensagem", "Comentario cadastrado com sucesso!");

							try {
							//Redirecionando o user: (despachando)
							request.getRequestDispatcher("Menu.jsp").forward(request, response);
							}catch(Exception ex) {
								ex.printStackTrace();
							}
						}
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
