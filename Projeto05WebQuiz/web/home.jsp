<%@page import="com.projeto05.quiz.Quiz"%>
<%@page import="com.projeto05.quiz.Users"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/jspf/header.jspf" %>
<%ArrayList<Users> user = Quiz.getUser(); %>
<h2>Regra de três simples é um processo prático para resolver problemas que envolvam quatro valores dos quais conhecemos três deles. </h2>
<p>Devemos, portanto, determinar um valor a partir dos três já conhecidos.</p>
<p>Passos utilizados numa regra de três simples:</p>
<ul>
    <li> 1º) Construir uma tabela, agrupando as grandezas da mesma espécie em colunase mantendo na mesma linha as grandezas de espécies diferentes em correspondência.</li>
    <li> 2º) Identificar se as grandezas são diretamente ou inversamente proporcionais.</li>
    <li>3º) Montar a proporção e resolver a equação.</li>
</ul>
<p>Vamos Praticar!!</p>

<table class="table">
    <tr>
        <th>NOME</th>
        <th>ULTIMA NOTA</th>
        <th>MEDIA</th>
        <th></th>
    </tr>
    <% for (Users u : user) {%>
    <tr>
    <form action="teste.jsp" method="Post">
        <td><input type="text" name="nomeHome" class="form-control" value="<%=u.getName()%>" readonly/></td>
        <td><%= 100.0 * u.getUserLastGrade()%>%</td>
        <td><%= 100.0 * u.getUserGradeAverage()%>%</td>
        <td><input class="btn btn-success" type="submit" value="Iniciar Teste"/></td>
    </form>
</tr>
<%}%>
</table>
