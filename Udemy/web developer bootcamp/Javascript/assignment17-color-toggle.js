//SOLUTION #1
/* Toggle the body's background color between purple
   and white, when a button is clicked
*/
/*var isWhite = true;
document.querySelector("button").addEventListener("click", toggleColor);

function toggleColor() {
  if(isWhite) {
    isWhite = false;
    document.body.style.backgroundColor = "purple";
  } else {
    isWhite = true;
    document.body.style.backgroundColor = "white";
  }
}*/

//SOLUTION #2
document.querySelector("button").addEventListener("click", function(){
  document.body.classList.toggle("purple");
});
