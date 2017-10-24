<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Dodaj kota</title>
	</head>
	<body>
		<a href="lista">Powrót do listy kotów</a><br />
		<form:form modelAttribute="kotDto" method="POST">
			<table border="1">
				<tbody>
					<tr>
						<th>Imię</th>
						<td>
						<form:input path="imie" id="imie"/>
						<a:if test="${pageContext.request.method=='POST'}"><form:errors path="imie"/></a:if>
						</td>
					</tr>
					<tr>
						<th>Data urodzenia</th>
						<td>
						<form:input path="dataUrodzenia" id="dataUrodzenia"/>
						<a:if test="${pageContext.request.method=='POST'}"><form:errors path="dataUrodzenia"/></a:if>
						</td>
					</tr>
					<tr>
						<th>Waga</th>
						<td>
						<form:input path="waga" id="waga"/>
						<a:if test="${pageContext.request.method=='POST'}"><form:errors path="waga"/></a:if>
						</td>
					</tr>
					<tr>
						<th>Imię opiekuna</th>
						<td>
						<form:input path="imieOpiekuna" id="imieOpiekuna"/>
						<a:if test="${pageContext.request.method=='POST'}"><form:errors path="imieOpiekuna"/></a:if>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="right"><input type="submit" value="Dodaj!" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
		<br />
		<hr />
		Uwaga! W kontekście użycia HTML oraz sposobu budowania stron, te rozwiązania są bardziej antyprzykładem niż materiałem do nauki!<br />
		Jeśli chciałabyś także tworzyć same widoki i pisac poprawny, dobrze skonstruowany kod HTML, zachęcamy do zapoznania się np. z frameworkiem <a href="http://getbootstrap.com" target="_blank">Bootstrap</a>.
	</body>
</html>