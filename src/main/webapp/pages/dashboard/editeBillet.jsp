<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<link href="${pageContext.request.contextPath}/ressources/css/header.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/ressources/css/index.css" rel="stylesheet" >
		<link href="${pageContext.request.contextPath}/ressources/css/admin.css" rel="stylesheet" >
	
		<link href="${pageContext.request.contextPath}/ressources/css/material-dashboard.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/ressources/css/material-dashboard.min.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/ressources/css/nucleo-icons.css" rel="stylesheet" >
	<link href="${pageContext.request.contextPath}/ressources/css/nucleo-svg.css" rel="stylesheet" >

</head>
<body>
	
 

<div>
    <!-- menu -->
    <aside class="sidenav navbar navbar-vertical navbar-expand-xs border-0 border-radius-xl my-3 fixed-start ms-3   bg-gradient-dark" id="sidenav-main">
    <div class="sidenav-header">
      <i class="fas fa-times p-3 cursor-pointer text-white opacity-5 position-absolute end-0 top-0 d-none d-xl-none" aria-hidden="true" id="iconSidenav"></i>
      <a class="navbar-brand m-0"  target="_blank">
        <img src="${pageContext.request.contextPath}/ressources/images/logo.png" class="navbar-brand-img h-100" alt="main_logo">
        <span class="ms-1 font-weight-bold text-white">BusTicketMaker
        <!--<div class="close-sidebar"><i class="material-icons opacity-10">close</i></div>  -->
        
        </span>
        
        
      </a>
      
    </div>
    <hr class="horizontal light mt-0 mb-2">
    <div class="collapse navbar-collapse  w-auto " id="sidenav-collapse-main">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link text-white" href="${pageContext.request.contextPath}/pages/dashboard/index.jsp">
              <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
                <i class="material-icons opacity-10">home</i>
              </div>
            <span class="nav-link-text ms-1">Accueil</span>
          </a>
        </li>
         <li class="nav-item">
          <a class="nav-link text-white " href="${pageContext.request.contextPath}/pages/dashboard/newBillet.jsp">
              <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
                <i class="material-icons opacity-10">add_to_photos</i>
              </div>
            <span class="nav-link-text ms-1">nouveau billet</span>
          </a>
        </li>
       
        
        <li class="nav-item">
          <a class="nav-link text-white " href="${pageContext.request.contextPath}/pages/dashboard/listAdmin.jsp">
            
              <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
                <i class="material-icons opacity-10">group</i>
              </div>
            
            <span class="nav-link-text ms-1 active" >Admins</span>
          </a>
        </li>
        
         <li class="nav-item">
          <a class="nav-link text-white " href="${pageContext.request.contextPath}/pages/dashboard/admin.jsp">
              <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
                <i class="material-icons opacity-10">group_add</i>
              </div>
            <span class="nav-link-text ms-1">Nouveau admin</span>
          </a>
        </li>
       
      </ul>
    </div>
    
    <div class="sidenav-footer position-absolute w-100 bottom-0 ">
      <form class="mx-3" method="get" action="${pageContext.request.contextPath}/home">
        <button class="btn bg-gradient-danger mt-4 w-100"  name="logoutbtn" value="logout" type="submit">Déconnexion</button>
      </form>
    </div>
  </aside>
    <!-- end menu -->
    
    
    <main class="main-content position-relative max-height-vh-100 h-100 border-radius-lg ">
      <!-- Head -->
       <!-- Navbar -->
       <nav class="navbar navbar-main navbar-expand-lg px-0 mx-4 shadow-none border-radius-xl" id="navbarBlur" data-scroll="true">
        <div class="container-fluid py-1 px-3">
            <nav aria-label="breadcrumb">
                <ol class="breadcrumb bg-transparent mb-0 pb-0 pt-1 px-0 me-sm-6 me-5">
                    <li class="breadcrumb-item text-sm custom-toggler">
                        <a class="opacity-5 text-dark" href="#" id="btnmenu" >
                            <i class="material-icons opacity-10" >menu</i>
                        </a>
                    </li>
                    <li class="breadcrumb-item text-sm"><a class="opacity-5 text-dark" href="javascript:;">Pages</a></li>
                    <li class="breadcrumb-item text-sm text-dark active" aria-current="page">Accueil</li>
                </ol>
                <h6 class="font-weight-bolder mb-0">Nouveau Billet</h6>
            </nav>
           
            <ul class="navbar-nav  justify-content-end">
                <li class="nav-item d-flex align-items-center">
                    <a href="../pages/sign-in.html" class="nav-link text-body font-weight-bold px-0">
                        <i class="fa fa-user me-sm-1"></i>
                        <span class="d-sm-inline d-none">Ballo Ibrahima</span>
                    </a>
                </li>
                
            </ul>
        </div>
    <!-- </div> -->
    </nav>
     <!-- end head -->
     <!-- body contenu  -->
     <div class=" ps-5 pe-4 pb-5" >
     	<div class=" ps-5 pe-4 pb-5" >
     	<div class="container mt-5 mb-5 d-flex justify-content-center">
		    <form class="card px-1 py-4" method="post" action="${pageContext.request.contextPath}/newBillet">
		        <div class="card-body">
		            <h6 class="card-title mb-3">Modifier billet !</h6>
		            <div class="row">
		                <div class="col-sm-12">
		                    <div class="form-group">
		                       <input class="form-control" id='nom' name='nom' required type="text" placeholder="Nom Client"> </div>
		                </div>
		            </div>
		            <div class="row">
		                <div class="col-sm-12">
		                    <div class="form-group">
		                        <div class="input-group"> <input class="form-control"  id='prenom' name='prenom' required type="text" placeholder="Prenom Client"> </div>
		                    </div>
		                </div>
		            </div>
		            
		             <div class="row">
		                <div class="col-sm-12">
		                    <div class="form-group">
		                        <div class="input-group"> <input class="form-control"  id='date' name='date' required type="datetime-local" placeholder="Date et heure de depart "> </div>
		                    </div>
		                </div>
		            </div>
		            <div class="row">
		                <div class="col-sm-12">
		                    <div class="form-group">
		                        <div class="input-group"> <input class="form-control"  id='destination' name='destination' required type="text" placeholder="Destination"> </div>
		                    </div>
		                </div>
		            </div>
		            
		            <div class="row">
		                <div class="col-sm-12">
		                    <div class="form-group">
		                        <div class="input-group"> <input class="form-control"  id='prix' name='prix' required type="number" placeholder="Prix"> </div>
		                    </div>
		                </div>
		            </div>
		            
		            <% if (request.getAttribute("erreur")!=null) { %>
           
           			<div class="row erreur">
		                <div class="col-sm-12">
		                    <div class="form-group">
		                        <div class="input-group"> 
		                        	<label><%= request.getAttribute("erreur") %> </label>
		                        </div>
		                    </div>
		                </div>
		            </div>
		        
		           <%} %>
		           
		           <% if (request.getAttribute("succes")!=null) { %>
           
           			<div class="row succes">
		                <div class="col-sm-12">
		                    <div class="form-group">
		                        <div class="input-group"> 
		                        	<label><%= request.getAttribute("succes") %> </label>
		                        </div>
		                    </div>
		                </div>
		            </div>
		        
		           <%} %>
		            
		           
		            <div class=" d-flex flex-column text-center px-5 mt-3 mb-3"> <small class="agree-text">Pour mofier, changer des champs et valider</small> <a href="#" class="terms">valider</a> </div> <button class="btn btn-primary btn-block confirm-button" type='submit' name="modifierbtn" value="modifier">Modifier</button>
		        </div>
		    </form>
		</div>
     </div>
     </div>
     <!-- end body contenu -->
        
   </main>

</div>
</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="${pageContext.request.contextPath}/ressources/javascript/menu.js"></script>
</html>