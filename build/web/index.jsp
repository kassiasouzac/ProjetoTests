<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title> Trabalho A1 </title>
        
        <style type="text/css">
            .formulario {
                margin: 10px;
                padding: 10px;
            }
            
            h1 {
                text-align: center;
            }
            
            .radioSexo {
                margin-left: 500px;
            }
            
            .radio2 {
                margin-left: 100px;
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
       
       <br> <h1> Cadastro de Funcionários </h1> <br>
       
       <!-- Formulário dos funcionários -->
       
       <div class="formulario">
           
       <form method="post" action="inserirNoBanco.jsp" name="formInsert">
        <div class="form-group">
          <label for="inputAddress"> Nome do funcionário: </label>
          <input type="text" class="form-control" id="inputNome" name="Nome_Completo" id="nome" >
        </div>
                   
        <div class="form-row">              
            <div class="col">
                Data de Nascimento: <input type="date" name="Data_Nascimento" class="form-control" placeholder="dd/mm/aaaa">
            </div>
        </div>        
           <br>
           
            <div class="form-row">              
              <div class="col">
                Número do RG: <input type="text" name="Numero_RG" class="form-control">
              </div>
              <div class="col">
                Órgão Emissor: <input type="text" name="Orgao_Emissor" class="form-control">
              </div>
              <div class="col">
                Número do CPF: <input type="text" name="Numero_CPF" class="form-control">
              </div>            
            </div>
        <br>
                    
        <div class="form-row">
            <div class="form-group col-md-6">
              <label for="inputEndereco"> Endereço: </label>
              <input type="text" class="form-control" id="inputEndereco" name="Endereco">
            </div>
            <div class="form-group col-md-6">
              <label for="inputNumero"> Número: </label>
              <input type="text" class="form-control" id="inputNumero" name="Numero">
            </div>
        </div>
           
        <div class="form-row">
            <div class="form-group col-md-6">
              <label for="inputComplemento"> Complemento: </label>
              <input type="text" class="form-control" id="inputComplemento" name="Complemento">
            </div>
            <div class="form-group col-md-6">
              <label for="inputBairro"> Bairro: </label>
              <input type="text" class="form-control" id="inputBairro" name="Bairro">
            </div>
        </div>
           
        <div class="form-row">
          <div class="form-group col-md-6">
            <label for="inputCity"> Cidade: </label>
            <input type="text" class="form-control" id="inputCity" name="Cidade">
          </div>

          <div class="form-group col-md-4">
            <label for="inputEstado"> Estado: </label>
            <select id="inputEstado" class="form-control" name="Estado">
              <option selected>Escolher...</option>
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
              <input type="text" class="form-control" id="inputTelefone" name="Telefone">
            </div>
            <div class="form-group col-md-6">
              <label for="inputCelular"> Celular: </label>
              <input type="text" class="form-control" id="inputBairro" name="Celular">
            </div>
        </div>         
        
        <div class="form-row">
            <div class="form-group col-md-6">
              <label for="inputNumero_CTPS"> Número CTPS: </label>
              <input type="text" class="form-control" id="inputTelefone" name="Numero_CTPS">
            </div>
            <div class="form-group col-md-6">
              <label for="inputNumero_PIS"> Número PIS: </label>
              <input type="text" class="form-control" id="inputBairro" name="Numero_PIS">
            </div>
        </div> <br>
        
        <div class="radioSexo">
            
              <input  type="radio" name="feminino" id="inlineRadio1" value="opcao1">
              <label for="inlineRadio1"> Feminino </label>
            
              <input class="radio2" type="radio" name="masculino" id="inlineRadio2" value="opcao2">
              <label for="inlineRadio2"> Masculino </label>
                      
        </div>
        
             <br> 
           
        <button type="submit" class="btn btn-primary"> Gravar </button>
        
       </form>
       </div>    
       
    </body>
</html>