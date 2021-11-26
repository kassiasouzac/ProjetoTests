<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page  import = "crudTrabalhoA1.conexao.ConexaoBD" %>
<%@ page  import = "crudTrabalhoA1.modelo.Funcionario" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title> Editando Funcionários </title>
    
    <style type="text/css">
                      
        h1, p {
          text-align: center;
        }
        
        th {
            font-size: 10px;
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
                f.setCodigo_Funcionario(Integer.parseInt(request.getParameter("Codigo_Funcionario")));
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
		int r = ConexaoBD.Update(f);
		if (r > 0) {
	%>
        <br> <br> <h1> Tudo certo! Funcionário alterado. </h1>
	<%
		} else {
	%>
        <br> <br> <h1> FALHA! O funcionário NÃO foi alterado. </h1>
	<%
		}
	%>

        <p> Continue navegando pelo projeto através do header! </p>
        
</body>
</html>