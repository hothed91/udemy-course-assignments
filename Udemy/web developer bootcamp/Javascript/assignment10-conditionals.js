var age = parseInt(prompt("What is your age?"));

var errorMsg = "Sorry there is an error with your age: " + age;
var twentyOneMsg = "Happy 21st birthday!!";
var oddMsg = "Your age is odd!";
var perfectSqMsg = "Perfect Square";

var results = document.querySelector("#results");

function printMsg(msg) {
  console.log(msg);
  appendChildToResults(msg);
}

function appendChildToResults(msg) {
  var msgNode = document.createElement("P");
  var msgText = document.createTextNode(msg);
  msgNode.appendChild(msgText);
  results.appendChild(msgNode);
}

if(age < 0) {
  printMsg(errorMsg);
}

if(age === 21) {
  printMsg(twentyOneMsg);
}

if(age%2 !== 0) {
  printMsg(oddMsg);
}

if(age % Math.sqrt(age) === 0) {
  printMsg(perfectSqMsg);
}
