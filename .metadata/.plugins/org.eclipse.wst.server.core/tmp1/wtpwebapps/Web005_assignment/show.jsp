<%@page import="studentForm.studentIfo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Data</title>
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

</head>
<body>
	
	  	<form action="showStudent">
		<div class="row ">
			<div class="col col-md-10 mx-auto">

				<table class="table rounded table-striped table-dark">

					<tr>
						<th>ID</th>
						<th>FNAME</th>
						<th>LNAME</th>
						<th>EMAIL</th>
						<th>PASSWORD</th>
						<th>NUMBER</th>
						<th>GENDER</th>
						<th>CITY</th>
						<th colspan="2" class="text-center">OPREATIONS</th>


					</tr>

					<%
					ArrayList<studentIfo> al = (ArrayList) request.getAttribute("data");
					for (studentIfo st : al) {
					%>
					<tr>
						<td><%=st.getId()%></td>
						<td><%=st.getFname()%></td>
						<td><%=st.getLname()%></td>
						<td><%=st.getEmail()%></td>
						<td><%=st.getPassword()%></td>
						<td><%=st.getNumber()%></td>
						<td><%=st.getGender()%></td>
						<td><%=st.getCity()%></td>
						<td><a href="update?uid=<%=st.getId()%>&&action=update"
							class="btn btn-warning">Update</a></td>
						<td><a href="update?uid=<%=st.getId()%>&&action=delete"
							class="btn btn-danger">delete</a></td>
					</tr>
					<%
					}
					%>
				</table>

			</div>
		</div>
	</form>
</body>
</html>