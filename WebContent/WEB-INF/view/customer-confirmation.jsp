<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Customer Confirmation</title>
</head>

<body>

The Customer Confirmed as : ${customer.firstName } ${customer.lastName }
<br></br>
The Customer Pass : ${customer.freePass }

<br></br>
Postal Code: ${customer.postalCode }

<br></br>
Course Code: ${customer.courseCode }

</body>

</html>