<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <!DOCTYPE html>
<html lang="pt-br">
  <head>
   
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

    <title>Editar Usuario</title>
  </head>
  <body>
  
  <div class="container">
  
  <form action="editaruser">
 
  <div class="form-group">
    <label for="idproduto">Código do Usuário</label>
    <input type="text" class="form-control" name="idusuario" value="<% out.print(request.getAttribute("idusuario"));%>">   
  </div>
  
  <div class="form-group">
    <label for="nome">Nome</label>
    <input type="text" class="form-control" id="" placeholder="Digite Nome" name="nome" value="<% out.print(request.getAttribute("nome"));%>">
  </div>
  
  <div class="form-group">
    <label for="telefone">Telefone</label>
    <input type="text" class="form-control" id="" placeholder="Digite Preco" name="telefone" value="<% out.print(request.getAttribute("telefone"));%>">
  </div>
  
    <div class="form-group">
    <label for="email">Email</label>
    <input type="text" class="form-control" id="" placeholder="Digite Email" name="email" value="<% out.print(request.getAttribute("email"));%>">
  </div>
  
    <div class="form-group">
    <label for="senha">Senha</label>
    <input type="password" class="form-control" id="" placeholder="Senha" name="senha" value="<% out.print(request.getAttribute("senha"));%>">
  </div>
  
  <button type="submit" class="btn btn-primary">Enviar</button>
</form>

</div>
   
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  </body>
</html>