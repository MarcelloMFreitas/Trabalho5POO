<%@page import="com.projeto05.quiz.Quiz"%>
<%@page import="com.projeto05.quiz.Question"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getParameter("test") != null) {
        Quiz.validaTeste(new String[]{
            request.getParameter("0"),
            request.getParameter("1"),
            request.getParameter("2"),
            request.getParameter("3"),
            request.getParameter("4"),
            request.getParameter("5"),
            request.getParameter("6"),
            request.getParameter("7"),
            request.getParameter("8"),
            request.getParameter("9")

        });
        response.sendRedirect("home.jsp");
    }
%>
<%@include file="WEB-INF/jspf/header.jspf" %>
<form>
    <%ArrayList<Question> teste = Quiz.getTeste();%>
    <%for (Question q : teste) {%>
    <h4><%= q.getQuestao()%></h4>
    <%for (String alternative : q.getAlternativas()) {%>
    <input type="radio" name="<%=teste.indexOf(q)%>"
           value="<%=alternative%>"/><%=alternative%>
    <%}%>
    <hr/>
    <%}%>
    <input  class="btn btn-success" type="submit" name="test" value="Concluir"/>
</form>
<%@include file="WEB-INF/jspf/footer.jspf" %>