<!DOCTYPE html>
<html>
<head>
<%@ include file="/basics_include/include_basics_css.jsp" %> 
<title>GGMM - Videos</title>
<link rel="icon" href="images/logo.png">
</head>
<body>
<%@ include file="partials/_nav.jsp" %>

	<div class="container"> 
	<br>
		<h1> Vos videos <a class="btn btn-primary" href="addVideo" style="color: white;"> Ajouter </a></h1>
		<hr><hr>
		<br>
		
		<div class="row" style="background-color: rgba(0,0,0,0.7); padding: 20px;">
			<div class="col-md-4" style="margin-bottom: 50px;">
				<video style="width: 100%;" controls src="storage/videos/KitKat  les nouveautés de la version 4.4 d'Androïd.mp4"></video>
				<p style="color: white; font-size: 1.2em;">
					les nouveautés de la version 4.4 d'Androïd.
				</p>
			</div>
			
			<div class="col-md-4" style="margin-bottom: 50px;">
				<video style="width: 100%;" controls src="storage/videos/ps4-les-commandes-vocales-en-video.mp4"></video>
				<p style="color: white; font-size: 1.2em;">
					les commandes vocales en video.
				</p>
			</div>
			
			<div class="col-md-4" style="margin-bottom: 50px;">
				<video style="width: 100%;" controls src="storage/videos/Xbox One  Focus sur deux jeux phares_2.mp4"></video>
				<p style="color: white; font-size: 1.2em;">
					Xbox One  Focus sur deux jeux phares_2.
				</p>
			</div>
		</div>
	</div>
	
<br><br>
<%@ include file="partials/_footer.jsp" %> 
</body>
</html>