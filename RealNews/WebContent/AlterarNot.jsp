<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alterar Noticia</title>
</head>
<body>
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


<h1> Alterar Noticias</h1><br>
	 	<h2><c:out value="${requestScope.mensagem}"/></h2>

      <input type = "submit" value="Menu" onclick ="window.location.href = 'Menu.jsp'"> <br>

	 <form action= "controller.do" method ="post">

     <p> Codigo da Noticia:</p><br>
       <input type = "number"  name = "id_not" > <br><br>
     
     
       <p> Titulo:<br></p>
       <input  type = "text" name = "titulo_not"> <br><br>
       
       <p> Descrição:<br></p>
       <textarea type= "text" name = "descricao_not" rows="10" cols="30"></textarea> <br><br>
      
        <p>Texto:<br></p>
       <textarea type = "text" name = "texto_not"  rows="10" cols="30"></textarea><br><br>
      
      
      <input type="hidden" name="command" value="AlterarNot">
      <input type = "submit"> <br>
      </form>
      <br>
      <input type = "submit" value="Menu" onclick ="window.location.href = 'Menu.jsp'"> 
      

</body>
</html>