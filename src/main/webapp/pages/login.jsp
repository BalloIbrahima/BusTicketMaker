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
		
		<label id='msg'>Veuillez remplir les champs pour vous connectez !</label>
		
		<form>
		  <!-- Email input -->
		  <div class="form-outline mb-2">
		    <input type="email" id="form2Example1" class="form-control" />
		    <label class="form-label" for="form2Example1">Email address</label>
		  </div>
		
		  <!-- Password input -->
		  <div class="form-outline mb-2">
		    <input type="password" id="form2Example2" class="form-control" />
		    <label class="form-label" for="form2Example2">Password</label>
		  </div>
		
		  <!-- 2 column grid layout for inline styling -->
		  <div class="row mb-4">
		
		    <div class="col">
		      <!-- Simple link -->
		      <a href="#!">Forgot password?</a>
		    </div>
		  </div>
		
		  <!-- Submit button -->
		  <button type="button" class="btn btn-primary btn-block mb-4">Sign in</button>
		
		</form>
				
	
	</div>
	
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</html>