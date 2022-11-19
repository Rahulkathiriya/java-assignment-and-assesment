<!DOCTYPE html>
<%@page import="java.lang.reflect.Array"%>
<%@page import="java.util.ArrayList"%>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<!-- <-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
	crossorigin="anonymous"></script>

<style>
.container-fluid {
	display: flex !important;
	justify-content: flex-start !important;
	margin: 3rem 0 !important;
}

.row {
	width: 100%;
}
</style>
</head>

<body>

	<div class="container-fluid">

		<div class="row ">
			<div class="col col-md-5">
				<form action="student"
					class="border border-dark bg-dark text-light p-4 rounded">
					<div class="row">
						<p class="h1 text-center bg-dark text-light p-2 pb-3 mt-2 rounded">Registreation
							Form</p>

						<div class="col">
							<input type="hidden" name="uid"> <label for="fname"
								class="form-label">Firstname :</label> <input type="text"
								class="form-control" name="fname" id="fname"
								placeholder="Enter First Name">

						</div>
						<div class="col">
							<label for="lname" class="form-label">LastName : </label> <input
								type="text" class="form-control" id="lname" name="lname"
								placeholder="Enter Last Name ">
						</div>
					</div>
					<br />
					<div class="row">
						<div class="col">
							<label for="number" class="form-label">number : </label> <input
								type="text" class="form-control" id="number" name="number"
								placeholder="Enter mobile Number">
						</div>
						<div class="col">
							<label for="email" class="form-label">Email</label>
							<div class="input-group">
								<input type="text" name="email" id="email"
									 placeholder="Enter Email Hear"
									class="form-control"> <span
									class="input-group-text">@gmail.com</span>
							</div>

						</div>
					</div>


					<br /> <label for="gender" class="from-label">Gender</label>
					<div class="form-checked">
						<input type="radio" class="form-check-input" name="gender"
							id="gender" value="male" checked="checked" /> &nbsp; Male <br />
						<input type="radio" class="form-check-input" name="gender"
							id="gender" value="female" />&nbsp; &nbsp;Female
					</div>


					<br>
					<div class="row">
						<div class="col">
							<input type="text" name="password" placeholder="Enter Password"
								class="p-2 rounded">

						</div>

					</div>



					<div class="text-center mt-5">
						<input type="submit" value="Submit" name="" id=""
							class="btn btn-success"> <input type="reset"
							value="Reset" class="btn btn-warning">
					</div>

				</form>
			</div>


		</div>

	</div>




	</div>



</body>

</html>