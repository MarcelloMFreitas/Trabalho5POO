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
        <table>
            <tr>
                <th>NOME</th>
                <th>ULTIMA NOTA</th>
                <th>MEDIA</th>
            </tr>
            <% for (Users u : user) {%>
            <tr>
                <td><%= u.getName()%></td>
                <td><%= 100.0 * u.getUserLastGrade()%>%</td>
                <td><%= 100.0 * u.getUserGradeAverage()%>%</td>
            </tr>
            <%}%>
        </table>

        <a href="teste.jsp">
            <button>Iniciar Teste</button>
        </a>
    </body>
</html>