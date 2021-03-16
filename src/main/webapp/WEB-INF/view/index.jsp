<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>

<html>
<head>
    <style>
        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<h2>Rest Api Reqres</h2>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Email</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Avatar</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${allUsers}">
        <tr>
            <td>${user.id}</td>
            <td>${user.email}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td><img src="${user.avatar}"></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
