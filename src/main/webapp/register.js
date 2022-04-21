function register() {

    event.preventDefault();
    let name = document.querySelector("#name").value;
    let email = document.querySelector("#email").value;
    let contactNumber = document.querySelector("#mobileNumber").value;
    let createPassword = document.querySelector("#password").value;
    let conformPassword = document.querySelector("#conform_password").value;
    console.log("name:", name);
    console.log("email:", email);
    console.log("Mobile No:", contactNumber);
    console.log("Password:", createPassword);
    console.log("Conform Password:", conformPassword);
    if (name == null || name.trim() == "") {
        alert("Invalid name");
    }
    else if (email.trim() == "" || !(email).includes("@gmail.com")) {
        alert("invalid email");
    }
   
    else if (conformPassword != createPassword) {
        alert("Invalid password");

    }
    else {

        let regObj = { userName: name, userEmail: email, userContactNo: contactNumber, userPassword: createPassword, userConformPassword: conformPassword };
        console.log(regObj);
        
        try{
        const url = "http://localhost:8080/FoodOrderingApp-web/RegisterServlet?name=" + name + "&email=" + email + "&contactNumber=" + contactNumber + "&createPassword=" + createPassword + "&conformPassword=" + conformPassword;
        fetch(url).then(res=> res.text()).then(res=> {
            //console.log(res);
            
            
            
            if(res==0){
			alert("Register success");
            window.location.href = "login.html";
            }
          else{
				alert("You are already Registered");
           }
        });
       
    }
      catch(err){
	     alert("You are already Registered");
}
    }
  
}
