<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: stepanvasilyeu
  Date: 26.06.22
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Emp</title>
</head>

<body>
    <h2>Dear Employee, Please enter your details</h2>
    <br>
    <%--<form action="showDetails" method="get">--%>
    <%--    <input type="text" name="employeeName" placeholder="Write your name">--%>
    <%--    <input type="submit">--%>
    <%--</form>--%>

    <form:form action="showDetails" modelAttribute="employee">
        Name <form:input path="name"/>
        <form:errors path="name"/>
        <br><br>

        Surname <form:input path="surName"/>
        <form:errors path="surName"/>
        <br><br>

        Salary <form:input path="salary"/>
        <form:errors path="salary"/>
        <br><br>

        Department
        <form:select path="department" >
            <form:options items="${employee.departments}"/>
        </form:select>
        <br><br>

        Which car do you want?
        <br>
        <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
        <br><br>

        Foreign Language (s)?
        <br>
        <form:checkboxes path="languages" items="${employee.languageList}"/>
        <br><br>

        Phone Number:
        <br>
        <form:input path="phoneNumber"/>
        <form:errors path="phoneNumber"/>
        <br><br>

        Email:
        <br>
        <form:input path="email"/>
        <form:errors path="email"/>
        <br><br>

        <input type="submit" value="OK">
    </form:form>
</body>

</html>
