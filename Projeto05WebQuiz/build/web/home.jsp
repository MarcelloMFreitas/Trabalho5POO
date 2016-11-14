<%@page import="com.projeto05.quiz.Quiz"%>
<%@page import="com.projeto05.quiz.Users"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%ArrayList<Users> user = Quiz.getUser(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Índice: WebQuiz</title>
    </head>
    <body>
        <h1>WebQuiz</h1>
        <h2>Resultados</h2>
        <hr/>
        <h3>Nome:</h3>
        <%= user.get(0).getName() %>
        <%-- criar lista com os nomes de quem respondeu --%>
        <h3>Média</h3>
        <h3>Última nota:</h3>
        <%= 100.0*user.get(0).getUserLastGrade() %>%
        <h3>Média</h3>
        <%= 100.0*user.get(0).getUserGradeAverage() %>%
        <hr/>
        <%-- criar media do aluno --%>
        <hr/>
        <a href="teste.jsp">
            <button>Iniciar Teste</button>
        </a>
    </body>
</html>