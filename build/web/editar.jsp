<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page  import = "crudTrabalhoA1.conexao.ConexaoBD" %>
<%@ page  import = "crudTrabalhoA1.modelo.Funcionario" %>
<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title> Editando Funcionários </title>

 <style type="text/css">
            .formulario {
                margin: 10px;
                padding: 10px;
            }
            
            h1 {
                text-align: center;
            }
        </style>

</head>

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
       
       <br> <h1> Editando Funcionário </h1>
     <div class="formulario">  
        <form method="post" action="editarNoBanco.jsp" name="formEditar">
            
  <%
     int Codigo_Funcionario = Integer.parseInt(request.getParameter("Codigo_Funcionario"));
     
     Funcionario funcionario = ConexaoBD.getFuncionario(Codigo_Funcionario);
   %>  
   
        <div class="form-group">
            <label for="inputCodigo"> Código do funcionário: <%=funcionario.getCodigo_Funcionario() %></label> 
            <input type="hidden" name="Codigo_Funcionario" value=<%=funcionario.getCodigo_Funcionario() %> />
        </div>            
   
        <div class="form-group">
          <label for="inputAddress"> Nome do funcionário: </label>
          <input type="text" class="form-control" id="inputNome" name="Nome_Completo" id="nome" value=<%=funcionario.getNome_Completo() %> readonly>
        </div>
                   
        <div class="form-row">              
            <div class="col">
                Data de Nascimento: <input type="date" name="Data_Nascimento" class="form-control" value=<%=funcionario.getData_Nascimento() %> readonly>
            </div>
        </div>        
           <br>
           
            <div class="form-row">              
              <div class="col">
                Número do RG: <input type="text" name="Numero_RG" class="form-control" value=<%=funcionario.getNumero_RG() %> readonly>
              </div>
              <div class="col">
                Órgão Emissor: <input type="text" name="Orgao_Emissor" class="form-control" value=<%=funcionario.getOrgao_Emissor() %> readonly>
              </div>
              <div class="col">
                Número do CPF: <input type="text" name="Numero_CPF" class="form-control" value=<%=funcionario.getNumero_CPF() %> readonly>
              </div>            
            </div>
        <br>
                    
        <div class="form-row">
            <div class="form-group col-md-6">
              <label for="inputEndereco"> Endereço: </label>
              <input type="text" class="form-control" id="inputEndereco" name="Endereco" value=<%=funcionario.getEndereco() %>>
            </div>
            <div class="form-group col-md-6">
              <label for="inputNumero"> Número: </label>
              <input type="text" class="form-control" id="inputNumero" name="Numero" value=<%=funcionario.getNumero() %>>
            </div>
        </div>
           
        <div class="form-row">
            <div class="form-group col-md-6">
              <label for="inputComplemento"> Complemento: </label>
              <input type="text" class="form-control" id="inputComplemento" name="Complemento" value=<%=funcionario.getComplemento() %>>
            </div>
            <div class="form-group col-md-6">
              <label for="inputBairro"> Bairro: </label>
              <input type="text" class="form-control" id="inputBairro" name="Bairro" value=<%=funcionario.getBairro() %>>
            </div>
        </div>
           
        <div class="form-row">
          <div class="form-group col-md-6">
            <label for="inputCity"> Cidade: </label>
            <input type="text" class="form-control" id="inputCity" name="Cidade" value=<%=funcionario.getCidade() %>>
          </div>

          <div class="form-group col-md-4">
            <label for="inputEstado"> Estado: </label>
            <select id="inputEstado" class="form-control" name="Estado">         
              <option value="<%=funcionario.getEstado() %>" selected> <%=funcionario.getEstado() %> </option>
              <option value="RO">RO</option>
              <option value="AC">AC</option>
              <option value="AM">AM</option>
              <option value="RR">RR</option>
              <option value="PA">PA</option>
              <option value="AP">AP</option>
              <option value="TO">TO</option>
              <option value="MA">MA</option>
              <option value="PI">PI</option>
              <option value="CE">CE</option>
              <option value="RN">RN</option>
              <option value="PB">PB</option>
              <option value="PE">PE</option>
              <option value="AL">AL</option>
              <option value="SE">SE</option>
              <option value="BA">BA</option>
              <option value="MG">MG</option>
              <option value="ES">ES</option>
              <option value="RJ">RJ</option>
              <option value="SP">SP</option>
              <option value="PR">PR</option>
              <option value="SC">SC</option>
              <option value="RS">RS</option>
              <option value="MS">MS</option>
              <option value="MT">MT</option>
              <option value="GO">GO</option>
              <option value="DF">DF</option>
            </select>
          </div>      
           
        </div>
           
        <div class="form-row">
            <div class="form-group col-md-6">
              <label for="inputTelefone"> Telefone: </label>
              <input type="text" class="form-control" id="inputTelefone" name="Telefone" value=<%=funcionario.getTelefone() %>>
            </div>
            <div class="form-group col-md-6">
              <label for="inputCelular"> Celular: </label>
              <input type="text" class="form-control" id="inputCelular" name="Celular" value=<%=funcionario.getCelular() %>>
            </div>
        </div>         
        
        <div class="form-row">
            <div class="form-group col-md-6">
              <label for="inputNumero_CTPS"> Número CTPS: </label>
              <input type="text" class="form-control" id="inputCTPS" name="Numero_CTPS" value=<%=funcionario.getNumero_CTPS() %>>
            </div>
            <div class="form-group col-md-6">
              <label for="inputNumero_PIS"> Número PIS: </label>
              <input type="text" class="form-control" id="inputPIS" name="Numero_PIS" value=<%=funcionario.getNumero_PIS() %>>
            </div>
        </div> <br>
        
             <br> 
           
        <button type="submit" class="btn btn-primary"> Editar </button>
        
       </form>
       </div>
</body>
</html>