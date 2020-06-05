<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Deletar Noticia</title>
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

	  <h1>Deletar professor</h1><br>
	  <h2><c:out value="${requestScope.mensagem}"/></h2>
	  <br>
      
	 <form action= "controller.do" method ="get">

     <p> Digite o código da noticia:</p>
      
       <input type = "text"  name = "id_not" > <br><br>
     
           
      <input type="hidden" name="command" value="DeleteNot">
      <input type = "submit"> <br>
      </form>
      <br>
      <br>
      
      <input type = "submit" value="Menu" onclick ="window.location.href = 'Menu.jsp'"> 

</body>
</html>