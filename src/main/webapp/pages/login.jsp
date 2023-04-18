<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta charset="UTF-8">
	<title>login</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
	<link href="${pageContext.request.contextPath}/ressources/css/login.css" rel="stylesheet" ></head>
<body>
	<div class='containt'>
		
		
		<img src="${pageContext.request.contextPath}/ressources/images/logo.png" />
			
		<label id='welcome'>Bienvenue</label>
		
		
		<form method="post" action="${pageContext.request.contextPath}/home">
           <p>Connectez vous a votre compte !</p>

           <div class="form-outline mb-4">
             <input type="text" id="username" name="username" required class="form-control"
               placeholder="Nom d'utilisateur" />
            
           </div>

           <div class="form-outline mb-4">
             <input type="password" id="password" name="password" required placeholder="Mot de passe" class="form-control" />
           </div>
           
           <a class="text-muted" href="#!">Mot de paase oublie ?</a>

           <div class="text-center pt-1 mb-5 pb-1">
             <button class="btn btn-primary " type="submit">
               Connexion</button>
             
           </div>

        
         </form>

				
	
	</div>
	
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</html>