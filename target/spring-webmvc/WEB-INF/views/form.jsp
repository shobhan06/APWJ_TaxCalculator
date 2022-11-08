<%--
  Created by IntelliJ IDEA.
  User: Shobhan
  Date: 07-Nov-22
  Time: 11:41 PM
  To change this template use File | Settings | File Templates.
--%>
<<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>To calculate TAX fill up this form</h1>
<%--@elvariable id="user" type="com.domain.User"--%>
<form:form action="create" modelAttribute="info">


    <label for="BSal">Basic Salary:</label>
    <form:input path="BSal" id="BSal"/>
    <form:errors path="BSal"/>
    <label for="h_rent">House rent:</label>
    <form:input path="hrent" id="h_rent"/>
    <form:errors path="hrent"/>
    <label for="CAllowance">Conveyance allowance :</label>
    <form:input path="CAllowance" id="CAllowance"/>
    <form:errors path="CAllowance"/>
    <label for="MAllowance">Medical allowance :</label>
    <form:input path="MAllowance" id="MAllowance"/>
    <form:errors path="MAllowance"/>
    <label for="MAllowance">Extra:</label>
    <form:input path="extra" id="others"/>
    <form:errors path="extra"/>



    <br><br>

    <input type="submit">

</form:form>
</body>
</html>
</html>
