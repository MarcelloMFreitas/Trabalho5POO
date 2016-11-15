<%@page import="com.projeto05.quiz.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Índice: WebQuiz</title>
    </head>
    <body>
        <h1> Praticando Regra de Três Simples</h1>
        <h2>Regra de três simples é um processo prático para resolver problemas que envolvam quatro valores dos quais conhecemos três deles. </h2>
        
        <h2>Devemos, portanto, determinar um valor a partir dos três já conhecidos.</h2>
         
        <h2>Passos utilizados numa regra de três simples:</h2>
        <h2> 1º) Construir uma tabela, agrupando as grandezas da mesma espécie em colunas</h2>
        <h2>e mantendo na mesma linha as grandezas de espécies diferentes em correspondência.</h2>
        <h2> 2º) Identificar se as grandezas são diretamente ou inversamente proporcionais.</h2>
        <h2>3º) Montar a proporção e resolver a equação.</h2>
        <h2>Vamos Praticar!!</h2>
        <hr/>
        <h3>Última nota:</h3>
       <%= 100.0*Quiz.getLastGrade() %>%
        <h3>Média</h3>
        <%= 100.0*Quiz.getGradeAverage() %>%
        <hr/>
        <a href="teste.jsp">
            <button>Iniciar Teste</button>
        </a>
    </body>
</html>
