<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Add Module</title>
</head>

<body>
<form:form action="/addModule" modelAttribute="module">
	<form:label path="id">Module ID: </form:label>
	<form:input path="id"/>
	<form:errors path="id"/><br/>

	<form:label path="title">Module Title: </form:label>
	<form:input path="title"/>
	<form:errors path="title"/><br/>
	
	<form:label path="convenor">Module Convenor: </form:label>
	<form:input path="convenor"/>
	<form:errors path="convenor"/><br/>

	<input type="submit"/><form:errors/>
</form:form>
</body>

</html>