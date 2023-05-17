<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title>Update record</title>
		<jsp:include page="header.jsp"/>
	</head>
	<body>
		<form:form name="number" action="/updateNumber" method="post">
			<!-- id būtina pateikti formoje, kitaip į back-end nueis null. Todėl darome hidden, kad neredaguotų -->
			<input type="hidden"	name="id"  			value="${number4.id}"><p>
			TRICK NAME:<br>
			<input type="text"   	name="trick_name"  		value="${number4.trick_name}"><p>
			TRICK TYPE:<br>
			<input type="text" 		name="trick_type"  	value="${number4.trick_type}"><p>
			TRICK LEVEL:<br>
			<input type="text"   	name="trick_level" 			value="${number4.trick_level}"><p>
			TRICK SCORE:<br>
			<input type="number" 	name="trick_score"   	value="${number4.trick_score}"><p>
			OFFICIAL SCORE:<br>
			<input type="checkbox" 	name="official_score"   	value="${number4.official_score}"><p>
			TRICK NAME2:<br>
			<input type="text" 	name="trick_name2"   	value="${number4.trick_name2}"><p>
			VIDEO LINK:<br>
			<input type="text" 	name="link"   	value="${number4.link}"><p>


			<input type="submit" value="Update">
		</form:form>
	</body>
</html>


