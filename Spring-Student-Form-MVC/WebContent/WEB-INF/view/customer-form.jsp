<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style>
.error {color:red}
</style>
</head>
<body>
     <i>Fill out the form.(*) requird</i>
     <br><br>
     <form:form action="ProcessCustomerData" modelAttribute="cutomer">
     
     First Name(*) : <form:input path="firstName"/>
     <form:errors path="firstName" cssClass="error"/>
     <br><br>
     Last Name : <form:input path="lastName"/>
     <br><br>
     Free Pass :<form:input path="freePass"/>
     <form:errors path="freePass" cssClass="error"/>
     <br><br>
     <br><br>
     Postal code :<form:input path="postalcode"/>
     <form:errors path="postalcode" cssClass="error"/>
     <br><br>
     <input type="submit" value="Submit">
     <br><br>
     </form:form>
</body>
</html>