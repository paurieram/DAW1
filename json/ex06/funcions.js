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
function anteriorhabitatge() {
    if (chabitatges == 0) {
        chabitatges = contingutJSON.habitatges.length - 1;
    } else {
        chabitatges--;
    }
    chabitants = 0;
    mostrar();
}
function seguenthabitatge() {
    if (chabitatges >= contingutJSON.habitatges.length - 1) {
        chabitatges = 0;
    } else {
        chabitatges++;
    }
    chabitants = 0;
    mostrar();
}
function seleccionarhabitatge() {
    chabitatges = document.getElementById("seleccionarhabitatge1").value - 1;
    mostrar();
}
function seleccionarhabitant() {
    chabitants = document.getElementById("seleccionarhabitant1").value - 1;
    mostrar();
}

function modify() {
    contingutJSON.habitatges[chabitatges].carrer = document.getElementById("carrer").value;
    contingutJSON.habitatges[chabitatges].num = document.getElementById("num").value;
    contingutJSON.habitatges[chabitatges].porta = document.getElementById("porta").value;
    contingutJSON.habitatges[chabitatges].habitants[chabitants].nif = document.getElementById("nif").value;
    contingutJSON.habitatges[chabitatges].habitants[chabitants].nom = document.getElementById("nom").value;
    contingutJSON.habitatges[chabitatges].habitants[chabitants].cognoms = document.getElementById("cognoms").value;
    contingutJSON.habitatges[chabitatges].habitants[chabitants].data = document.getElementById("data").value;
    contingutJSON.habitatges[chabitatges].habitants[chabitants].sexe = document.getElementById("sexe").value;
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