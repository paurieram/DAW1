var contingutJSON = {
	"galaxia": {
			"planetes": [{
				"nom": "Mercuri",
				"tipus": "rocos",
				"radi": 145,
				"massa": 214
			},
			{
				"nom": "Venus",
				"tipus": "rocos",
				"radi": 145,
				"massa": 214
			},
			{
				"nom": "La Terra",
				"tipus": "rocos",
				"radi": 145,
				"massa": 214,
				"satelits": ["la lluna"]
			},
			{
				"nom": "Mart",
				"tipus": "rocos",
				"radi": 145,
				"massa": 214,
				"satelits": ["Fobos","Deimos"]
			},
			{
				"nom": "Jupiter",
				"tipus": "gasos",
				"radi": 145,
				"massa": 214,
				"satelits": ["Io","Europa","Ganimedes"]
			}]		
	}
};
var plan=0;
var sat=0;
mostrar();
//----------
function mostrar(){
	document.getElementById("c1").innerHTML = "Planeta: "+(plan+1);
    document.getElementById("c2").innerHTML = contingutJSON.galaxia.planetes[plan].nom;
    document.getElementById("c3").innerHTML = contingutJSON.galaxia.planetes[plan].tipus;
    document.getElementById("c4").innerHTML = contingutJSON.galaxia.planetes[plan].radi;
	document.getElementById("c5").innerHTML = contingutJSON.galaxia.planetes[plan].massa;
    document.getElementById("c6").innerHTML = "Satelit: "+(sat+1);
	document.getElementById("c7").innerHTML = contingutJSON.galaxia.planetes[plan].satelits[sat];
    }
//----------
function back() {//<--
	Noplan()
    if (plan == 0) {
        alert("No pots anar mes endarrere");
    } else {
        plan--;
    }
	sat=0;
    mostrar();
}
function next() {//-->
	Noplan()
    if (plan >= contingutJSON.galaxia.planetes.length - 1) {
        alert("Has arrivat al final");
    } else {
        plan++;
    }
	sat=0;
    mostrar();
}
//----------
function backs() {//<--
	Nosat()
    if (sat == 0) {
		if (contingutJSON.galaxia.planetes[plan].satelits[sat]!=null){
 			alert("No pots anar mes endarrere");
		}else{
			alert("No hi han satelits");
		}
    } else {
        sat--;
    }
    mostrar();
}
function nexts() {//-->
	Nosat()
    if (sat >= contingutJSON.galaxia.planetes[plan].satelits.length - 1) {
			alert("Has arrivat al final");
    } else {
        sat++;
    }
    mostrar();
}
//----------
function Noplan() {
    document.getElementById("c2").innerHTML = "";
    document.getElementById("c3").innerHTML = "";
    document.getElementById("c4").innerHTML = "";
    document.getElementById("c5").innerHTML = "";
	document.getElementById("c7").innerHTML = "";
}
function Nosat() {
    document.getElementById("c7").innerHTML = "";
}
//----------