<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <form:form action="processForm" modelAttribute="student">
       First Name: <form:input path="firstName"/>
       <br><br>
       Last Name: <form:input path="lastName"/>
       <br><br>
       Country : <form:select path="country">
       <form:options items="${student.countryoption}"/>
         <!-- <form:option value="India" label="India"/>
         <form:option value="China" label="China"/>
         <form:option value="USA" label="USA"/>
         <form:option value="UK" label="UK"/> -->
       </form:select>
        <br><br>
        Favourite Language :
        <form:radiobutton path="language" value="Java" label="Java"/>
        <form:radiobutton path="language" value="PHP" label="PHP"/>
        <form:radiobutton path="language" value="C#" label="C#"/>
        <form:radiobutton path="language" value="Python" label="Python"/>
        
        <br><br>
        Operating System :
        <form:checkbox path="operatingSystem" value="Mac OS" label="Mac OS"/>
        <form:checkbox path="operatingSystem" value="Windows" label="Windows"/>
        <form:checkbox path="operatingSystem" value="Lynex" label="Lynex"/>
        <br><br>
        
       <input type="submit" value="Submit">
       
     </form:form>

</body>
</html>