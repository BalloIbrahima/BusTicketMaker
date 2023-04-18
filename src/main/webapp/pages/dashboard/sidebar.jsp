<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
	<link href="${pageContext.request.contextPath}/ressources/css/header.css" rel="stylesheet" ></head>
</head>
<body>
	<aside class="sidenav navbar navbar-vertical navbar-expand-xs border-0 border-radius-xl my-3 fixed-start ms-3   bg-gradient-dark" id="sidenav-main">
    <div class="sidenav-header">
      <i class="fas fa-times p-3 cursor-pointer text-white opacity-5 position-absolute end-0 top-0 d-none d-xl-none" aria-hidden="true" id="iconSidenav"></i>
      <a class="navbar-brand m-0"  target="_blank">
        <img src="assets/images/icon.png" class="navbar-brand-img h-100" alt="main_logo">
        <span class="ms-1 font-weight-bold text-white">Sewa So</span>
      </a>
      <div class="close-sidebar" onclick="document.querySelector('#sidenav-main').classList.remove('toggle')"><i class="material-icons opacity-10">close</i></div>
    </div>
    <hr class="horizontal light mt-0 mb-2">
    <div class="collapse navbar-collapse  w-auto " id="sidenav-collapse-main">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link text-white">
              <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
                <i class="material-icons opacity-10">home</i>
              </div>
            <span class="nav-link-text ms-1">Dashboard</span>
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white " >
              <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
                <i class="material-icons opacity-10">support_agent</i>
              </div>
            <span class="nav-link-text ms-1">Agent</span>
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white ">
            
              <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
                <i class="material-icons opacity-10">group</i>
              </div>
            
            <span class="nav-link-text ms-1">Client</span>
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white " >
              <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
                <i class="material-icons opacity-10">account_balance</i>
              </div>
            <span class="nav-link-text ms-1">Tontine</span>
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white ">
              <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
                <i class="material-icons opacity-10">payments</i>
              </div>
            <span class="nav-link-text ms-1">Retrait</span>
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white " >
            
              <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
                <i class="material-icons opacity-10">account_balance_wallet
                </i>
              </div>
            
            <span class="nav-link-text ms-1">Salaire</span>
          </a>
        </li>
        <li class="nav-item">
            <a class="nav-link text-white ">
                <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
                  <i class="material-icons opacity-10">receipt_long</i>
                </div>
              <span class="nav-link-text ms-1">Versement</span>
            </a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white " >
            
              <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
                <i class="material-icons opacity-10">sort</i>
              </div>
            
            <span class="nav-link-text ms-1">Palier</span>
          </a>
        </li>
      </ul>
    </div>
    
    <div class="sidenav-footer position-absolute w-100 bottom-0 ">
      <div class="mx-3">
        <a class="btn bg-gradient-danger mt-4 w-100"  type="button">Déconnexion</a>
      </div>
    </div>
  </aside>
</body>
</html>