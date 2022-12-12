<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
   <%@page import = "Model.User" %>
   <%@page import = "java.util.ArrayList" %>
   
   
   <%

    ArrayList<User> lista = (ArrayList<User>) request.getAttribute("users");


	%>
   

    
    <!DOCTYPE html>
<html lang="pt-br">
  <head>
    <!-- Meta tags Obrigatórias -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" >

    <title>Usuarios</title>
  </head>
  <body>
  
  
   
<table class="table table-dark">
  <thead>
    <tr>
      
      <th scope="col">Código</th>
      <th scope="col">Nome</th>
      <th scope="col">Telefone</th>
      <th scope="col">Email</th>
      <th scope="col">Senha</th>
    </tr>
  </thead>
  <tbody>
  
  <%
  for(int i=0;i<lista.size();i++){
  
  %>  
       
    <tr>
     
      <td><%=lista.get(i).getIdUsuario()%></td>
      <td><%=lista.get(i).getNome()%></td>
      <td><%=lista.get(i).getTelefone()%></td>
      <td><%=lista.get(i).getEmail()%></td>
      <td><%=lista.get(i).getSenha()%></td>
      <td><a href="selecionaruser?idusuario=<%=lista.get(i).getIdUsuario()%>"><button type="button" class="btn btn-primary">Editar</button></a></td>
      <td><a href="excluiruser?idusuario=<%=lista.get(i).getIdUsuario()%>"><button type="button" class="btn btn-primary">Excluir</button></a></td>
    </tr>
   
    <%} %>
    
  </tbody>
</table>









    <!-- JavaScript (Opcional) -->
    <!-- jQuery primeiro, depois Popper.js, depois Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" ></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" ></script>
  </body>
</html>