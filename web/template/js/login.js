$(document).ready(function(){
    
    
})
function showSigninPage() {
    $('.register').addClass('ra');    
}
function hideSigninPage() {
    $('.register').removeClass('ra');    
}
function login() {
    var username = $('#login-username').val();
    var password = $('#login-password').val();
    $.ajax({
        url: "/handlerLogin",
        type: "POST",
        data: {
            "username": username,
            "password": password       
        },
        success: function (response) {        
            alert("Login success");
            location.pathname = "/home";
            sessionStorage.setItem("userId", response);
        },
        error: function(reponse) {
            alert(reponse.responseText);
        }
        
    })
}
function signin() {
    var name = $('#signin-name').val();
    var username = $('#signin-username').val();
    var password = $('#signin-password').val();
    var address = $('#signin-address').val();
    var age = $('#signin-age').val();
    
    if(name == "" || username == "" || password == "" || address == "" || age == "" ) {
        alert("Infomation can not be empty!");
        return;
    }
    
    $.ajax({
        url: "/handlerSignin",
        type: "POST",
        data: {
            "name": name,
            "username": username,
            "password": password,
            "address": address,
            "age": age          
        },
        success: function(response) {
            alert("Signin success");
            location.pathname = "/home";
            sessionStorage.setItem("userId", response);          
        },
        error: function(reponse) {           
            alert(reponse.responseText);
        }
    })
    
    
}



