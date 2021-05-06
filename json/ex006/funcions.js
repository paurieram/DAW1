var chabitatges = 0;
var chabitants = 0;
mostrar();
function mostrar(){
    document.getElementById("habitatge").innerHTML = chabitatges+1;
    document.getElementById("carrer").value = contingutJSON.habitatges[chabitatges].carrer;
    document.getElementById("num").value = contingutJSON.habitatges[chabitatges].num;
    document.getElementById("porta").value = contingutJSON.habitatges[chabitatges].porta;
    document.getElementById("habitant").innerHTML = chabitants+1;
    document.getElementById("nif").value = contingutJSON.habitatges[chabitatges].habitants[chabitants].nif;
    document.getElementById("nom").value = contingutJSON.habitatges[chabitatges].habitants[chabitants].nom;
    document.getElementById("cognoms").value = contingutJSON.habitatges[chabitatges].habitants[chabitants].cognoms;
    document.getElementById("data").value = contingutJSON.habitatges[chabitatges].habitants[chabitants].data;
    document.getElementById("sexe").value = contingutJSON.habitatges[chabitatges].habitants[chabitants].sexe;
    }
//----------
function anteriorhabitatge() {//<--
    NoMHabitatge();
    if (chabitatges == 0) {
        chabitatges = contingutJSON.habitatges.length - 1;
    } else {
        chabitatges--;
    }
    chabitants = 0;
    mostrar();
}
function seguenthabitatge() {//-->
    NoMHabitatge();
    if (chabitatges >= contingutJSON.habitatges.length - 1) {
        chabitatges = 0;
    } else {
        chabitatges++;
    }
    chabitants = 0;
    mostrar();
}
//----------
function anteriorh(){//<-
    NoMHabitant();
    if (chabitants==0){
        chabitants = contingutJSON.habitatges[chabitatges].habitants.length-1;
    } else {
        chabitants--;
    }
    mostrar();
}
function seguenth(){//->
    NoMHabitant();
    if (chabitants>=contingutJSON.habitatges[chabitatges].habitants.length-1){
        chabitants = 0;
    } else {
        chabitants++;
    }
    mostrar();
}
//----------
function buscar(){
	var b = new Boolean(false);
	for(var y=0;y!=contingutJSON.habitatges.length;y++){
		if (document.getElementById("busca").value == contingutJSON.habitatges[y].carrer){
			b=true;
			chabitatges=y;
			mostrar();
		}
	}
	if(b==false){
		alert("No s'ha trobat");
	}
}
//----------
function seleccionarhabitatge() {
    chabitatges = document.getElementById("seleccionarhabitatge1").value - 1;
    mostrar();
}
function seleccionarh() {
    chabitants = document.getElementById("seleccionarhabitant1").value - 1;
    mostrar();
}
//----------
function modify() {
    contingutJSON.habitatges[chabitatges].carrer = document.getElementById("carrer").value;
    contingutJSON.habitatges[chabitatges].num = document.getElementById("num").value;
    contingutJSON.habitatges[chabitatges].porta = document.getElementById("porta").value;
  
    alert("Habitatge modificat correctament");
}
function Delete() {
    contingutJSON.habitatges.splice(chabitatges, 1);
    seguenthabitatge();
    alert("Habitatge eliminat correctament");
}
function create() {
    contingutJSON.habitatges.push({ "carrer": document.getElementById("carrer").value, "num": document.getElementById("num").value, "porta": document.getElementById("porta").value, "habitants":[{"nif": document.getElementById("nif").value,"nom": document.getElementById("nom").value,"cognoms": document.getElementById("cognoms").value,"data": document.getElementById("data").value,"sexe": document.getElementById("sexe").value}]});
    alert("Habitatge creat correctament");
}
//----------
function modifyh() {
    contingutJSON.habitatges[chabitatges].habitants[chabitants].nif = document.getElementById("nif").value;
    contingutJSON.habitatges[chabitatges].habitants[chabitants].nom = document.getElementById("nom").value;

    contingutJSON.habitatges[chabitatges].habitants[chabitants].cognoms = document.getElementById("cognoms").value;
    contingutJSON.habitatges[chabitatges].habitants[chabitants].data = document.getElementById("data").value;
    contingutJSON.habitatges[chabitatges].habitants[chabitants].sexe = document.getElementById("sexe").value;
    alert("Habitant modificat correctament");
}
function Deleteh() {
    contingutJSON.habitatges[chabitatges].habitants.splice(chabitants, 1);
    seguenth();
    alert("Habitant eliminat correctament");
}
function createh() {
    contingutJSON.habitatges[chabitatges].habitants.push({ "nif": document.getElementById("nif").value,"nom": document.getElementById("nom").value,"cognoms": document.getElementById("cognoms").value,"data": document.getElementById("data").value,"sexe": document.getElementById("sexe").value});
    alert("Habitant creat correctament");
}
//----------
function NoMHabitant() {
    document.getElementById("habitant").innerHTML = "";
    document.getElementById("nif").value = "";
    document.getElementById("nom").value = "";
    document.getElementById("cognoms").value = "";
    document.getElementById("data").value = "";
    document.getElementById("sexe").value = "";
}
function NoMHabitatge() {
    document.getElementById("habitatge").innerHTML = "";
    document.getElementById("carrer").value = "";
    document.getElementById("num").value = "";
    document.getElementById("porta").value = "";
    document.getElementById("habitant").innerHTML = "";
    document.getElementById("nif").value = "";
    document.getElementById("nom").value = "";
    document.getElementById("cognoms").value = "";
    document.getElementById("data").value = "";
    document.getElementById("sexe").value = "";
}
//----------