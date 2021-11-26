<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page  import = "crudTrabalhoA1.conexao.ConexaoBD" %>

<!DOCTYPE html>
<html>
    
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title> Excluindo Funcionário </title>
        
        <style type="text/css">
                      
        h1, p {
          text-align: center;
        }
         
    </style>
        
    </head>
<body>
    
 <!-- HEADER -->
       
       <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="index.jsp"> Atividade </a>
        
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Alterna navegação">
          <span class="navbar-toggler-icon"></span>
        </button>
        
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link" href="index.jsp"> Inserir </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="funcionariosLista.jsp"> Listar </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="funcionariosLista.jsp"> Editar </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="deletarFuncionarios.jsp"> Deletar </a>
            </li>
          </ul>
        </div>
      </nav>
       
       <!-- FIM DA HEADER -->
       
  <%
     int Codigo_Funcionario = Integer.parseInt(request.getParameter("Codigo_Funcionario"));
     int r = ConexaoBD.Delete(Codigo_Funcionario);
     if (r > 0) {
    		%>
                
    		<br> <br> <h1> Tudo certo! Funcionário excluído. </h1>
                        
    		<%
    			} else {
    		%>
                
    		<br> <br> <h1>Falha! O funcionário NÃO foi excluído. </h1>
                        
    		<%
    			}
    		%>
                
                <p> Continue navegando pelo projeto através do header! </p>

</body>
</html>