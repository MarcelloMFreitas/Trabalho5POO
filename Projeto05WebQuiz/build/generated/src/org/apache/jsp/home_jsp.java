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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
ArrayList<Users> user = Quiz.getUser(); 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Índice: WebQuiz</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>WebQuiz</h1>\r\n");
      out.write("        <h2>Resultados</h2>\r\n");
      out.write("        <hr/>\r\n");
      out.write("        <h3>Nome:</h3>\r\n");
      out.write("        ");
      out.print( user.get(0).getName() );
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <h3>Média</h3>\r\n");
      out.write("        <h3>Última nota:</h3>\r\n");
      out.write("        ");
      out.print( 100.0*user.get(0).getUserLastGrade() );
      out.write("%\r\n");
      out.write("        <h3>Média</h3>\r\n");
      out.write("        ");
      out.print( 100.0*user.get(0).getUserGradeAverage() );
      out.write("%\r\n");
      out.write("        <hr/>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <hr/>\r\n");
      out.write("        <a href=\"teste.jsp\">\r\n");
      out.write("            <button>Iniciar Teste</button>\r\n");
      out.write("        </a>\r\n");
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
