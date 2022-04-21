
	const url="http://localhost:8080/FoodOrderingApp-web/listMenuServlet";
fetch(url).then(res=> res.json()).then(res=> {
       // console.log(res);
        let menu=res;
        let content="";
        for(let menus of menu){
	
        	content=content+`<tr><td>${menus.id}</td><td>${menus.vegDishes}</td><td>${menus.vegDishesPrice}</td><td>${menus.nonVegDishes}</td><td>${menus.nonVegDishesPrice}</td></tr>`;
        }
        document.querySelector("#menuTbl").innerHTML=content;
        });
