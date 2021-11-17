<page import="com.loel.model2.User" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successful Login</title>
</head>
<body>

	User u = (User) request.getAttribute("us"); out.println("Welcome
	Buddy!!! " + "
	<h1 style='color: green'>" + u.getUserName() + "</h1>
	");

</body>
</html>