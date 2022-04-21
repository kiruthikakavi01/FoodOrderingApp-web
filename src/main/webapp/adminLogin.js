function adminLogin(){
	event.preventDefault();
	let email=document.querySelector("#email").value;
	let password=document.querySelector("#password").value;
	console.log("email:",email);
	console.log("Password:",password);
	
		let adminObj={adminEmail:email,adminPassword:password};
		console.log(adminObj);
		try{
			const url="http://localhost:8080/FoodOrderingApp-web/AdminLoginServlet?email="+email+"&password="+password;
			fetch(url).then(res=>res.text()).then(res=>{
				console.log(res);
				if(res==1){
					alert("Admin Login Successfull");
					window.location.href = "adminPage.html";
				}else{
					alert("Invalid ");
				}
			});
		}
		catch(err){
			alert(err);
		}
	}
    

	
