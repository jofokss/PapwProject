<%@ page language="java" contentType="text/html; charset=ISO-8859-15"
    pageEncoding="ISO-8859-15"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-15">

</head>
<body>
	<H3>Conversor entre Yens e Euros</H3>
	<form:form method="POST" modelAttribute="yenAndEuro">
		<p>Digite a quantidade de Euros que deseja converter: € <form:input path="euro"/></p>
		<p>Digite a quantidade de Yens que deseja converter: ¥ <form:input path="yen"/></p>
		<p><form:button>Converter</form:button> </p>
		<p>${mensagem}</p>
	</form:form>
	


</body>
</html>