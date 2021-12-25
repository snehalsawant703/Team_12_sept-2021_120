function add() {
    let prevstr = document.getElementById("div1").innerHTML;
    let new1 = "<h1>Hello, i am snehal</h1>";
    document.getElementById("div1").innerHTML = prevstr + new1;
    document.getElementById("div1").style.color = "red";
}