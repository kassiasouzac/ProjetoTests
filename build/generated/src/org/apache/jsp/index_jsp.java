package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("        <title> Trabalho A1 </title>\r\n");
      out.write("        \r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            .formulario {\r\n");
      out.write("                margin: 10px;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            h1 {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .form-check form-check-inline input {\r\n");
      out.write("                padding-left: 80px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("            \r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("       <!-- HEADER -->\r\n");
      out.write("       \r\n");
      out.write("       <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\"> Atividade </a>\r\n");
      out.write("        \r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Alterna navegação\">\r\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("          <ul class=\"navbar-nav\">\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"index.jsp\"> Inserir </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"funcionariosLista.jsp\"> Listar </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"funcionariosLista.jsp\"> Editar </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"deletarFuncionarios.jsp\"> Deletar </a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("       \r\n");
      out.write("       <!-- FIM DA HEADER -->\r\n");
      out.write("       \r\n");
      out.write("       <br> <h1> Cadastro de Funcionários </h1> <br>\r\n");
      out.write("       \r\n");
      out.write("       <!-- Formulário dos funcionários -->\r\n");
      out.write("       \r\n");
      out.write("       <div class=\"formulario\">\r\n");
      out.write("           \r\n");
      out.write("       <form method=\"post\" action=\"inserirNoBanco.jsp\" name=\"formInsert\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"inputAddress\"> Nome do funcionário: </label>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"inputAddress\" name=\"Nome_Completo\" id=\"nome\" >\r\n");
      out.write("        </div>\r\n");
      out.write("              \r\n");
      out.write("        <div class=\"form-row\">\r\n");
      out.write("            <div class=\"form-group col-md-2\">\r\n");
      out.write("                <label for=\"inputNascimento\"> Data de Nascimento: </label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"inputCEP\" placeholder=\"dd/mm/aaaa\" name=\"Data_Nascimento\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-check form-check-inline\">\r\n");
      out.write("              <input class=\"form-check-input\" type=\"radio\" name=\"feminino\" id=\"inlineRadio1\" value=\"opcao1\">\r\n");
      out.write("              <label class=\"form-check-label\" for=\"inlineRadio1\"> Feminino </label>\r\n");
      out.write("            \r\n");
      out.write("              <input class=\"form-check-input\" type=\"radio\" name=\"masculino\" id=\"inlineRadio2\" value=\"opcao2\">\r\n");
      out.write("              <label class=\"form-check-label\" for=\"inlineRadio2\"> Masculino </label>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>           \r\n");
      out.write("        \r\n");
      out.write("            <div class=\"form-row\">              \r\n");
      out.write("              <div class=\"col\">\r\n");
      out.write("                Número do RG: <input type=\"text\" name=\"Numero_RG\" class=\"form-control\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col\">\r\n");
      out.write("                Órgão Emissor: <input type=\"text\" name=\"Orgao_Emissor\" class=\"form-control\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col\">\r\n");
      out.write("                Número do CPF: <input type=\"text\" name=\"Numero_CPF\" class=\"form-control\">\r\n");
      out.write("              </div>            \r\n");
      out.write("            </div>\r\n");
      out.write("        <br>\r\n");
      out.write("                    \r\n");
      out.write("        <div class=\"form-row\">\r\n");
      out.write("            <div class=\"form-group col-md-6\">\r\n");
      out.write("              <label for=\"inputEndereco\"> Endereço: </label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputEndereco\" name=\"Endereco\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group col-md-6\">\r\n");
      out.write("              <label for=\"inputNumero\"> Número: </label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputNumero\" name=\"Numero\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("           \r\n");
      out.write("        <div class=\"form-row\">\r\n");
      out.write("            <div class=\"form-group col-md-6\">\r\n");
      out.write("              <label for=\"inputComplemento\"> Complemento: </label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputComplemento\" name=\"Complemento\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group col-md-6\">\r\n");
      out.write("              <label for=\"inputBairro\"> Bairro: </label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputBairro\" name=\"Bairro\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("           \r\n");
      out.write("        <div class=\"form-row\">\r\n");
      out.write("          <div class=\"form-group col-md-6\">\r\n");
      out.write("            <label for=\"inputCity\"> Cidade: </label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"inputCity\" name=\"Cidade\">\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"form-group col-md-4\">\r\n");
      out.write("            <label for=\"inputEstado\"> Estado: </label>\r\n");
      out.write("            <select id=\"inputEstado\" class=\"form-control\" name=\"Estado\">\r\n");
      out.write("              <option selected>Escolher...</option>\r\n");
      out.write("              <option value=\"RO\">RO</option>\r\n");
      out.write("              <option value=\"AC\">AC</option>\r\n");
      out.write("              <option value=\"AM\">AM</option>\r\n");
      out.write("              <option value=\"RR\">RR</option>\r\n");
      out.write("              <option value=\"PA\">PA</option>\r\n");
      out.write("              <option value=\"AP\">AP</option>\r\n");
      out.write("              <option value=\"TO\">TO</option>\r\n");
      out.write("              <option value=\"MA\">MA</option>\r\n");
      out.write("              <option value=\"PI\">PI</option>\r\n");
      out.write("              <option value=\"CE\">CE</option>\r\n");
      out.write("              <option value=\"RN\">RN</option>\r\n");
      out.write("              <option value=\"PB\">PB</option>\r\n");
      out.write("              <option value=\"PE\">PE</option>\r\n");
      out.write("              <option value=\"AL\">AL</option>\r\n");
      out.write("              <option value=\"SE\">SE</option>\r\n");
      out.write("              <option value=\"BA\">BA</option>\r\n");
      out.write("              <option value=\"MG\">MG</option>\r\n");
      out.write("              <option value=\"ES\">ES</option>\r\n");
      out.write("              <option value=\"RJ\">RJ</option>\r\n");
      out.write("              <option value=\"SP\">SP</option>\r\n");
      out.write("              <option value=\"PR\">PR</option>\r\n");
      out.write("              <option value=\"SC\">SC</option>\r\n");
      out.write("              <option value=\"RS\">RS</option>\r\n");
      out.write("              <option value=\"MS\">MS</option>\r\n");
      out.write("              <option value=\"MT\">MT</option>\r\n");
      out.write("              <option value=\"GO\">GO</option>\r\n");
      out.write("              <option value=\"DF\">DF</option>\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("         \r\n");
      out.write("        </div>\r\n");
      out.write("           \r\n");
      out.write("        <div class=\"form-row\">\r\n");
      out.write("            <div class=\"form-group col-md-6\">\r\n");
      out.write("              <label for=\"inputTelefone\"> Telefone: </label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputTelefone\" name=\"Complemento\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group col-md-6\">\r\n");
      out.write("              <label for=\"inputCelular\"> Celular: </label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputBairro\" name=\"Bairro\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>         \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"form-row\">\r\n");
      out.write("            <div class=\"form-group col-md-6\">\r\n");
      out.write("              <label for=\"inputNumero_CTPS\"> Número CTPS: </label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputTelefone\" name=\"Numero_CTPS\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group col-md-6\">\r\n");
      out.write("              <label for=\"inputNumero_PIS\"> Número PIS: </label>\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"inputBairro\" name=\"Numero_PIS\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div> <br> \r\n");
      out.write("           \r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\"> Gravar </button>\r\n");
      out.write("        \r\n");
      out.write("       </form>\r\n");
      out.write("       </div>    \r\n");
      out.write("       \r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
