   firebase.initializeApp({
      apiKey: "AIzaSyDq2yBXvbsbFnqYQfWRhe3ZBe882mOoutw",
      authDomain: "crud-fb9dc.firebaseapp.com",
      projectId: "crud-fb9dc",
      storageBucket: "crud-fb9dc.appspot.com",
      messagingSenderId: "115854437802",
      appId: "1:115854437802:web:7bcc189b87993b83c2cfd3"
   });
   var file;
   var email = "";
   var auth = firebase.auth();
   var db = firebase.firestore();
   var items = db.collection("items");  // Connexió a la col·lecció 'items'
   var storage = firebase.storage();
   function carregaElements() {
      items.get().then((querySnapshot) => {
         document.getElementById("listItems").innerHTML = `
         <thead class="thead-light">
            <tr>
               <th>Imatge</th>
               <th>Títol</th>
               <th>Descripcio</th>
               <th>Size</th>
               <th>Creador</th>
               <th>Data creacio</th>
               <th style="text-align:right; padding-right: 50px;">Operacions</th>
            </tr>
         </thead>`; 
         querySnapshot.forEach((doc) => {
            let image = "";
            if (doc.data().image != null) {
               image = `<img src="${doc.data().image}" ` 
               + `class="rounded" style="max-width: 100px;`
               + `max-height: 100px;"`
               + ` "alt="${doc.data().title}">`;
            }
            document.getElementById("listItems").innerHTML +=    `
            <tr>
               <td>${image}</td>
               <td>${doc.data().title}</td>
               <td>${doc.data().content}</td>
               <th>${doc.data().size}</th>
               <th>${doc.data().email}</th>
               <th>${doc.data().created_at}</th>
               <td>
                  <button type="button" class="btn btn-danger float-right" ` 
                  + `onclick="esborraElement('${doc.id}', '${doc.data().image}')">
                     Eliminar
                  </button>
                  <button type="button" class="btn btn-primary mr-2 float-right" ` 
                  + `onclick="modificaItem('${doc.id}')">
                     Editar
                  </button>
               </td>
            </tr>`;
         });
      });
   }

   function modificaItem(id) {
      document.getElementById("elementId").value = id;
      document.getElementById("image").disabled  = true;
      db.collection("items").doc(id).get()
      .then(function(doc) {
         document.getElementById("title").value = doc.data().title;
         document.getElementById("content").value = doc.data().content;
      }).catch(function() {
         mostraMissatge(0, 1);
      });
   }

   function esborraElement(id, url) {
      storage.refFromURL(url).delete()
      .then(function() {
         items.doc(id).delete()
         .then(function() {
            carregaElements();
            mostraMissatge(1, 0);
         }).catch(function() {
            mostraMissatge(2, 1);
         });
      }).catch(function() {
            mostraMissatge(3, 1);
         });         
   }

   function afegeixElement(doc) {
      items.add(doc)
      .then(function() {
         carregaElements();
         document.getElementById("title").value = "";
         document.getElementById("content").value = "";
         document.getElementById("image").value = "";
         mostraMissatge(4, 0);
      })
      .catch(function() {
         mostraMissatge(5, 1);
      });
   }

   function modificaElement(id, doc) {
      db.collection("items").doc(id).update(doc)
      .then(function() {
         carregaElements();
         document.getElementById("elementId").value = "";
         document.getElementById("title").value = "";
         document.getElementById("content").value = "";
         document.getElementById("image").disabled = false;
         mostraMissatge(6, 0);
      })
      .catch(function() {
         mostraMissatge(7, 1);
      });
   }

   function mostraMissatge(mesage, type) {
      var messages = new Array("Error en intentar editar l'element", "Element eliminat correctament","Error en intentar eliminar l'element","Error en intentar eliminar la imatge","Element guardat correctament",
      "Error en intentar guardar l'element","Element actualitzat correctament","Error en intentar actualitzar l'element","Error d’autenticació","Error en intentar crear l'usuari","Les contrasenyes no coincideixen",
      "La contrasenya és obligatòria","Email incorrecte","Usuari autenticat","Usuari creat correctament");
      var types = new Array("alert-success","alert-danger");
      document.getElementById("alert").innerText = messages[mesage];
      document.getElementById("alert").className = "alert "+types[type];
      document.getElementById("alert").style.display = "block";
      window.setTimeout(function() {
         document.getElementById("alert").style.display = "none";
      }, 2000);
   }

   window.addEventListener("load", function() {
      carregaElements();
   });

   document.getElementById("login").addEventListener("click", function() {
      email = document.getElementById("loginEmail").value;
      let password = document.getElementById("loginPassword").value;

      auth.signInWithEmailAndPassword(email, password)
      .then(function() {         
         mostraMissatge(13, 0);
         document.getElementById("loginForm").style.display = "none";
         document.getElementById("itemsForm").style.display = "block";
         document.getElementById("listItems").style.display = "table";
      })
      .catch(function(error) {
         mostraMissatge(8, 1);
      });
   });

   document.getElementById("crearUsuari").addEventListener("click", function() {
      document.getElementById("loginForm").style.display = "none";
      document.getElementById("signupForm").style.display = "block";
   });

   document.getElementById("signup").addEventListener("click", function() {
      email = document.getElementById("signupEmail").value;
      let password = document.getElementById("signupPassword").value;
      let passwordConfirm = document.getElementById("signupPasswordConfirm").value;

      if (email.length > 0 && email.indexOf("@") > 1) {
         // email.length > 0
         //    => el camp email té una mida (length) més gran que 0, és a dir no està buit
         // email.indexOf("@") > 1
         //    => el camp email conté una arroba. És a dir que él mètode indexOf torna un valor superior a 1
         if (password.length > 0) {
            // password.length > 0
            //    => el camp password té una mida (length) més gran que 0, és a dir no està buit
            if (password == passwordConfirm) {
               // el camp password és igual que el camp passwordConfirm
               auth.createUserWithEmailAndPassword(email, password)
               //  https://firebase.google.com/docs/auth/web/password-auth#create_a_password-based_account
               .then(function() {
                // La cració de l'usuari ha estat correcta
                  mostraMissatge(14, 0);
                  document.getElementById("loginForm").style.display = "block";
                  document.getElementById("signupForm").style.display = "none";
               })
               .catch(function(error) {
                  // La cració de l'usuari NO ha estat correcta
                  mostraMissatge(9, 1);
               });
            } else { // el camp password NO és igual que el camp passwordConfirm
               mostraMissatge(10, 1);
            }
         } else { // NO => password.length > 0 => No hi ha dades al camp password
            mostraMissatge(11, 1);
         }
      } else {  // sino (email.length > 0 && email.indexOf("@") > 1) no hi ha correu ni una arroba
         mostraMissatge(12, 1);
      }
   });

   document.getElementById("save").addEventListener("click", function() {
      let id = document.getElementById("elementId").value;
      let title = document.getElementById("title").value;
      let content = document.getElementById("content").value;
      let fileToUpload = document.getElementById("image").files[0];
      file = fileToUpload
      if (id == "") {
         let reader = new FileReader();
         if (image) {            
            reader.readAsDataURL(fileToUpload);
            reader.onloadend = function () {            
               let randomId = Math.random().toString(36).substr(2);
               var imgStyleProp = getComputedStyle(image);
               var s =imgStyleProp.width+" x "+imgStyleProp.height;
               console.log(s);
               storage.ref().child('images').child('items').child(randomId).putString(reader.result, "data_url")
               // Al storage de FireBase, cal una carpeta items dins d'una carpeta images 
               .then(function(snapshot) {
                  let now = new Date();
                  let dataAGuardar = now.getDate()+"/"+now.getMonth()+"/"+now.getFullYear();
                  let doc = {
                     content: content,
                     image: snapshot.downloadURL,
                     title: title,
                     created_at: dataAGuardar,
                     size: s,
                     email: email
                  };
                  afegeixElement(doc);
               });
            }
         }
      } else {
         let doc = {
            content: content,
            title: title
         };
         modificaElement(id, doc);
      }
   });