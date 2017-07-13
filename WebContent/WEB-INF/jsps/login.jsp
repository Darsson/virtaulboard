<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/static/css/login.css" rel="stylesheet" >
<script type="text/javascript" src="${pageContext.request.contextPath}/static/script/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/script/main.js"></script>
<title>Virtual Board</title>

<script type="text/javascript">
$(document).ready(toggleLoginForm());
function toggleLoginForm(){
	$(".display-toggle").toggle();
}

</script>

</head>
<body>
	<div class="login-page">
	  <div class="form">
	    <form class="register-form display-toggle" action='${pageContext.request.contextPath}/darson' method=POST>
	      <input placeholder="username" type="text" name="username"/>
	      <input placeholder="password" type="password" name="password"/>
	      <input placeholder="email" type="text" name="email address"/>
	      <input placeholder="full name" type="text" name="fullname"/>
	      <button>create</button>
	      <p  class="message">Already registered? <a onclick="toggleLoginForm()" href="#">Sign In</a></p>
	    </form>
	    <form class="login-form display-toggle" action='${pageContext.request.contextPath}/j_spring_security_check' method=POST>
	      <input type="text" placeholder="username" name='j_username'/>
	      <input type="password" placeholder="password" name='j_password'/>
	      <input type='checkbox' name='_spring_security_remember_me' checked="checked" />
	      <button name="submit" type="submit" value="Login">Login</button>
	      <p  class="message">Not registered? <a onclick="toggleLoginForm()" href="#">Create an account</a></p>
	    </form>
	  </div>
	</div>
</body>
</html>