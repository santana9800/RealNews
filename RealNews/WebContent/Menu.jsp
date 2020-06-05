<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>
</head>
<style> 
  h1{
	color: white;
}
h2{
	color: blue;
}

span{
	color: blue;
} 

p{
    color: blue; 
}
p2{
    color: green; 
}

body{

 color: black;
 background-color:black;
 text-align:center;


}



</style>
<body>
<h1>Menu:</h1>
<a>Escolha o que deseja realizar</a>
<br><br>


<%--<input type = "submit"  value="Cadastrar noticias" onclick ="window.location.href = 'CadastroNot.jsp'"> <br><br>--%>
<button onclick="window.location.href = 'CadastroNot.jsp'">Cadastrar noticias</button><br><br>

<%--<input type = "submit"  value="Alterar noticia" onclick ="window.location.href = 'AlterarNot.jsp'"> --%>
<button onclick="window.location.href = 'AlterarNot.jsp'">Alterar noticia</button><br><br>


<%--<input type = "submit" value="Excluir noticia"  onclick ="window.location.href = 'DeletarNot.jsp'"> <br><br>--%>
<button onclick="window.location.href = 'DeletarNot.jsp'">Excluir noticia</button><br><br>

<form action="controller.do" >
<input type="hidden" name="command" value="ListarNotCom">
<input type = "submit" value="Ver noticias e adicionar comentarios" > 
</form>



</body>
</html>