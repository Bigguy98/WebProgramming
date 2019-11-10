<%-- 
    Document   : login
    Created on : Oct 28, 2019, 9:01:02 AM
    Author     : hoaiphat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8"> 
	
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="template/fontawesome/css/all.css">
	
        <script src="template\js\jquery.min.js"></script>
        <script src="template/js/jquery.min.js"></script>

	<link rel="stylesheet" href="template/css/login.css">

	<script type="text/javascript" src="template/js/login.js"></script>

	<title>Login</title>
</head>
<body>
	<div class="background">
		<div class="login">
			<form action="index.html" id="login-form">
				<span class="logo top"><img src="template/images/LogoVM.png" alt=""></span>
				<span class="title top">Login</span>
				<div class="text-box">
					<i class="fas fa-user"></i>
					<input type="text" id="username" placeholder="Username">
					<span id="erroruser"></span>
				</div>
				<div class="text-box">
					<i class="fas fa-lock"></i>
					<input type="password" id="password" placeholder="Password">
					<span id="errorpass"></span>

				</div>
				<div class="forget">
					<a href="">Forgot password?</a>
				</div>
				<div class="remember">
					<input type="checkbox" id="check">
					<label for="check">Remember</label>

				</div>
				<div class="btn">
					<input type="button" name="btndki"  value="Dang ki">
					<input type="submit" name="btnsubmit" value="Dang nhap">
				</div>
			</form>
			
			<div class="register">
				<form action="" id="register-form">
					<span class="logo top"><img src="template/images/LogoVM.png" alt=""></span>
					<span class="title top">Register</span>
					<div class="text-box">
						<input type="text" id="name" placeholder="Name">
					</div>
					<div class="text-box">
						<input type="number" id="age" placeholder="Age">
					</div>
					<div class="text-box">
						<input type="text" id="address" placeholder="Address">
					</div>
					<div class="text-box">
						<input type="email" id="email" placeholder="Email">
					</div>
					<div class="text-box">
						<input type="text" id="username-re" placeholder="Username">
					</div>
					<div class="text-box">
						<input type="text" id="password-re" placeholder="Password">
					</div>
					<div class="btn">
						<input type="submit" value="Dang ki">
					</div>
				</form>
			</div>

		</div>
	</div>
	<script>
		
	</script>
</body>
</html>
