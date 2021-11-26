<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<%@ page  import = "crudTrabalhoA1.conexao.ConexaoBD" %>
<%@ page  import = "crudTrabalhoA1.modelo.Funcionario" %>


<!DOCTYPE html>
<html>
    
<head>
    <meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <title> Inserindo Funcionário </title>

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
              <a class="nav-link" href="editarFuncionarios.jsp"> Editar </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="deletarFuncionarios.jsp"> Deletar </a>
            </li>
          </ul>
        </div>
      </nav>
       
       <!-- FIM DA HEADER -->
       
	<%
		Funcionario f = new Funcionario();
		f.setNome_Completo(request.getParameter("Nome_Completo"));
                f.setData_Nascimento(request.getParameter("Data_Nascimento"));
		f.setNumero_RG(request.getParameter("Numero_RG"));
                f.setOrgao_Emissor(request.getParameter("Orgao_Emissor"));
                f.setNumero_CPF(request.getParameter("Numero_CPF"));
                f.setEndereco(request.getParameter("Endereco"));
                f.setNumero(request.getParameter("Numero"));
                f.setComplemento(request.getParameter("Complemento"));
                f.setBairro(request.getParameter("Bairro"));
                f.setCidade(request.getParameter("Cidade"));
                f.setEstado(request.getParameter("Estado"));
                f.setTelefone(request.getParameter("Telefone"));
                f.setCelular(request.getParameter("Celular"));
                f.setNumero_CTPS(request.getParameter("Numero_CTPS"));
                f.setNumero_PIS(request.getParameter("Numero_PIS"));                
		int r = ConexaoBD.Insert(f); 
		if (r > 0) {
	%>
        
	<br> <br> <h1> Tudo certo! Funcionário cadastrado. </h1>
                
	<%
		} else {
	%>
        
        <br> <br> <h1> Falha! Funcionário NÃO cadastrado. </h1>
                
	<%
		}
	%>

        <p> Continue navegando pelo projeto através do header! </p>
</body>
</html>