// Your web app's Firebase configuration
var firebaseConfig = {
    apiKey: "AIzaSyB-XVwnalZ1m1W-xSQeBZ5BytvEkuSf3qI",
    authDomain: "auth-55593.firebaseapp.com",
    projectId: "auth-55593",
    storageBucket: "auth-55593.appspot.com",
    messagingSenderId: "704493880979",
    appId: "1:704493880979:web:b493970254dab99b286f66"
};
// Initialize Firebase
firebase.initializeApp(firebaseConfig);
const auth = firebase.auth();
const fs = firebase.firestore();
const loggedOutLinks = document.querySelectorAll(".logged-out");
const loggedInLinks = document.querySelectorAll(".logged-in");
var email = "";
const loginCheck = (user) => {
  if (user) {
    loggedInLinks.forEach((link) => (link.style.display = "block"));
    loggedOutLinks.forEach((link) => (link.style.display = "none"));
  } else {
    loggedInLinks.forEach((link) => (link.style.display = "none"));
    loggedOutLinks.forEach((link) => (link.style.display = "block"));
  }
};

// SignUp
const signUpForm = document.querySelector("#signup-form");
signUpForm.addEventListener("submit", (e) => {
  e.preventDefault();
  email = signUpForm["signup-email"].value;
  const password = signUpForm["signup-password"].value;

  // Authenticate the User
  auth
    .createUserWithEmailAndPassword(email, password)
    .then((userCredential) => {
      // clear the form
      signUpForm.reset();
      // close the modal
      $("#signupModal").modal("hide");
    });
});
//add 
const addform = document.querySelector('#add-form');
addform.addEventListener('submit', e => {
    e.preventDefault();
    let now = new Date();
    const post = {
        title: addform["add-title"].value,
        content: addform["add-content"].value,
        email: email,
        time: firebase.firestore.Timestamp.fromDate(now)
    };
    fs.collection('posts').add(post)
    console.log("post added")
    addform.reset();
    $("#addModal").modal("hide");
});
// Logout
const logout = document.querySelector("#logout");
logout.addEventListener("click", (e) => {
  e.preventDefault();
  auth.signOut().then(() => {
    console.log("signup out");
  });
});

// SingIn
const signInForm = document.querySelector("#login-form");
signInForm.addEventListener("submit", (e) => {
  e.preventDefault();
  email = signInForm["login-email"].value;
  const password = signInForm["login-password"].value;

  // Authenticate the User
  auth.signInWithEmailAndPassword(email, password).then((userCredential) => {
    // clear the form
    signInForm.reset();
    // close the modal
    $("#signinModal").modal("hide");
  });
});

// Posts
const postList = document.querySelector(".posts");
const setupPosts = (data, id) => {
  if (data.length) {
    let html = "";
    data.forEach((doc) => {
    const post = doc.data();
    if (post.email==email){
        let dg=post.time.toDate();
        let day=dg.getDate()+"/"+dg.getMonth()+"/"+dg.getFullYear();
        const li = `
        <li data-id="${id}" class="list-group-item list-group-item-action container">
            <div class="row">
                <div class="font-weight-bold col-3">${post.title}</div>
                <div class="col-6">${post.email}</div>
                <div class="text-right col-1">(${day})</div>
            </div>
            <div class="row">
                <p class="ml-3">${post.content}</p>
            </div>
            <div class="row">
                <button class="btn btn-danger btn-sm my-2 ml-3">delete</button>
            </div>
        </li>
        `;
        html += li;     
    }
    });
    postList.innerHTML = html;
  } else {
    postList.innerHTML = '<h4 class="text-white">Login to See Posts</h4>';
  }
};

// events
// list for auth state changes
auth.onAuthStateChanged((user) => {
  if (user) {
    console.log("signin");
    fs.collection("posts")
      .get()
      .then((snapshot) => {
        setupPosts(snapshot.docs);
        loginCheck(user);
      });
  } else {
    console.log("signout");
    setupPosts([]);
    loginCheck(user);
  }
});
//delete
const deletePost = id => {
    const posts = document.querySelectorAll('li');
    posts.forEach(post => {
        if(post.getAttribute('data-id') === id) {
            post.remove();
        }
    });
};
//real time listener
fs.collection('posts').onSnapshot(snapshot => {
snapshot.docChanges().forEach(change => {
    // console.log(change);
    const doc = change.doc;
    // console.log(doc);
    if (change.type === 'added') {
        setupPosts(doc.data(), doc.id);
    } else if (change.type === 'removed') {
        deletePost(doc.id);
    }
})
});