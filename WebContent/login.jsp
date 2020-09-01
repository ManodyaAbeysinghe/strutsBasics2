<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Struts Example</title>

<style type="text/css">
.errorMessage{
background-color: DeepPink;
color:white;
padding10px;
}
.tdErrorMessage{
height:50px;
}
 </style>


</head>
<body>

<!--  <h1>Login Page</h1>
<form action = "log" method="post">
<label>User Name</label>
<input type = "text" name="un"/><br/>
<label>Password</label>
<input type = "password" name="pw"/><br/>
<input type = "submit" value="login"/>

</form>
-->


<h1>login</h1>
<s:form action="log" method="post">
<s:textfield name="un" label="User Name" size="20"/>
<s:textfield name="pw" label="Password" size="20"/>
<s:submit name="submit" label="login" align="center"/>
</s:form>


</body>
</html>