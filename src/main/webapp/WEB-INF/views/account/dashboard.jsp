<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" href="dashboard.css">

<style><%@ include file="/WEB-INF/css/dashboard.css"%></style>

</head>
<body>


	<div class="wrapper">

		<div class="section">
			<div class="top_navbar">
				<div class="hamburger">
					<a href="#"> <i class="fas fa-bars"></i></a>					
				</div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<h2>Welcome ${sessionScope.username }</h2>
				<a class="fixed" href="${pageContext.request.contextPath }/logout">Logout</a>
			</div>

		</div>
<!-- src ="C:\Users\abdsatta\Desktop\AllDocs\AbdulSattar.jpg" -->
		<div class="sidebar">
			<div class="profile">
				<img src="https://scontent.fbom14-1.fna.fbcdn.net/v/t1.6435-9/62140929_2196898907061101_7992630002631835648_n.jpg?_nc_cat=100&ccb=1-5&_nc_sid=09cbfe&_nc_ohc=Mqf12_e58mcAX82sk8W&_nc_ht=scontent.fbom14-1.fna&oh=00_AT--HRTpbbjtRVYT2W0mSUg4rE-l1-Nta5But_QYJZt47g&oe=624C0A5F"				
				alt="profile_picture">
				<h3>${sessionScope.username }</h3>
				<p>Software Develeoper </p>
			</div>
			<div>
				<ul>
					
					<li><a href="people"> <span class="icon"><i
								class="fas fa-user-friends"></i></span> <span class="item">People</span>
					</a></li>
					<li><a href="transaction"> <span class="icon"><i
								class="fas fa-tachometer-alt"></i></span> <span class="item">Transactions</span>
					</a></li>
					<li><a href="#"> <span class="icon"><i
								class="fas fa-database"></i></span> <span class="item">Search</span>
					</a></li>

				</ul>
			</div>

		</div>

	</div>
	
	

	<script>
	var hamburger = document.querySelector(".hamburger");
    hamburger.addEventListener("click", function(){
        document.querySelector("body").classList.toggle("active");
    })
	</script>
</body>

</html>