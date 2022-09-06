<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: stepanvasilyeu
  Date: 26.06.22
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hi Emp!</title>
</head>
<body>
    <h2>Dear Employee, you are WELCOME!!!</h2>
    <br>

    Your name: ${employee.name}
    <br>
    Your surname: ${employee.surName}
    <br>
    Your salary: ${employee.salary}
    <br>
    Your departments: ${employee.department}
    <br>
    Your car brand: ${employee.carBrand}
    <br>
    Language (s):
    <ul>
        <c:forEach var="lang" items="${employee.languages}">
            <li>
                ${lang}
            </li>
        </c:forEach>
    </ul>
    <br>
    Your Phone Number: ${employee.phoneNumber}
    <br>
</body>
</html>
