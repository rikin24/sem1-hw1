<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Add Student</title>
</head>

<body>
<form:form action="/addStudent?module=${module}" modelAttribute="student">

	<form:label path="name">Student Name: </form:label>
	<form:input path="name"/>
	<form:errors path="name"/><br/>

	<form:label path="facebook">Facebook: </form:label>
	<form:input path="facebook"/>
	<form:errors path="facebook"/><br/>
	
	<form:label path="program">Program: </form:label>
	<form:input path="program"/>
	<form:errors path="program"/><br/>

	<form:label path="hours">Program Hours: </form:label>
	<form:input path="hours"/>
	<form:errors path="hours"/><br/>
	
	<input type="submit"/><form:errors/>
</form:form>
</body>

</html>