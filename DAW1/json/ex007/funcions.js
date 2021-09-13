var contingutJSON = {
"quiz":[
    {
        "question": "Which one is correct team name in NBA?",
        "options": [
        "New York Bulls",
        "Los Angeles Kings",
        "Golden State Warriros",
        "Huston Rocket"
        ],
        "answer": "4"
    },
    {
        "question": "5 + 7 = ?",
        "options": [
        "10",
        "11",
        "12",
        "13"
        ],
        "answer": "3"
    },
    {
        "question": "1 + 1 = ?",
        "options": [
        "2",
        "51",
        "8",
        "9"
        ],
        "answer": "1"
    },
    {
        "question": "5 + 9 = ?",
        "options": [
        "10",
        "1",
        "14",
        "12"
        ],
        "answer": "3"
    },
    {
        "question": "6 + 2 = ?",
        "options": [
        "10",
        "4",
        "12",
        "8"
        ],
        "answer": "4"
    },
    {
        "question": "4 + 6 = ?",
        "options": [
        "10",
        "9",
        "4",
        "13"
        ],
        "answer": "1"
    },
    {
        "question": "4 + 8 = ?",
        "options": [
        "10",
        "11",
        "12",
        "13"
        ],
        "answer": "3"
    },
    {
        "question": "9 + 1 = ?",
        "options": [
        "10",
        "11",
        "12",
        "13"
        ],
        "answer": "1"
    },
    {
        "question": "9 + 4 = ?",
        "options": [
        "10",
        "11",
        "12",
        "13"
        ],
        "answer": "4"
    },
    {
        "question": "16 + 3 = ?",
        "options": [
        "1",
        "2",
        "19",
        "4"
        ],
        "answer": "3"
    }]};
var p=0;
var preg=0;
var maxq = contingutJSON.quiz.length;
var a = new Array(maxq);//respostes marcades
var r = new Array(maxq);//respostes t/f

mostrar();
document.getElementById("r1").checked = false;
function mostrar() {//mostrar
    document.getElementById("pregunta").innerHTML = contingutJSON.quiz[preg].question;
    for(var i=0;i!=contingutJSON.quiz[preg].options.length;i++){
        document.getElementById("en"+(i+1)).innerHTML = contingutJSON.quiz[preg].options[i];
        document.getElementById("r"+(i+1)).checked = false;
    }
    if (a[preg]==null){
    }else{
        document.getElementById("r"+a[preg]).checked = true;
    }
}
function resposta() {//acavar
    save();
    var res=0;
    var err=0;
    for(var i=0;i!=maxq;i++){
        if (r[i]==true){
            res++;
        }else{
            err++;
        }
    }
    alert("Has fet "+res+" preguntes correctes i has fet "+err+" errors")
    res=0;
    err=0;
}
function back() {//<--
    save();
    if (preg == 0) {
        alert("No pots anar mes endarrere");
    } else {
        preg--;
    }
    mostrar();
}
function next() {//-->
    save();
    if (preg >= maxq - 1) {
        alert("No queden preguntes");
    } else {
        preg++;
    }
    mostrar();
}
function save(){
    for(var i=0;i!=contingutJSON.quiz[preg].options.length;i++){
        if(document.getElementById("r"+(i+1)).checked==true){
                a[preg]=i+1;
            if(contingutJSON.quiz[preg].answer==(i+1)){
                r[preg]=true;
            }else{
                r[preg]=false;
            }
        // alert(contingutJSON.quiz[preg].answer+" = "+(i+1)+" "+r[preg]);
        }
    }
}