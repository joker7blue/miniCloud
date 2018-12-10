<!DOCTYPE html>
<html>
<head>
<%@ include file="/basics_include/include_basics_css.jsp" %> 
<title>GGMM - Pictures</title>
<link rel="icon" href="images/logo.png">
</head>
<body>
<%@ include file="partials/_nav.jsp" %>

	<div class="container"> 
	<br>
		<h1> Vos images <a class="btn btn-primary" href="addPicture" style="color: white;"> Ajouter </a></h1>
		<hr><hr>
		<br>
		
		<div class="row" style="background-color: rgba(0,0,0,0.7); padding: 20px;">
			<div class="col-md-4">
			<a href="storage/pictures/messi et ronaldo.jpg">
				<img  class="img-thumbnail" src="storage/pictures/messi et ronaldo.jpg" />
			</a>
				<p style="color: white; font-size: 1.2em;">
					Messi et Ronaldo.
				</p>
			</div>
			
			<div class="col-md-4">
			<a href="storage/pictures/boruto 1.jpg">
				<img  class="img-thumbnail" src="storage/pictures/boruto 1.jpg" />
			</a>
				<p style="color: white; font-size: 1.2em;">
					Boruto next generation.
				</p>
			</div>
			
			<div class="col-md-4">
			<a href="storage/pictures/adult-beard-briefcase-590515.jpg">
				<img  class="img-thumbnail" src="storage/pictures/adult-beard-briefcase-590515.jpg" />
			</a>
				<p style="color: white; font-size: 1.2em;">
					Adultes en dialogue.
				</p>
			</div>
			
			<div class="col-md-4">
			<a href="storage/pictures/FB_IMG_1475059271347.jpg">
				<img class="img-thumbnail" src="storage/pictures/FB_IMG_1475059271347.jpg" />
			</a>
				<p style="color: white; font-size: 1.2em;">
					Noragami.
				</p>
			</div>
			
			<div class="col-md-4">
			<a href="storage/pictures/black (40).jpg">
				<img class="img-thumbnail" src="storage/pictures/black (40).jpg" />
			</a>
				<p style="color: white; font-size: 1.2em;">
					The end.
				</p>
			</div>
			
			<div class="col-md-4"">
			<a href="storage/pictures/black (8).jpg">
				<img class="img-thumbnail" src="storage/pictures/black (8).jpg" />
			</a>
				<p style="color: white; font-size: 1.2em;">
					Beautiful space.
				</p>
			</div>
		</div>
	</div>
	
<br><br>
<%@ include file="partials/_footer.jsp" %> 
</body>
</html>