<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>

<title>Student Confirmation page</title>

</head>

<body>
The Student is Confirmed as : ${student.firstName } ${student.lastName }
<br>
Country: ${student.country }
<br>
He likes: ${student.favoriteLanguage}
<br>
OS Choice:
<ul>
	<c:forEach var="temp" items="${student.operatingSystem}">
	<li>${temp}</li>
	</c:forEach>
</ul>

</body>

</html>