<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar Noticia</title>
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
    color: red; 
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
		
	 <h1> Cadastro Noticia</h1>
	 
	  <input type = "submit" value="Menu" onclick ="window.location.href = 'Menu.jsp'"> 
	 
	 
	 <form action= "controller.do" method ="post">
	 
	  <h2><c:out value="${requestScope.mensagem}"/></h2>
	 	 
	    <p2>Titulo:<br></p2>
       <input type = "text" name = "titulo_not"> <br><br>
     
       <p2> Descrição:<br></p2>
       <textarea type ="text" name = "descricao_not" rows="10" cols="30" ></textarea> <br><br>
      
        <p2>Texto:<br> </p2>
       <textarea type = "text" name = "texto_not" rows="10" cols="30" ></textarea> <br><br>
      
      <input type="hidden" name="command" value="CadastroNot">
      <input type = "submit">    <br> 
      
      </form>
      
      <input type = "submit" value="Menu" onclick ="window.location.href = 'Menu.jsp'"> 
      
      
    
     

</body>
</html>