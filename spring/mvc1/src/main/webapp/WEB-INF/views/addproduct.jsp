<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add new Product</title>
<style>
.error {
color: #EF1313;
font-style: italic;
}
</style>
</head>
<body>
<form:form action="addproduct" method="post" modelAttribute="product">
	<form:hidden path="id"/>
	Enter product Name: <form:input path="name"/><form:errors path="name" class="error"/><br/>
	Enter product price:<form:input path="price"/><form:errors path="price" class="error"/><br/>
	<input type="submit">
</form:form>
</body>
</html>