<!DOCTYPE html>
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
				<form action="addStudent"
					class="border border-dark bg-dark text-light p-4 rounded">
					<div class="row">
						<p class="h1 text-center bg-dark text-light p-2 pb-3 mt-2 rounded">Registreation
							Form</p>
						<span class="text-success">${add}</span> <span
							class="text-success">${updateMsg}</span> <span
							class="text-danger">${error}</span>
						<div class="col" onkeyup="validation()">
							<input type="hidden" name="uid" value="${allData.getId()}">
							<label for="fname" class="form-label">Firstname :</label> <input
								type="text" class="form-control" name="fname" id="fname"
								placeholder="Enter First Name" value="${allData.getFname()}"
								required="required"> <span class="text-danger">${fnameError}</span>
						</div>


						<div class="col">
							<label for="lname" class="form-label">LastName : </label> <input
								type="text" class="form-control" id="lname" name="lname"
								placeholder="Enter Last Name " value="${allData.getLname()}"
								required="required"> <span class="text-danger">${lnameError}</span>
						</div>
					</div>
					<br />
					<div class="row">

						<div class="col">
							<label for="email" class="form-label">Email : </label>
							<div class="input-group">
								<input type="text" name="email" id="email"
									placeholder="Enter Email Hear" class="form-control"
									value="${allData.getEmail()}" required="required">
							</div>
							<span class="text-danger">${emailError}</span>
						</div>
					</div>
					<br>

					<div class="row">
						<div class="col">

							<label for="pass" class="form-label">Password : </label> <input
								type="text" id="pass" name="password" class="form-control"
								placeholder="Enter Password" value="${allData.getPassword()}"
								required="required"> <span class="text-danger">${passError}</span>
						</div>
						<div class="col">
							<label for="number" class="form-label">number : </label> <input
								type="text" class="form-control" id="number" name="number"
								placeholder="Enter mobile Number" value="${allData.getNumber()}"
								required="required"> <span class="text-danger"></span>
						</div>

					</div>


					<br /> <label for="gender" class="from-label">Gender</label>
					<div class="form-checked">
						<input type="radio" class="form-check-input" name="gender"
							id="gender" value="male" checked="checked" /> &nbsp; Male <br />
						<input type="radio" class="form-check-input" name="gender"
							id="gender" value="female" />&nbsp; &nbsp;Female
					</div>


					<br> <label for="city" class="form-label">City</label> <select
						name="city" id="" class="form-select" value="${allData.getCity()}">
						<option value="Amreli">Amreli</option>
						<option value="Surat">Surat</option>
						<option value="Ahamdabad">Ahamdabad</option>
						<option value="Baroda">Baroda</option>
					</select> <br> <br>

					<div class="text-center mt-5">
						<input type="submit" value="Submit" name="" id=""
							class="btn btn-success"> <input type="reset"
							value="Reset" class="btn btn-warning"> <a href="viewData"
							class="btn btn-primary">ViewData</a>
					</div>

				</form>
			</div>


		</div>

	</div>




	</div>



</body>

</html>