<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Employee</title>
</head>
<body>
<form:form method="post" action="addEmployee" modelAttribute="employee">
    <table>
        <tr>
            <td><form:label path="id">Employee</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="contactNumber">Contact Number</form:label></td>
            <td><form:input path="contactNumber"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <form:button>Save</form:button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
