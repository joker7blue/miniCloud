<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GGMM-CLOUD Home</title>
<link rel="icon" href="images/logo.png">
<%@ include file="/basics_include/include_basics_css.jsp" %> 
</head>
<body>
<%@ include file="partials/_nav.jsp" %> 
	
	<br><br>
<div class="container">
	<div class="row" style="color: black;">
	
		 <div class="col-lg-3">
		 	<div class="card" style="">
			  <img class="card-img-top" src="images/musique-1024x493.png" alt="Card image cap">
			  <div class="card-body">
			    <p class="card-text">Vos musiques.</p>
			    <p style="font-size: 1.1em;">
			    	<a class="btn btn-primary" href="musiques" style="color: white;"> Voir </a>
			    	<a class="btn btn-primary" href="addMusique" style="color: white;"> Ajouter </a>
			    </p>
			  </div>
			</div>
		 </div>
		 
		 <div class="col-lg-3">
		 	<div class="card" style="">
			  <img class="card-img-top" src="images/appareil-photo.jpg" alt="Card image cap">
			  <div class="card-body">
			    <p class="card-text">Vos images.</p>
			    <p>
			    	<a class="btn btn-primary" href="pictures" style="color: white;"> Voir </a>
			    	<a class="btn btn-primary" href="addPicture" style="color: white;"> Ajouter </a>
			    </p>
			  </div>
			</div>
		 </div>
		 
		 
		 <div class="col-lg-3">
		 	<div class="card">
			  <img class="card-img-top" src="images/document.jpg" alt="Card image cap">
			  <div class="card-body">
			    <p class="card-text">Vos documents.</p>
			    <p>
			    	<a class="btn btn-primary" href="documents" style="color: white;"> Voir </a>
			    	<a class="btn btn-primary" href="addDocument" style="color: white;"> Ajouter </a>
			    </p>
			  </div>
			</div>
		 </div>
		 
		 <div class="col-lg-3">
		 	<div class="card">
			  <img class="card-img-top" src="images/seo_google_youtube.jpg" alt="Card image cap">
			  <div class="card-body">
			    <p class="card-text">Vos videos.</p>
			    <p>
			    	<a class="btn btn-primary" href="videos" style="color: white;"> Voir </a>
			    	<a class="btn btn-primary" href="addVideo" style="color: white;"> Ajouter </a>
			    </p>
			  </div>
			</div>
		 </div>
	</div>
</div>
	
	<!-- <h1> Home d'un user --- (${ sessionScope.currentUser.idUser }) ${ sessionScope.currentUser.login } </h1>-->

<br><br>
<%@ include file="partials/_footer.jsp" %> 
</body>
</html>