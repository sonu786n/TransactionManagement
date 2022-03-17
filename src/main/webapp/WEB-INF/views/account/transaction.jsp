<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
<%@ include file ="/WEB-INF/css/people.css"%>
.SmallInput { width: 100px; height: 20px; }
input[type=submit] {
  background-color: #1a416c;
  border: none;
  color: white;
  padding: 06px 20px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}
</style>
</head>
<body>
<script src="https://www.kryogenix.org/code/browser/sorttable/sorttable.js"></script>
	<h1>All Transaction</h1>
	<form action="/pay">
	<table class="sortable">	
	<tr>
	<td><input type="text" class="SmallInput" placeholder="Name" name="name"/></td>	
	<td><input type="text" class="SmallInput" placeholder="Amount" name="amount"/></td>	
	<td><input type="text" class="SmallInput" placeholder="Email" name="email"/></td>
	<td><input type="text" class="SmallInput" placeholder="Mobile" name="mobile"/></td>
	<td><input type="text" class="SmallInput" placeholder="Details" name=details/></td>
	<td><input type="submit" value="Pay" /></td>	
	</tr>	
	</table>
</form>
	<table class="styled-table">
		<thead>
			<tr>
				<th>Name</th>
				<th>Mobile</th>
				<th>Email</th>				
				<td>Details</td>				
				<th>Amount</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${transactions}" var="par">
			<tr>
				<td>${par.name}</td>
				<td>${par.mobile}</td>
				<td>${par.email}</td>				
				<td>${par.details}</td>
				<td>${par.amount}</td>
			</tr>
			</c:forEach>
		</tbody>
		
	</table>
<script src="https://www.kryogenix.org/code/browser/sorttable/sorttable.js"></script>



</body>
</html>