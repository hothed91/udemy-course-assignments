/* isEven(number) 
   return true if even
*/
function isEven(num) {
  return (num%2 ===0);
}

/* factorial(num) 
   return the factorial of the number
*/
function factorial(num) {
  var result = 1;
  for(num; num > 0; num--) {
    result *= num;
  }
  return result;
}

/* kebabToSnake(str) 
   returns the snake case of the kebab string 
*/
function kebabToSnake(str) {
  return str.replace(/-/g, "_");
}

function printMsg(id, msg) {
  console.log(msg);
  addTextUsing(id, msg);
}

function addTextUsing(id, msg) {
  document.querySelector("#" + id).textContent = msg;
}

printMsg("isEven", isEven(4));
printMsg("isEven2", isEven(5));
printMsg("factorial", factorial(9));
printMsg("kebabToSnake", kebabToSnake("hello-world"));
printMsg("kebabToSnake2", kebabToSnake("blah"));
