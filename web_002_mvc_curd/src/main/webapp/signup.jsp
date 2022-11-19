<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signUp hear</title>
<!-- Font awesome cdn -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
	integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<style type="text/css">
* {
	padding: 0; 
	margin: 0;
	box-sizing: border-box;
	font-family: sans-serif;
}

h1 {
	font-size: 3rem;
	padding: 2rem 0;
}

table {
	display: flex;
	justify-content: center;
}

.singUp {
	width: 50vw;
	margin: 150px auto;
	text-align: center;
	border-radius: 10px;
	box-shadow: rgba(0, 0, 0, 0.19) 0px -4px 20px, rgba(0, 0, 0, 0.23) 0px
		6px 6px;
}

.form {
	display: flex;
	justify-content: center;
	align-items: center;
	font-size: 1.5rem;
	gap: 1rem;
	padding: 10px;
	background-color: #ececec;
	border-radius: 5px;
	margin-bottom: 1.4rem;
}

.form input {
	width: 500px;
	border: none;
	outline: none;
	font-size: 1rem;
	background-color: transparent;
}

button {
	padding: 10px 15px;
	border: none;
	outline: none;
	cursor: pointer;
	border-radius: 5px;
	background-color: transparent;
}

.button {
	cursor: pointer;
	transition: 0.2s ease;
}

.button input {
	border: none;
	outline: none;
	cursor: pointer;
	font-weight: bold;
	font-size: 1.4rem !important;
}

.button:hover {
	background-color: green;
	scale: 0.8;
}
</style>
</head>
<body>

	<div class="singUp">
		<form action="signup">

			<table>
				<h1>Sign Up</h1>
				<span style="color: red">${emailError}</span>
				<tr>
					<td>
						<div class="form">
							<i class="fa-solid fa-user"></i> <input type="text" name="name"
								placeholder="First name & last name" required>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="form">
							<i class="fa-solid fa-envelope"></i> <input type="email"
								name="email" placeholder="Enter email address" required>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="form">
							<i class="fa-solid fa-lock"></i> <input type="text"
								name="password" id="pass" placeholder="Enter password" required>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="form passform" onkeyup="passErrorKeyUp()">
							<i class="fa-solid fa-lock"></i> <input type="text"
								name="conPass" id="conPass" placeholder="Confirm password"
								required>
						</div> <span id="span" style="color: red"></span>
					</td>
				</tr>
				<tr>
					<td>
						<div class="form">
							<i class="fa-solid fa-phone"></i> <input type="text"
								name="number" placeholder="Enter Mobile Number" required>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="form button">
							<button>
								<input type="submit" value="Create Account">
							</button>
						</div>
					</td>
					<td>
				</tr>
			</table>
		</form>
	</div>
</body>

<script type="text/javascript">

let pass = document.getElementById("pass");
let conPass =  document.getElementById("conPass");
let passform = document.querySelector(".passform");
let span = document.getElementById("span");
const passErrorKeyUp = ()=>{
	
	if(pass.value != conPass.value)
		{		
		passform.style.border="1px solid red";
		span.innerHTML="password and confirm password both are defferent...";
		}
		 
	else{
		passform.style.border="none";
		span.innerHTML="";
		}

}

</script>



</html>