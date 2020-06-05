package command;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Comentario;
import model.Noticia;
import service.ComentarioService;
import service.NoticiaService;

public class ListarNotCom implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 PrintWriter saida = response.getWriter();
			
		    NoticiaService servN = new NoticiaService();
			ComentarioService serv = new ComentarioService();
			
			ArrayList<Noticia>lista = servN.listarNot();
			ArrayList<Comentario>lista2 = serv.listarCom();
			
			saida.println("<h2>Noticias e Comentarios</h2>");
			for(Noticia n : lista) {
				
				
				saida.println("<p><b>NOTICIA</b></p> <br>"
						+"<b><p3>Nº noticia:</b></p3><p2> " + n.getId()+"</p2>" 
						+ " <br><p3> <b>Titulo:</b></p3><br><p2>" + n.getTitulo()+"</p2>"
						+ "<br><p3><b>Descri��o:</b><br></p3><p2>" + n.getDescricao()+"</p2>"
						+ "<br><p3><b>Texto:</b> <br></p3><p2> "+ n.getTexto()+"</p2>"+ "<br> " + "<br> " );
				
				for(Comentario c : lista2) {
				if(c.getFk_noticia_id() == n.getId()) {
					
					saida.println( "<b>COMENTARIOS</b>"
							+ "<br><p3><b>Nome do comentarista:</b></p3><p2> " + c.getNome() +"</p2>"
							+ "<br><p3><b>Comentario:</b><br></p3><p2> "+ c.getTexto()+"</p2>" 
							+"<br><p3><b>Nº Comentario:</b></p3><p2> " + c.getId()+"</p2>" 
							+"<br><p3><b>Nº Noticia:</b></p3><p2> " + c.getFk_noticia_id()+"</p2>" 
							
							+ "<br> " + "<br>  <br>"  );
					
				}
				}
				
		
			}
			
			response.setContentType("text/html;charset=ISO-8859-1");
			
			saida.println("<!DOCTYPE html>"+
					"<html>"+
					"<head>"+
					"<meta charset=\"ISO-8859-1\">\r\n" + 
					"<title>Noticias e comentarios</title>"+
					"</head>"+
					"<style> "+
					  "h1{"+
						"color: white;"+
					"}"+
					"h2{"+
						"color: blue;"+
					"}"+

					"span{"+
						"color: blue;"+
					"}" +

					"p{"+
					    "color: blue;"+ 
					"}"+
					"p2{"+
					    "color: white;"+ 
					"}"+
					    
					"p3{"+
				    "color: yellow;"+ 
				    "}"+

					"body{"+

					" color: black;"+
					 "background-color:black;"+
					 "text-align:center;"+


					"}"+



					"</style>"+
					"<body>"+

					"<h1> Cadastro Comentario</h1>"+
					"<input type =\"submit\" value=\"Menu\" onclick =\"window.location.href = 'Menu.jsp'\"> <br>"+
					
						 "	<form action=\"controller.do\" method=\"post\">\r\n" + 
					       "<p>Digite seu nome:</p><br>"+
					      " <input type=\"text\" name = \"nome_com\"> <br><br>"+
					       
					       "<p>Numero da Noticia:</p><br>"+
					      " <input type = \"text\" name = \"fk_com\"> <br><br> "+
					              
					       "<p>Comentario:</p><br>"+
					       "<textarea type = \"text\" name = \"texto_com\" rows=\"10\" cols=\"30\"> </textarea> <br><br>"+
					      
						"<p>Após salvar o comentario, será redirecionado ao menu para poder voltar para ver seu comentario ou navegar em outras fuções.</p><br>"+
						"<input type=\"hidden\" name=\"command\" value=\"CadastroCom\">"+
					       "<input type =\"submit\"> <br>"+
					      
					      "</form>"+
					      
      					"<input type =\"submit\" value=\"Menu\" onclick =\"window.location.href = 'Menu.jsp'\"> "+


					"</body>"+
					"</html>");
	
		
		
	
		
	}

}
