package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.projeto05.quiz.Quiz;
import com.projeto05.quiz.Question;
import java.util.ArrayList;

public final class teste_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");

    if(request.getParameter("test")!=null){
        Quiz.validateTest(new String[]{
            request.getParameter("0"),
            request.getParameter("1"),
            request.getParameter("2"),
            request.getParameter("3")
        });
        response.sendRedirect("index.jsp");
    }

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Teste: WebQuiz</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>WebQuiz</h1>\r\n");
      out.write("        <h2>Teste</h2>\r\n");
      out.write("        <hr/>\r\n");
      out.write("        <form>\r\n");
      out.write("            ");
ArrayList<Question> test = Quiz.getTest();
      out.write("\r\n");
      out.write("            ");
for(Question q: test){
      out.write("\r\n");
      out.write("            <h4>");
      out.print( q.getQuestion() );
      out.write("</h4>\r\n");
      out.write("                ");
for(String alternative: q.getAlternatives()){
      out.write("\r\n");
      out.write("                <input type=\"radio\" name=\"");
      out.print(test.indexOf(q));
      out.write("\"\r\n");
      out.write("                       value=\"");
      out.print(alternative);
      out.write("\"/>");
      out.print(alternative);
      out.write("\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("            <hr/>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("            <input type=\"submit\" name=\"teste\" value=\"Concluir\"/>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
