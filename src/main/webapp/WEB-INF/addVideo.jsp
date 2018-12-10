<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajouter une video</title>
<%@ include file="/basics_include/include_basics_css.jsp" %> 
</head>
<body>
<%@ include file="partials/_nav.jsp" %> 

<div class="container">
		
		<br><br>
		<div class="row justify-content-md-center" style="/*background-color: red;*/">
		
			<div class="col-lg-8 text-center" style="/*background-color: green;*/">
				<h1> Ajouter une video </h1>
				<hr><hr>
				<div class="alert alert-warning" role="alert">
				  Vous pourrez bientot ajouter vos propres videos!
				</div>
				
				<div class="row">
					<form class="col-sm-12" enctype="multipart/form-data">
						
						<div class="row">
							<div class="col-sm-12">
								<input type="text" name="nomVideo" placeholder="Nom de votre video" class="form-control">
							</div>
						</div>
						
						<br>
						<div class="row">
							<div class="col-sm-12">
								<input type="file" name="fileVideo" placeholder="Choississez votre video" class="form-control">
							</div>
						</div>
						
						<br>
						<div class="row">
							<div class="col-sm-12">
								<button type="submit" name="AjouterVideo" class="btn btn-block btn-primary" disabled> Ajouter la video </button>
							</div>
						</div>
					</form>
				</div>
			</div>
			
		</div>
		
	</div>
	
<br><br>
<%@ include file="partials/_footer.jsp" %> 
</body>
</html>