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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
ArrayList<Users> user = Quiz.getUser(); 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Índice: WebQuiz</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1> Praticando Regra de Três Simples</h1>\n");
      out.write("        <h2>Regra de três simples é um processo prático para resolver problemas que envolvam quatro valores dos quais conhecemos três deles. </h2>\n");
      out.write("        \n");
      out.write("        <h2>Devemos, portanto, determinar um valor a partir dos três já conhecidos.</h2>\n");
      out.write("         \n");
      out.write("        <h2>Passos utilizados numa regra de três simples:</h2>\n");
      out.write("        <h2> 1º) Construir uma tabela, agrupando as grandezas da mesma espécie em colunas</h2>\n");
      out.write("        <h2>e mantendo na mesma linha as grandezas de espécies diferentes em correspondência.</h2>\n");
      out.write("        <h2> 2º) Identificar se as grandezas são diretamente ou inversamente proporcionais.</h2>\n");
      out.write("        <h2>3º) Montar a proporção e resolver a equação.</h2>\n");
      out.write("        <h2>Vamos Praticar!!</h2>\n");
      out.write("        <hr/>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>NOME</th>\n");
      out.write("                <th>ULTIMA NOTA</th>\n");
      out.write("                <th>MEDIA</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
 for (Users u : user) {
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( u.getName());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( 100.0 * u.getUserLastGrade());
      out.write("%</td>\n");
      out.write("                <td>");
      out.print( 100.0 * u.getUserGradeAverage());
      out.write("%</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <hr/>\n");
      out.write("        <a href=\"teste.jsp\">\n");
      out.write("            <button>Iniciar Teste</button>\n");
      out.write("        </a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
