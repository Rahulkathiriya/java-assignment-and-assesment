  <%@page import="project_model.user"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS only -->
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
</head>
<body>


	<div class="container">
		<div class="row">
			<div class="col col-md-8 m-auto">
				<table class="table table-striped table-dark">

					<tr>
						<th>ID</th>
						<th>USER NAME</th>
						<th>USER EMAIL</th>
						<th>PASSWORD</th>
						<th>NUMBER</th>
						<th colspan="2" class="text-center">ACTION</th>
					</tr>


					<%
					ArrayList<user> al = (ArrayList) request.getAttribute("data");
					for (user u : al) {
					%>

					<tr>
						<td><%=u.getId()%></td>
						<td><%=u.getUserName()%></td>
						<td><%=u.getEmail()%></td>
						<td><%=u.getPassword()%></td>
						<td><%=u.getNumber()%></td>
						<td><a href="update?uid=<%=u.getId()%>" class="btn btn-primary">Update</a></td>
						<td><a href="delete?did=<%=u.getId()%>"
							class="btn btn-danger">Delete</a></td>
					</tr>
					<%
					}
					%>




				</table>

			</div>

		</div>

	</div>


</body>
</html>