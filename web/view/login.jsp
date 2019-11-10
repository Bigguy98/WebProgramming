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
	<!-- font-awesome -->
	<link rel="stylesheet" href="../fontawesome/css/all.css">
	
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

	<!-- css -->
	<link rel="stylesheet" href="../template/css/login.css">

	<!-- js -->
	<script type="text/javascript" src="../template/js/login.js"></script>

	<title>Login</title>
</head>
<body>
	<div class="background">
		<div class="login">
			<form action="index.html" id="login-form">
				<span class="logo top"><img src="images/LogoVM.png" alt=""></span>
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
					<a href="">Quen mat khau?</a>
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
					<span class="logo top"><img src="images/LogoVM.png" alt=""></span>
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
		function kiemtra(e) {
			e.preventDefault();
			var user= document.getElementById("username");
			var pass= document.getElementById("password");
			var myRe = new RegExp(/\W/);
			console.log(myRe.test(pass.value));
			if(user.value=="" || pass.value=="" || !myRe.test(pass.value)){
				if(user.value == ""){
					document.getElementById("erroruser").style.display="block";
					document.getElementById("erroruser").innerHTML= "!Ten khong rong";
				}else{
					document.getElementById("erroruser").style.display="none";
				}
				if(pass.value ==""){

					document.getElementById("errorpass").style.display="block";
					document.getElementById("errorpass").innerHTML="!Ten khong rong";
				}
				else{
					document.getElementById("errorpass").style.display="none";
				}
				if(!myRe.test(pass.value) && pass.value!=""){
					document.getElementById("errorpass").style.display="block";
					document.getElementById("errorpass").innerHTML= "!phai co ki tu dac biet";
				}else{
					document.getElementById("errorpass").style.display="none";
				}
			}
			else{
				document.getElementById("erroruser").style.display="none";
				document.getElementById("errorpass").style.display="none";
				alert("thanh cong");
			}

		}

			var form= document.getElementById("login-form");
			form.addEventListener("submit",kiemtra,false);
			// body...

		
	</script>
</body>
</html>
