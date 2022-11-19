<!DOCTYPE html>
<%@page import="java.lang.reflect.Array"%>
<%@page import="model.form"%>
<%@page import="dao.regForm"%>
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
				<form action="registration"
					class="border border-dark bg-dark text-light p-4 rounded">
					<div class="row">
						<p class="h1 text-center bg-dark text-light p-2 pb-3 mt-2 rounded">Registreation
							Form</p>
						<span class="text-success">${update}</span> <span
							class="text-success">${addData}</span> <span
							class="text-danger">${emailError}</span>
						<div class="col">
							<input type="hidden" name="uid" value="${allData.getId()}">
							<label for="fname" class="form-label">Firstname :</label> <input
								type="text" class="form-control" name="fname" id="fname"
								value="${allData.getFname()}" placeholder="Enter First Name"
								required />

						</div>
						<div class="col">
							<label for="lname" class="form-label">LastName : </label> <input
								type="text" class="form-control" id="lname" name="lname"
								value="${allData.getLname()}" placeholder="Enter Last Name "
								required />
						</div>
					</div>
					<br />
					<div class="row">
						<div class="col">
							<label for="number" class="form-label">number : </label> <input
								type="text" class="form-control" id="number" name="number"
								value="${allData.getNumber()}" placeholder="Enter mobile Number"
								required />
						</div>
						<div class="col">
							<label for="email" class="form-label">Email</label>
							<div class="input-group">
								<input type="text" name="email" id="email"
									value="${allData.getEmail()}" placeholder="Enter Email Hear"
									class="form-control" required> <span
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
							value="Reset" class="btn btn-warning">
					</div>

				</form>
			</div>

			<div class="col col-md-7">

				<table class="table table-striped table-dark">


					<tr>
						<th>ID</th>
						<th>FIRST NAME</th>
						<th>LAST NAME</th>
						<th>NUMBER</th>
						<th>EMAIL</th>
						<th>GENDER</th>
						<th>CITY</th>
						<th colspan="2" class="text-center">OPREATION</th>
					</tr>

					<%
					ArrayList<form> al = (ArrayList<form>) request.getAttribute("data");
					for (form reg : al) {
					%>
					
					<tr> 
					   
					   <td><%=reg.getId() %></td>
					   <td><%=reg.getFname() %></td>
					   <td><%=reg.getLname() %></td>
					   <td><%=reg.getNumber() %></td>
					   <td><%=reg.getEmail() %></td>
					   <td><%=reg.getGender() %></td>
					   <td><%=reg.getCity() %></td>
					   <td><a href="update?uid=<%=reg.getId()%>&&action=update" class="btn btn-primary">Update</a></td>
					   <td><a href="update?uid=<%=reg.getId()%>&&action=delete" class="btn btn-danger">Delete</a></td>
					</tr>
					
					
					<%
					}
					%>



				</table>


			</div>
		</div>

	</div>




	</div>



</body>

</html>