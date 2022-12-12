<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
      
<!DOCTYPE html>
<html lang="pt-br"> 
  <head>
    <!-- Meta tags Obrigatórias -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

    <title>Cadastro de Usuário</title>
  </head>
  <body>
  
  <div class="container">
  
    <form action="novouser">
    
  <div class="form-group">
    <label for="idusuario">Código do Usuário</label>
    <input type="text" class="form-control" name="idusuario">
  </div>
  
  <div class="form-group">
    <label for="nome">Nome</label>
    <input type="text" class="form-control" id="" placeholder="Digite seu Nome" name="nome">
  </div>
  
  <div class="form-group">
    <label for="telefone">Telefone</label>
    <input type="text" class="form-control" id="" placeholder="Digite seu Telefone" name="telefone">
  </div>
  
    <div class="form-group">
    <label for="email">Email</label>
    <input type="text" class="form-control" id="" placeholder="Digite seu Email" name="email">
  </div>
  
    <div class="form-group">
    <label for="senha">Senha</label>
    <input type="password" class="form-control" id="" placeholder="Senha" name="senha">
  </div>
  
  <button type="submit" class="btn btn-primary">Enviar</button>
</form>
 </div>
    <!-- JavaScript (Opcional) -->
    <!-- jQuery primeiro, depois Popper.js, depois Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  </body>
</html>