<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <table>
		<thead>
			<tr>
				<th>id</th>
				<th>title</th>
				<th>price</th>
				<th>update</th>
				<th>delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${books}" var="book">
				<tr>
					<td>${book.id }</td>
					<td>${book.title }</td>
					<td>${book.price }</td>
					<td><a href="update?id=${book.id }">update</a></td>
					<td><a href="delete?id=${book.id }">delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>