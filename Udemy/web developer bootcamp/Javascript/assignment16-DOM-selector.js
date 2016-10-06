/* 4 or more ways to select the 'first' p tag*/
document.getElementById("first");
document.querySelector("#first");
document.getElementsByClassName("special")[0];
document.getElementsByTagName("p")[0];
document.querySelectorAll(".special")[0];
document.querySelectorAll("p")[0];
document.querySelector("h1 + p");
