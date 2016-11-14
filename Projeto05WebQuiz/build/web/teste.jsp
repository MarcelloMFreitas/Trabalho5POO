<%@page import="com.projeto05.quiz.Quiz"%>
<%@page import="com.projeto05.quiz.Question"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if(request.getParameter("teste")!=null){
        Quiz.validateTest(new String[]{
            request.getParameter("0"),
            request.getParameter("1"),
            request.getParameter("2"),
            request.getParameter("3")
        });
        response.sendRedirect("index.jsp");
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
            <%ArrayList<Question> test = Quiz.getTest();%>
            <%for(Question q: test){%>
            <h4><%= q.getQuestion() %></h4>
                <%for(String alternative: q.getAlternatives()){%>
                <input type="radio" name="<%=test.indexOf(q)%>"
                       value="<%=alternative%>"/><%=alternative%>
                <%}%>
            <hr/>
            <%}%>
            <input type="submit" name="teste" value="Concluir"/>
        </form>
    </body>
</html>
