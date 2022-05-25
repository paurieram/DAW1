var contingutJSON = {
  "alumnes":[{
    "nom": "Dolores",
    "cognoms": [
      "Fuertes",
      "de Barriga"
      ],
    "escape": "terror"
  },
  {
    "nom": "Macias",
    "cognoms": [
      "Pajas",
      "Grandes"
      ],
    "escape": "misteri"
  },
  {
    "nom": "Matilde",
    "cognoms": [
      "Pilate",
      "Vello"
      ],
    "escape": "intriga"
  },
  {
    "nom": "Luz",
    "cognoms": [
      "Cuesta",
      "Mogollon"
      ],
    "escape": "terror"
  },
  {
    "nom": "Benito",
    "cognoms": [
      "Camelas",
      "Hermoso"
      ],
    "escape": "intriga"
}]};

var al=0;//posicio de lalumne
var maxq = contingutJSON.alumnes.length;
var a = new Array(maxq);//respostes marcades
var preu=0;
var radio ={"opcions": ["misteri","intriga","terror"]};
start();
mostrar();
//----------
function mostrar(){//mostrar
	document.getElementById("c1").innerHTML = "Alumne: "+(al+1);
  document.getElementById("c2").innerHTML = contingutJSON.alumnes[al].nom;
  document.getElementById("c3").innerHTML = contingutJSON.alumnes[al].cognoms[0]+" "+contingutJSON.alumnes[al].cognoms[1];
  document.getElementById("c4").innerHTML = radio.opcions[(a[al]-1)];
  document.getElementById("c6").innerHTML = "TOTAL: "+preu+" €";
  for(var i=0;i!=radio.opcions.length;i++){
    document.getElementById("en"+(i+1)).innerHTML = radio.opcions[i];
    document.getElementById("r"+(i+1)).checked = false;
  }
  if (a[al]!=null){
    document.getElementById("r"+a[al]).checked = true;
    // console.log("true");
  }
  // console.log(a[al]);
}
function start(){//inicialitzar la web
  for(var i=0;i!=contingutJSON.alumnes.length;i++){
    if("misteri"==contingutJSON.alumnes[i].escape){//misteri
      preu=preu+20;
      a[i]=1;
      console.log("+20€ = "+preu+" a["+i+"]="+a[i]);
    }else if("intriga"==contingutJSON.alumnes[i].escape){//intriga
      preu=preu+25;
      a[i]=2;
      console.log("+25€ = "+preu+" a["+i+"]="+a[i]);
    }else if("terror"==contingutJSON.alumnes[i].escape){//terror
      preu=preu+30;
      a[i]=3;
      console.log("+30€ = "+preu+" a["+i+"]="+a[i]);
    }
  }
}
function back() {//<--
    save();
    if (al == 0) {
        alert("No pots anar mes endarrere");
    } else {
      al--;
    }
    mostrar();
}
function next() {//-->
    save();
    if (al >= maxq - 1) {
        alert("No queden alumnes");
    } else {
      al++;
    }
    mostrar();
}
function save(){//guardar la posicio
    for(var i=0;i!=radio.opcions.length;i++){
        if(document.getElementById("r"+(i+1)).checked==true){
            if(1==a[al]){//misteri
              preu=preu-20;
              console.log("-20€ = "+preu);
            }else if(2==a[al]){//intriga
              preu=preu-25;
              console.log("-25€ = "+preu);
            }else if(3==a[al]){//terror
              preu=preu-30;
              console.log("-30€ = "+preu);
            }
            a[al]=i+1;
            if(1==(i+1)){//misteri
              preu=preu+20;
              console.log("+20€ = "+preu);
            }else if(2==(i+1)){//intriga
              preu=preu+25;
              console.log("+25€ = "+preu);
            }else if(3==(i+1)){//terror
              preu=preu+30;
              console.log("+30€ = "+preu);
            }
        }
    }
}