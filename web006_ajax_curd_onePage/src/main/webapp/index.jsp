<!DOCTYPE html>
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

<!--  	j-Queary cdn -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"
	integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA=="
	crossorigin="anonymous" referrerpolicy="no-referrer"></script>

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

<script type="text/javascript">

$(document).ready(function(){
	
	$("#update").hide();
	
	
	viewData();
	
});


function addStudent(){
	 
	var fname = $("#fname").val();
	var lname = $("#lname").val();
	var email = $("#email").val();
	var password = $("#password").val();
	var number = $("#number").val();
	var city = $("#city").val();
	

	
	$.get("addStudent",{fname,lname,email,password,number,city},function(data){
		
		$("#student").html(data);
		viewData();
	});
}
	
	function viewData(){
		
		$.get("viewData",{},function(data){
			
			const info = JSON.parse(data);
			var row = "";
			row = row+"<tr><th>ID</th><th>FNAME</th><th>LNAME</th><th>EMAIL</th><th>PASSWORD</th><th>NUMBER</th><th>CITY</th></tr>"
			
			for(var i =0;i<info.length;i++){
				
				var student = info[i];
				row = row+"<tr><td>"+student.id+"</td><td>"+student.fname+"</td><td>"+student.lname+"</td><td>"+student.email+"</td><td>"+student.password+"</td><td>"+student.number+"</td><td>"+student.city+"</td><td><button class='btn btn-danger bg-danger'onClick='deleteStudent("+student.id+")'>Delete</button></td><td><button class='btn btn-primary bg-primary' onClick='dataById("+student.id+")'>Update</button></td></tr>";	
			}
			
			$("#table").html(row);
			
			
		});
	
}
	
	function deleteStudent(uid)
	{
	$.get("update",{uid},function(data){
		prompt(data);
		 viewData();
		
	});
	
	}
	
	
	function dataById(uid){
		
		$.post("update",{uid},function(data){
			
			var data = JSON.parse(data);
			
			$("#uid").val(data.id);
			$("#fname").val(data.fname);
			$("#lname").val(data.lname);
			$("#email").val(data.email);
			$("#password").val(data.password);
			$("#number").val(data.number);
			$("#city").val(data.city);
			
			
			$("#submit").hide();
			$("#update").show();
		});
		
	}
	
	function updateStudent(){
		var uid = $("#uid").val();
		var fname = $("#fname").val();
		var lname = $("#lname").val();
		var email = $("#email").val();
		var password = $("#password").val();
		var number = $("#number").val();
		var city = $("#city").val();
		
		$.post("addStudent",{uid,fname,lname,email,password,number,city},function(data){
			$("#student").html(data);
			alert(data)
			 viewData();
			 $("#update").hide();
				$("#submit").show();
			
			
		});
		
	}
	
	

</script>


</head>

<body>

	<div class="container-fluid">

		<div class="row">
			<div class="col col-md-4 col-lg-4">
				
					<div class="row">
						<p class="h2 text-center bg-dark text-light p-2 pb-3 mt-2 rounded">Registreation
							Form</p>
						<span class="text-success" id="student"></span> <span
							class="text-success">${updateMsg}</span> <span
							class="text-danger">${error}</span>
						<div class="col">
							<input type="hidden" name="uid" id="uid"> <label
								for="fname" class="form-label">Firstname :</label> <input
								type="text" class="form-control" name="fname" id="fname"
								placeholder="Enter First Name" required="required"> <span
								class="text-danger">${fnameError}</span>
						</div>


						<div class="col">
							<label for="lname" class="form-label">LastName : </label> <input
								type="text" class="form-control" id="lname" name="lname"
								placeholder="Enter Last Name " required /> <span
								class="text-danger">${lnameError}</span>
						</div>
					</div>
					<br />
					<div class="row">

						<div class="col">
							<label for="email" class="form-label">Email : </label>
							<div class="input-group">
								<input type="text" name="email" id="email"
									placeholder="Enter Email Hear" class="form-control"
									required="required">
							</div>
							<span class="text-danger">${emailError}</span>
						</div>
					</div>
					<br>

					<div class="row">
						<div class="col">

							<label for="pass" class="form-label">Password : </label> <input
								type="text" id="password" name="password" class="form-control"
								placeholder="Enter Password" required="required"> <span
								class="text-danger">${passError}</span>
						</div>
						<div class="col">
							<label for="number" class="form-label">number : </label> <input
								type="text" class="form-control" id="number" name="number"
								placeholder="Enter mobile Number" required="required"> <span
								class="text-danger"></span>
						</div>

					</div>


					<br /> <label for="gender" class="from-label">Gender</label>
					<div class="form-checked">
						<input type="radio" class="form-check-input" name="gender"
							id="gender" value="male" checked="checked" /> &nbsp; Male <br />
						<input type="radio" class="form-check-input" name="gender"
							id="gender" value="female" />&nbsp; &nbsp;Female
					</div>


					<br> <label for="lang" class="form-label">Languages :</label>
					<br> <input type="checkbox" id="lang" name="lang"
						value="gujarati">&nbsp;Gujarati &nbsp; <input
						type="checkbox" id="lang" name="lang" value="hindi">&nbsp;Hindi
					&nbsp; <input type="checkbox" id="lang" name="lang" value="English">&nbsp;English
					<br> <br> <label for="city" class="form-label">City</label>
					<select name="city" id="city" class="form-select">
						<option value="Amreli">Amreli</option>
						<option value="Surat">Surat</option>
						<option value="Ahamdabad">Ahamdabad</option>
						<option value="Baroda">Baroda</option>
					</select> <br> <br>
					<div class="text-center mt-5">
						<button class="btn btn-primary" id="submit" onclick="addStudent()">Submit</button>
						<button class="btn btn-primary" id="update" onclick="updateStudent()">Update</button>
						<input type="reset" value="Reset" class="btn btn-warning">
					</div>

				
			</div>


			<div class="col col-md-8 col-lg-8 mx-auto">

				<table id="table" class="table">




				</table>


			</div>

		</div>




	</div>



</body>

</html>