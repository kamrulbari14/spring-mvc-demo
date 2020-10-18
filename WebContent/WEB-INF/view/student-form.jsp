<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>

<title>Student Registration form</title>

</head>

<body>
	<form:form action="processForm" modelAttribute="student">
		First Name:<form:input path="firstName"/>
		<br></br>
		Last Name:<form:input path="lastName"/>
		<br></br>
		Country:
		<form:select path="Country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		
		<br></br>
		Favorite Language:
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		C <form:radiobutton path="favoriteLanguage" value="C"/>
		C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
		Python <form:radiobutton path="favoriteLanguage" value="Python"/>
		
		<br></br>
		Operating System:
		Linux<form:checkbox path="operatingSystem" value="Linux"/>
		Mac os<form:checkbox path="operatingSystem" value="Mac"/>
		MS windows<form:checkbox path="operatingSystem" value="Windows"/>
		<br></br>
		<input type="submit" value="Submit"/>
	</form:form>

</body>

</html>