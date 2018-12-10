<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>GGMM-CLOUD s'enregistrer</title>
<link rel="icon" href="images/logo.png">
<%@ include file="/basics_include/include_basics_css.jsp" %> 
</head>
<body style="background-color: #f6f6f6;">
	<nav>
		<a class="navbar-brand" href="/ggmm"> <img alt="" src="images/logo.png" height="200"> </a>
	</nav>
	
	<div class="container">
		
		<div class="row">
			
			<form action="register" method="post" class="offset-lg-2 col-lg-8">
			
				<h2> Creer un compte sur GGMM-CLOUD </h2>
				
				<div class="row">
					<div class="col lg-12">
						<input type="text" class="form-control" name="nom" placeholder="Votre nom">
					</div>
				</div>
				<br>
				
				<div class="row">
					<div class="col lg-12">
						<input type="text" class="form-control" name="login" placeholder="Votre login">
					</div>
				</div>
				<br>
				
				<div class="row">
					<div class="col lg-12">
						<input type="text" class="form-control" name="email" placeholder="Votre email">
					</div>
				</div>
				<br>
				
				<div class="row">
					<div class="col lg-12">
						<input type="password" class="form-control" name="password" placeholder="Votre mot de passe">
					</div>
				</div>
				<br>
				
				<div class="row">
					<div class="col lg-12">
						<button type="submit" class="btn btn-block btn-primary"> Creer un compte </button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>