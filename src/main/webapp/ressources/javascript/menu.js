/**
 * 
 */
var menu = document.querySelector('#btnmenu');
var sidebar=document.querySelector('#sidenav-main');
var main = document.querySelector('main');
menu.addEventListener("click",function (event) {
		if(sidebar.classList.contains('d-none')){
			console.log('contient '+sidebar.classList.contains('d-none'));
			sidebar.classList.remove('d-none')
			main.classList.remove('main-left-rm')
			
		}else{
			console.log('Ouch!ne contient pas!');
			sidebar.classList.add('d-none')
			main.classList.add('main-left-rm')
		}
        event.preventDefault(); // don't navigate away
        console.log('Ouch! Stop poking me!');
        console.log(sidebar.classList)
    }
);