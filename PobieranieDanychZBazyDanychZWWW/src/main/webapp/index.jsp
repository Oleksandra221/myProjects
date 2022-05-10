<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c' %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dynamic Drop Down List Demo</title>
</head>
<body>
<div align = "center">
<h2>Dynamic Drop Down List Demo</h2>
<form action="list" method="post">
    Select a Value:&nbsp;
    <select name="values">
        <c:forEach items="${rowsFromValuesTable}" var="values">
            <option value="${values.id}">
           
            ${values.column_names}</option>
        </c:forEach>
    </select>
    <br/><br/>
    <input type="submit" value="Submit" />

    
</form>
</div>
</body>
</html>