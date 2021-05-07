const firebaseConfig = {
    apiKey: "AIzaSyDzFwqcmRHGSOuj1X7VDnuZ4-ACvpkAcGE",
    authDomain: "prova-9ab81.firebaseapp.com",
    databaseURL: "https://prova-9ab81-default-rtdb.europe-west1.firebasedatabase.app",
    projectId: "prova-9ab81",
    storageBucket: "prova-9ab81.appspot.com",
    messagingSenderId: "1002097449831",
    appId: "1:1002097449831:web:547696516edf76da6aedc2"
};    
// Initialize Firebase
firebase.initializeApp(firebaseConfig);
const db = firebase.firestore();
//---------
const list = document.querySelector('ul');
const addRecipe = recipe => {
    let html = `
        <li><div>${recipe.title}</div></li>
        <li><div>${recipe.created_at.toDate()}</div></li>
        <li><div>${recipe.autor}</div></li>
    `;
    console.log(html);
    list.innerHTML += html;
};
db.collection('recipes').get()
    .then(snapshot => {
        // console.log(snapshot.docs[0].data());
        snapshot.forEach(doc => {
            // console.log(doc.data());
            addRecipe(doc.data());
        });
    })
    .catch(err => console.log(err));
function seguent(){
    a++;
}