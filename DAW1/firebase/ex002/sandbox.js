const firebaseConfig = {
    apiKey: "AIzaSyDzFwqcmRHGSOuj1X7VDnuZ4-ACvpkAcGE",
    authDomain: "prova-9ab81.firebaseapp.com",
    databaseURL: "https://prova-9ab81-default-rtdb.europe-west1.firebasedatabase.app",
    projectId: "prova-9ab81",
    storageBucket: "prova-9ab81.appspot.com",
    messagingSenderId: "1002097449831",
    appId: "1:1002097449831:web:547696516edf76da6aedc2"
};    
//Initialize Firebase
firebase.initializeApp(firebaseConfig);
const db = firebase.firestore();
const list = document.querySelector('ul');
const addRecipe = (recipe, id) => {
    let dg=recipe.created_at.toDate();
    let day=dg.getDate()+"/"+dg.getMonth()+"/"+dg.getFullYear();
    let html = `
        <li data-id="${id}">nom: <b>${recipe.camp1}</b>, color: <b>${recipe.camp2}</b>, quantitat: <b>${recipe.camp3}</b> (${day})
        <button class="btn btn-danger btn-sm my-2">delete</button></li>
    `;
    // console.log(html);
    list.innerHTML += html;
};
// delete documents
list.addEventListener('click', e => {
    // console.log(e);
    if(e.target.tagName === 'BUTTON') {
        const id = e.target.parentElement.getAttribute('data-id');
         //console.log(id);
        db.collection('recipes').doc(id).delete()
            //.then(() => console.log('recipe deleted!'))
            .catch((err) => console.log(err));
    }
});
// get documents
// db.collection('recipes').get()
//     .then(snapshot => {
//         // console.log(snapshot.docs[0].data());
//         snapshot.forEach(doc => {
//             // console.log(doc.data());
//             // console.log(doc.id);
//             addRecipe(doc.data(),doc.id);
//         });
//     })
//     .catch(err => console.log(err));
// add documents
const form = document.querySelector('form');
form.addEventListener('submit', e => {
    e.preventDefault();
    let now = new Date();
    const recipe = {
        camp1: form.camp1.value,
        camp2: form.camp2.value,
        camp3: form.camp3.value,
        created_at: firebase.firestore.Timestamp.fromDate(now)
    };
    form.camp1.value="";
    form.camp2.value="";
    form.camp3.value="";
    db.collection('recipes').add(recipe)
    //.then(() => console.log('recipe added!'))
    .catch(err => console.log(err))
});
const deleteRecipe = id => {
    const recipes = document.querySelectorAll('li');
    recipes.forEach(recipe => {
        if(recipe.getAttribute('data-id') === id) {
            recipe.remove();
        }
    });
};
//real time listener
const unsubscribe = db.collection('recipes').onSnapshot(snapshot => {
    // console.log(snapshot.docChanges());
    snapshot.docChanges().forEach(change => {
        // console.log(change);
        const doc = change.doc;
        // console.log(doc);
        if (change.type === 'added') {
            addRecipe(doc.data(), doc.id);
        } else if (change.type === 'removed') {
            deleteRecipe(doc.id);
        }
    });
});
// const unsubscribeBtn = document.querySelector('.unsubscribe');
// unsubscribe from database changes
// unsubscribeBtn.addEventListener('click', () => {
//     unsubscribe();
//     console.log('you unsubscribed from all changes');
// });