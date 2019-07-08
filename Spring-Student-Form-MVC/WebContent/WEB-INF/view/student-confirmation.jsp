<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       The student id confirmed : ${student.firstName}  ${student.lastName}
       <br><br>
       Country : ${student.country}
       <br><br>
       Language : ${student.language}
       <br><br>
       Operating System :
       <ul>
           <c:forEach var="temp" items="#{student.operatingSystem}">
           <li>${temp}</li>
           
           </c:forEach>
       </ul>
</body>
</html>