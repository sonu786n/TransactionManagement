<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style><%@include file="/WEB-INF/css/style.css"%>
 body {
  color: green;
  background-color: #ff66d9;
} 
</style>
</head>
<body>

<h3 align="center">Please Register for an account</h3>
	${error }
	<form class="codehim-form" method="post" action="${pageContext.request.contextPath }/register">
   <div class="form-title">
      <div class="user-icon gr-bg">
         <i class="fa fa-user"></i>
      </div>     
   </div>
   <label for="name"><i class="fa fa-envelope"></i> Name:</label>
   <input type="text" name="name" class="cm-input" placeholder="Enter your Name">   
   <label for="email"><i class="fa fa-envelope"></i> Email:</label>
   <input type="email" name="email" class="cm-input" placeholder="Enter your Email">
   <label for="mobile"><i class="fa fa-envelope"></i> Mobile:</label>
   <input type="text" name="mobile" class="cm-input" placeholder="Enter your Mobile">
   <label for="User_Name"><i class="fa fa-envelope"></i> Username:</label>
   <input type="text" name="User_Name" class="cm-input" placeholder="Enter your Username">
   <label for="pass"><i class="fa fa-lock"></i> Password:</label>
   <input name="password" id="pass" type="password" class="cm-input" placeholder="Enter your password">
   <label for="cpass"><i class="fa fa-lock"></i> Confirm Password:</label>
   <input name="confirmPassword" id="cpass" type="text" class="cm-input" placeholder="Confirm password">
   <button type="submit" class="btn-login  gr-bg">Register</button> 
   
</form>

</body>
</html>