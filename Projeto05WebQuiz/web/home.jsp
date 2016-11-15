<%@page import="com.projeto05.quiz.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/jspf/header.jspf" %>

<h2>Regra de três simples é um processo prático para resolver problemas que envolvam quatro valores dos quais conhecemos três deles. </h2>

<p>Devemos, portanto, determinar um valor a partir dos três já conhecidos.</p>

<p>Passos utilizados numa regra de três simples:</p>
<ul>
    <li> 1º) Construir uma tabela, agrupando as grandezas da mesma espécie em colunase mantendo na mesma linha as grandezas de espécies diferentes em correspondência.</li>
    <li> 2º) Identificar se as grandezas são diretamente ou inversamente proporcionais.</li>
    <li>3º) Montar a proporção e resolver a equação.</li>
</ul>
<p>Vamos Praticar!!</p>
<hr/>
<h3>Última nota:</h3>
<%= 100.0 * Quiz.getLastGrade()%>%
<h3>Média</h3>
<%= 100.0 * Quiz.getGradeAverage()%>%
<hr/>
<a class="btn btn-success" href="teste.jsp">Iniciar Teste</a>

