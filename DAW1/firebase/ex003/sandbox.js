var firebaseConfig = {
    apiKey: "AIzaSyB-XVwnalZ1m1W-xSQeBZ5BytvEkuSf3qI",
    authDomain: "auth-55593.firebaseapp.com",
    projectId: "auth-55593",
    storageBucket: "auth-55593.appspot.com",
    messagingSenderId: "704493880979",
    appId: "1:704493880979:web:b493970254dab99b286f66"
  };
  firebase.initializeApp(firebaseConfig);
function registrar() {
    var email = document.getElementById('email').value;
    var contrasena = document.getElementById('contrasena').value;

    firebase.auth().createUserWithEmailAndPassword(email, contrasena)
        .then((user) => {
            console.log('Usuario registrado!');
        })
        .catch((error) => {
            console.log('error de registro');
        });
}
function ingresar() {
    var email = document.getElementById('email2').value;
    var contrasena = document.getElementById('contrasena2').value;

    firebase.auth().signInWithEmailAndPassword(email, contrasena)
        .then((user) => {
            console.log('sesión iniciada');
        })
        .catch((error) => {
            console.log('error de inicio de sesion');
        });
}