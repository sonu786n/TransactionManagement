<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style><%@include file="/WEB-INF/css/style.css"%>
body {
  color: green;
  background-color: #ff66d9;
} 
</style>
</head>
<body>

	<h3 align="center">Please login to your account</h3>
	${error }
	<form class="codehim-form" method="post" action="${pageContext.request.contextPath }/login">
   <div class="form-title">
      <div class="user-icon gr-bg">
         <i class="fa fa-user"></i>
      </div>     
   </div>
   <label for="email"><i class="fa fa-envelope"></i> Username:</label>
   <input type="text" name="username" class="cm-input" placeholder="Enter your Username">
   <label for="pass"><i class="fa fa-lock"></i> Password:</label>
   <input name="password" id="pass" type="password" class="cm-input" placeholder="Enter your password">
   <button type="submit" class="btn-login  gr-bg">Login</button>
   
   <p>Not a member?
              <a target="_self" href="/registration" class="font-weight-bold">Register</a>
            </p>
</form>

</body>
</html>