<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Modules</title>
</head>

<body>
	<c:forEach items="${modules}" var="module">
	    <h3>Module ${module.id}</h3>
        <p>Module Title: ${module.title}</p>
        <p>Module Convenor: ${module.convenor}</p>
        <a href="/students?module=${module.id}">Module Students</a>
	</c:forEach>

</body>

</html>