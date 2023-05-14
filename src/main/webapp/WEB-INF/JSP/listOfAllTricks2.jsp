<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>




<html>
    <head>
        <title>LIST OF ALL TRICKSss</title>
                <style>
          body {
            background-image: url(" https://drive.google.com/file/d/1kd9gMaW3FtKy1KtLDr5PyT8OiBBxrHwA/view?usp=sharing");
            <!-- background-color: green;-->
            <!--   background-image: url("http://localhost:8080/bandymas/Church1.jpg");-->

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
    <body  background: url("http://localhost:8080/bandymas/Church1.jpg")>

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
			

			
        </div>
    </body>
</html>
