package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.projeto05.quiz.Quiz;
import com.projeto05.quiz.Users;
import java.util.ArrayList;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
  }

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Índice: WebQuiz</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <main class=\"container\">\r\n");
      out.write("            <h1><a href=\"home.jsp\">Praticando Regra de Três Simples</a></h1>\r\n");
      out.write('\r');
      out.write('\n');
ArrayList<Users> user = Quiz.getUser(); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h2>Regra de três simples é um processo prático para resolver problemas que envolvam quatro valores dos quais conhecemos três deles. </h2>\r\n");
      out.write("\r\n");
      out.write("<p>Devemos, portanto, determinar um valor a partir dos três já conhecidos.</p>\r\n");
      out.write("\r\n");
      out.write("<p>Passos utilizados numa regra de três simples:</p>\r\n");
      out.write("<ul>\r\n");
      out.write("    <li> 1º) Construir uma tabela, agrupando as grandezas da mesma espécie em colunase mantendo na mesma linha as grandezas de espécies diferentes em correspondência.</li>\r\n");
      out.write("    <li> 2º) Identificar se as grandezas são diretamente ou inversamente proporcionais.</li>\r\n");
      out.write("    <li>3º) Montar a proporção e resolver a equação.</li>\r\n");
      out.write("</ul>\r\n");
      out.write("<p>Vamos Praticar!!</p>\r\n");
      out.write("<hr/>\r\n");
      out.write("<table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>NOME</th>\r\n");
      out.write("                <th>ULTIMA NOTA</th>\r\n");
      out.write("                <th>MEDIA</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
 for (Users u : user) {
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("            <form action=\"teste.jsp\">\r\n");
      out.write("                <td><input type=\"text\" name=\"nomeHome\" value=\"");
      out.print(u.getName());
      out.write("\" readonly/></td>\r\n");
      out.write("                <td>");
      out.print( 100.0 * u.getUserLastGrade());
      out.write("%</td>\r\n");
      out.write("                <td>");
      out.print( 100.0 * u.getUserGradeAverage());
      out.write("%</td>\r\n");
      out.write("                <td><input type=\"submit\" value=\"Iniciar Teste\"/></td>\r\n");
      out.write("            </form>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("    </table>\r\n");
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
