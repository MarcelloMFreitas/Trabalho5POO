<%@page import="com.projeto05.quiz.Users"%>
<%@page import="com.projeto05.quiz.Quiz"%>
<%@page import="com.projeto05.quiz.Question"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if(request.getParameter("test")!=null){
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
        },request.getParameter("nome"));
        response.sendRedirect("home.jsp");
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teste: WebQuiz</title>
    </head>
    <body>
        <h1>WebQuiz</h1>
        <h2>Teste</h2>
        <hr/>
        <form>
            <%ArrayList<Question> teste = Quiz.getTeste();%>
            <%ArrayList<Users> user = Quiz.getUser();%>
            <select name="nome" size="2" required>
                <%for (Users u : user) {%>
                <option value="<%= u.getName()%>"><%= u.getName()%></option>
                <%}%>
            </select>
            <%for(Question q: teste){%>
            <h4><%= q.getQuestao()%></h4>
                <%for(String alternative: q.getAlternativas()){%>
                <input type="radio" name="<%=teste.indexOf(q)%>"
                       value="<%=alternative%>"/><%=alternative%>
                <%}%>
            <hr/>
            <%}%>
            <input type="submit" name="test" value="Concluir"/>
        </form>
    </body>
</html>
