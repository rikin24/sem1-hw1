<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Students</title>
</head>

<body>

	<c:forEach items="${students}" var="student">
	    <h3>Student ${student.name}</h3>
        <p>Facebook: ${student.facebook}</p>
        <p>Program: ${student.program}</p>
        <p>Module Hours: ${student.hours}</p>
	</c:forEach>

    <c:url value = "/newStudent" var = "newStudent">
        <c:param name = "module" value = "${moduleID}"/>
    </c:url>

    <a href="${newStudent}">Add Student</a>

</body>

</html>