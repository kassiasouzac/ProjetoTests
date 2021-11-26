<%@page import="crudTrabalhoA1.modelo.Funcionario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page  import = "crudTrabalhoA1.conexao.ConexaoBD" %>
<%@ page  import = "crudTrabalhoA1.modelo.Funcionario" %>
<%@ page import="java.util.ArrayList"%>


<!DOCTYPE html>
<html>
    <head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title> Alterando Funcionários </title>
    
    <style type="text/css">
                      
        h1 {
          text-align: center;
        }
        
        th {
            font-size: 7px;
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
       
       <br> <h1> Alterando Funcionário </h1> <br>
           
           <div class="table-responsive-sm">
            <table class="table table-bordered">
                    <th> Código do Funcionário </th>
                    <th> Nome Completo </th>
                    <th> Nascimento </th>
                    <th> Número do RG </th>
                    <th> Órgão Emissor </th>
                    <th> Número do CPF </th>
                    <th> Endereço </th>
                    <th> Número </th>
                    <th> Complemento </th>
                    <th> Bairro </th>
                    <th> Cidade </th>
                    <th> Estado </th>
                    <th> Telefone </th>
                    <th> Celular </th>
                    <th> Número do CTPS </th>
                    <th> Número do PIS </th>                    
                    <th> Editar </th>
                    <%
                    ArrayList<Funcionario> lista = ConexaoBD.getFuncionariosLista();
                    for (Funcionario f : lista) {
                    %><tr>
                        
                            <td><%=f.getCodigo_Funcionario()%></td>
                            <td><%=f.getNome_Completo()%></td>
                            <td><%=f.getData_Nascimento()%></td>
                            <td><%=f.getNumero_RG()%></td>
                            <td><%=f.getOrgao_Emissor()%></td>
                            <td><%=f.getNumero_CPF()%></td>
                            <td><%=f.getEndereco()%></td>
                            <td><%=f.getNumero()%></td>
                            <td><%=f.getComplemento()%></td>
                            <td><%=f.getBairro()%></td>
                            <td><%=f.getCidade()%></td>
                            <td><%=f.getEstado()%></td>
                            <td><%=f.getTelefone()%></td>
                            <td><%=f.getCelular()%></td>
                            <td><%=f.getNumero_CTPS()%></td>
                            <td><%=f.getNumero_PIS()%></td>
                            
                            <td><a href="editar.jsp?Codigo_Funcionario=<%= f.getCodigo_Funcionario() %>" /> Editar </td>
                                                    
                    </tr>
                    <%
                    }
                    %>
            </table>
           </div>
    </body>
</html>