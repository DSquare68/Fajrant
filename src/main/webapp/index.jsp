<%@ page language="java"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link href="css/index.css" rel="stylesheet" type="text/css">
	<style>
     	<%@ include file="css/index.css"%>
	</style>
</head>
<body>
<h2 id="welcome_label" >Witamy w klubie fajrant!</h2>
<form method="post" action="login">
	<div class="div_input">
		<p>Login</p>
		<input type="text" name="login"/>
	</div>
	<div class="div_input">
		<p>Hasło</p>
		<input type="password" name ="password">
	</div>
	<button type="submit" >Gotowe</button>
</form>
</body>
</html>
