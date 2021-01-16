<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
 <div align="center">
  <h1>Welcome!</h1>
 </div>
 
 <div>
 	<h3>Choose what you want to access:</h3>
 	<div class="flex">
 	<button type="submit" class="btn btn-primary dropbtn" onClick="books()">Books</button>	
 	<button type="submit" class="btn btn-primary dropbtn" onClick="members()">Members</button>
 	</div>
 	 
 	 <div id="myDropdown1" class="dropdown-content">
   		 <a href="#">View All Books</a>
   		 <a href="#">Add New Book</a>
  		 <a href="#">Delete Book</a>
  		 <a href="#">Issue Book</a>
  		 <a href="#">Return Book</a>
 	 </div>
 	 
 	 <div id="myDropdown2" class="dropdown-content">
  	 	 <a href="#">View All Members</a>
   		 <a href="#">Add New Member</a>
   		 <a href="#">Revoke Membership</a>
 	 </div>
 </div>
 
 <script>
function books(){
	document.getElementById("myDropdown1").classList.toggle("show");
}

function members(){
	document.getElementById("myDropdown2").classList.toggle("show");
}



//Close the dropdown menu if the user clicks outside of it
window.onclick = function(event) {
	  if (!event.target.matches('.dropbtn')) {
	    var dropdowns = document.getElementsByClassName("dropdown-content");
	    var i;
	    for (i = 0; i < dropdowns.length; i++) {
	      var openDropdown = dropdowns[i];
	      if (openDropdown.classList.contains('show')) {
	        openDropdown.classList.remove('show');
	      }
	    }
	  }
	}
 </script>
 
</body>
</html>