function post() {
    let prev = document.getElementById("id1").innerHTML;
    let newww = "<h1>hello people</h1>";
    document.getElementById("id1").innerHTML = prev + newww;
}

function deleted() {
    document.getElementById("id1").innerHTML = "Account deleted successfully"
    window.alert("Want to delete account permently?");
    alert("confirm ?");
}

function image1() {
    document.getElementById("myimage").src = 'PICCCC.jpg';
}

function del() {
    document.getElementById("id1").innerHTML = "Account deleted successfully";
}

function back() {
    document.getElementById("myimage").style.display = "none";
    console.log('snehal');
}

function add() {
    console.log(40 + 25);
}
add();
