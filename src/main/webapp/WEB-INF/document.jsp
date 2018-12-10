<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>GGMM - Documents</title>
<%@ include file="/basics_include/include_basics_css.jsp" %> 
</head>
<body>
<%@ include file="partials/_nav.jsp" %> 

	<div class="container">
	<br>
		<h1> Vos documents <a class="btn btn-primary" href="addDocument" style="color: white;"> Ajouter </a></h1>
		<hr><hr>
		<br>
		
		<div class="row" style="background-color: rgba(0,0,0,0.7); padding: 20px;">
			<div class="col-sm-12">
			
			<div class="row">
				<div class="col-md-4">
					<a href="storage/documents/apprendre_la_cuisine.PNG" >
						<img  class="img-thumbnail" src="storage/documents/apprendre_la_cuisine.PNG" width="200"/>
					</a>
				</div>
				
				<div class="col-md-4">
					<p style="color: white; font-size: 1.2em;">
						Apprenez a faire la quisine grace à ce livre miracle.
						
						<br><br>
						<a href="storage/documents/MOOC-Cuisine-Afpa-Saison-1.pdf" class="btn btn-warning"> Telecharger </a>
					</p>
				</div>
			</div>
			<span style="color: white;"><hr style="background-color: white;"></span>
			
			<div class="row">
				<div class="col-md-4">
					<a href="storage/documents/apprendre_la_gym.PNG" >
						<img  class="img-thumbnail" src="storage/documents/apprendre_la_gym.PNG" width="200"/>
					</a>
				</div>
				
				<div class="col-md-4">
					<p style="color: white; font-size: 1.2em;">
						Vous voulez faire de la gim? C'est avec ce livre que vous reussirez.
						
						<br><br>
						<a href="storage/documents/gymnastique.pdf" class="btn btn-warning"> Telecharger </a>
					</p>
				</div>
			</div>
			<span style="color: white;"><hr style="background-color: white;"></span>
			
			
			<div class="row">
				<div class="col-md-4">
					<a href="storage/documents/dresser_son_chien.PNG" >
						<img  class="img-thumbnail" src="storage/documents/dresser_son_chien.PNG" width="200"/>
					</a>
				</div>
				
				<div class="col-md-4">
					<p style="color: white; font-size: 1.2em;">
						Comment bien dressez son chien... vous verez c'est très facile.
						
						<br><br>
						<a href="storage/documents/Sportdog_manuel-dressage_2014.pdf" class="btn btn-warning"> Telecharger </a>
					</p>
				</div>
			</div>
			
			
			</div>
		</div>
	</div>
	
<br><br>
<%@ include file="partials/_footer.jsp" %> 
</body>
</html>