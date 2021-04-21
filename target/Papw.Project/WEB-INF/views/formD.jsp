<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
	<H3>Conversor de Doláres para Reais</H3>
	<form:form method="POST" modelAttribute="dolarParaReal">
		<p>Digite a quantidade de doláres que deseja converter: U$ <form:input path="dolar"/></p>
		<p><form:button>Converter</form:button></p>
		<p>${mensagem}</p>
	</form:form>

</body>
</html>