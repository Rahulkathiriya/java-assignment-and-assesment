<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log in hear</title>
<!-- Font awesome cdn -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
	integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
	crossorigin="anonymous"></script>


<style type="text/css">
.form h1 {
	background-image: linear-gradient(to right, rgb(255, 192, 203, 90%),
		rgba(110, 169, 186, 0.773)) !important;
}

input {
	border-top: none !important;
	border-left: none !important;
	border-right: none !important;
	border-bottom: 1px solid rgba(0, 0, 0, 0.485) !important;
	box-shadow: none !important;
}

.form {
	width: 40%;
	margin: 13rem auto;
	padding: 1rem;
	border-radius: 5px;
	box-shadow: rgba(0, 0, 0, 0.19) 0px -4px 20px, rgba(0, 0, 0, 0.23) 0px
		6px 6px;
}

input[type=submit] {
	margin-top: 3rem;
	text-align: center;
	letter-spacing: 1.2px;
	font-weight: 600;
	font-size: 2rem;
	border: none !important;
	background-color: #ececec;
	margin-bottom: 0.6rem;
}

.signup-section {
	width: 95%;
	margin: auto;
	text-decoration: none;
	color: rgba(0, 0, 0, 0.836);
	display: flex;
	justify-content: space-between;
}

.signup-section a {
	text-decoration: none;
	color: rgba(0, 0, 0, 0.711);
}
</style>



</head>

<body>

	<div class="container">
		<div class="form-section">
			<form action="loginFile" class="form">

				<h1 class="text-center bg-warning p-2 rounded mb-5">LOGIN HEAR</h1>

				<span style="color: red;">${Erorr}</span>
				<span style="color: green">${success}</span>

				<div class="form-floating mb-3">
					<input type="email" class="form-control" id="floatingInput"
						placeholder="name@example.com" name="email"> <label
						for="floatingInput">Email address</label>
				</div>
				<div class="form-floating">
					<input type="text" class="form-control" id="floatingPassword"
						placeholder="Password" name="password"> <label
						for="floatingPassword">Password</label>
				</div>
				<div class=" button">
					<input type="submit" class="form-control" id="floatingPassword"
						value="Login">
				</div>

				<div class="signup-section">
					<a href="signupFile.jsp">Create Account?</a> <a href="forget">forgot
						password?</a>
				</div>
			</form>
		</div>
	</div>



</body>
</html>