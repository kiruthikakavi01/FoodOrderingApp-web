function login(){
	event.preventDefault();
	let email = document.querySelector("#email").value;
	let password = document.querySelector("#password").value;
	console.log("email:",email);
	console.log("password:",password);
	
		let userObj = {userEmail: email, Password: password };
        console.log(userObj);
        try{
		   const url="http://localhost:8080/FoodOrderingApp-web/UserLoginServlet?email="+email+"&password="+password;
		   fetch(url).then(res=>res.text()).then(res=>{
			console.log(res);
			if(res==1){
			  alert("Login successfull");
			  window.location.href = "adminPage.html";
			}else{
				alert("Invalid Successfull");
			}
		});
		}
		catch(err){
	        alert(err);
		}
	}

	