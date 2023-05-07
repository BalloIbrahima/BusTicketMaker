<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@page import="com.ballo.entity.Utilisateur"%>
    
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

<% 	HttpSession sess=request.getSession();
			
			
			Utilisateur u=(Utilisateur) sess.getAttribute("user");
			
			
			

			
		%>
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
            <span class="nav-link-text ms-1">Nouveau admin</span>
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
          <a class="nav-link text-whites " href="${pageContext.request.contextPath}/pages/dashboard/listAdmin.jsp">
            
              <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
                <i class="material-icons opacity-10">group</i>
              </div>
            
            <span class="nav-link-text ms-1 active" >Admins</span>
          </a>
        </li>
        
         <li class="nav-item">
          <a class="nav-link text-white active" href="${pageContext.request.contextPath}/pages/dashboard/admin.jsp">
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
  
</div>
</body>