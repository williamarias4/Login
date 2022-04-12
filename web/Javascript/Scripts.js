function login() {
    let email = document.getElementById("email").value;
    let password = document.getElementById("pass").value;
}

function fetchAPI(url, method, body) {
    fetch(url, {
        method: method,
        body: body,
        headers: { "Content-type": "application/json; charset=UTF-8" }
    })
        .then(response => response.json())
        .then(json => console.log(json));
}