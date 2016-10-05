/* printReverse(arr), 
   print the array in reverse order
*/
function printReverse(arr) {
  var result = "";
  for(var index = arr.length-1; index >=0; index--) {
    result += arr[index] + " ";
  }
  return result;
}

/* isUniform(arr),
   return true if all elements in the array are identical
*/
function isUniform(arr) {
  for(var index = 1; index < arr.length; index++) {
    if(arr[0] !== arr[index]){
      return false;
    }
  }
  return true;
}

/* sumArray(arr), 
   returns the sum of all numbers in the array 
*/
function sumArray(arr) {
  return arr.reduce(findSum);
}

/* findSum(total, num), 
   returns the sum of two numbers
*/
function findSum(total, num) {
  return total + num;
}

/* max(arr), 
   returns the max number in the array
*/
function max(arr) {
  var max = arr[0];
  for(var index = 1; index < arr.length; index++) {
    if(arr[index] > max){
      max = arr[index];
    }
  }
  return max;
}

function printMsg(id, msg) {
  console.log(msg);
  addTextUsing(id, msg);
}

function addTextUsing(id, msg) {
  document.querySelector("#" + id).textContent = msg;
}

printMsg("printReverse", printReverse([1,2,3,4]));
printMsg("printReverse2", printReverse(["a","b","c"]));
printMsg("isUniform", isUniform([1,1,1,1]));
printMsg("isUniform2", isUniform([2,1,1,1]));
printMsg("sumArray", sumArray([1,2,3,4,5,6,7,8,9,10]));
printMsg("max", max([1,10,3,40,2,100,6,4,22]));
