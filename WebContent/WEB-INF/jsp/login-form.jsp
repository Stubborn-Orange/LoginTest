<%@ page pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<title>Login Form</title>
		<link rel="stylesheet" type="text/css" href="../style/style.css">
	</head>
		<body>
			<h6>${message}</h6>
			<form method="post" action="index.jsp">
				<input type="submit" value="Log">
			</form>
			<form method="post" action="${pageContext.request.contextPath }/login/login-action1.form">
				<div>
					<h2>Login login-action1.form</h2>
					<p><label>User:</label><input type="text" name="name"></p>
					<p><label>Password:</label><input type="password" name="pwd"></p>
					<h3><input type="submit" value="Log"></h3>
				</div>
			</form>
			
			 <form  action="${pageContext.request.contextPath }/login/login-action2.form">
				<div>
					<h2>Login login-action2.form</h2>
					<p><label>User:</label><input type="text" name="name"></p>
					<p><label>Password:</label><input type="password" name="pwd"></p>
					<h3><input type="submit" value="Log"></h3>
				</div>
			</form>
			
			<form action="post" action="${base}login/login-action3.form">
				<div>
					<h2>Login login-action3.form</h2>
					<p><label>User:</label><input type="text" name="name"></p>
					<p><label>Password:</label><input type="password" name="pwd"></p>
					<h3><input type="submit" value="Log"></h3>
				</div>
			</form>
			
			<form action="post" action="${base}login/login-action4.form">
				<div>
					<h2>Login login-action4.form</h2>
					<p><label>User:</label><input type="text" name="name"></p>
					<p><label>Password:</label><input type="password" name="pwd"></p>
					<h3><input type="submit" value="Log"></h3>
				</div>
			</form>
			
			<form action="post" action="${base}login/login-action5.form">
				<div>
					<h2>Login login-action5.form</h2>
					<p><label>User:</label><input type="text" name="name"></p>
					<p><label>Password:</label><input type="password" name="pwd"></p>
					<h3><input type="submit" value="Log"></h3>
				</div>
			</form>
			
			<form action="post" action="${base}login/login-action6.form">
				<div>
					<h2>Login login-action6.form</h2>
					<p><label>User:</label><input type="text" name="name"></p>
					<p><label>Password:</label><input type="password" name="pwd"></p>
					<h3><input type="submit" value="Log"></h3>
				</div>
			</form>
		</body>
</html>