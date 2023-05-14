<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
    <head>
        <title>LIST OF ALL TRICKSss</title>
        <jsp:include page="header.jsp"/>
        <style>
          body {
            background-color: green;
         <!--   background-image: url("http://localhost:8080/bandymas/Church1.jpg");-->
          <!--   background-image: url(" https://drive.google.com/file/d/1kd9gMaW3FtKy1KtLDr5PyT8OiBBxrHwA/view?usp=sharing");-->
          }
            th {
              font-size: 1.2em; /* padidinti šriftą */
              font-weight: bold; /* padaryti bold */
              color: blue; /* pakeisti spalvą */
              text-align: center;
            }
                    tr {
                      text-align: center;
                    }
            .error{color:red}
        </style>
    </head>
    <body class="container">
    <div class="table-responsive">

        <h2>LIST OF ALL TRICKS</h2>
        <!--h3>Skaičiuotuvas jautrus neigiamiems skaičiams</h3-->

  <table class="table table-striped table-light">
            <tr>
                <th>trick_name</th>
                <th>trick_type</th>
                <th>trick_level</th>
                <th>trick_score</th>
                <th>official_score</th>
				<th>trick_name2</th>
				<th>link</th>
            </tr>
			
			            <c:forEach var="element" items="${tricks2}">

                <tr>
                    <td>${element.trick_name}</td>
                    <td>${element.trick_type}</td>
                    <td>${element.trick_level}</td>
                    <td>${element.trick_score}</td>
					<td>${element.official_score}</td>
					<td>${element.trick_name2}</td>
					<!--td>${element.link}</td-->
					<td><a href="${element.link}">Open link</a></td>

                    <td>
                        <!-- atvaizduoti atnaujinimo adresą -->
						<!--a href="${atnaujinti}">Atnaujinti</a>
                        | <a href="${trinti}"
                             onclick="if (!(confirm('Ar tikrai norite ištrinti šį įrašą?'))) return false">Trinti</a>
                        | <!-- atvaizduoti rodymo adresą --> 
						<!--a href="${rodyti}">Rodyti</a-->
                    </td>
                </tr>
            </c:forEach>
			
        </div>
    </body>
</html>
