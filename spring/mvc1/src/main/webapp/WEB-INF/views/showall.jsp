<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Management application</title>
</head>
<body>
<table border=1>
		<thead>
			<tr>
				<th>Product id</th>
				<th>Product name</th>
				<th>Product Price</th>
				<th>update</th>
				<th>delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${productList}" var="product">
				<tr>
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td><a href="update?id=${product.id}">update</a></td>
					<td><a href="delete?id=${product.id}">delete</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	<a href="addproduct">add new Products</a>
</body>
</html>
