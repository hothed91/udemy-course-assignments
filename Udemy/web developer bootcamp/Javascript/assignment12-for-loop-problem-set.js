var results = document.querySelector("#results");

function printMsg(msg) {
  console.log(msg);
  appendChildToResults(msg);
}

function appendChildToResults(msg) {
  var msgNode = document.createElement("li");
  var msgText = document.createTextNode(msg);
  msgNode.appendChild(msgText);
  results.appendChild(msgNode);
}

/*Print all numbers between -10 and 19*/
function firstProblem() {
  var solution = "";
  for(var num = -10; num >= -10 && num <= 19; num++) {
    solution += num + " ";
  }
  printMsg(solution);
}

/*Print all even numbers between 10 and 40*/
function secondProblem() {
  var solution = "";
  for(var num = 10; num >= 10 && num <= 40; num++) {
    if(num%2 === 0) {
      solution += num + " ";
    }
  }
  printMsg(solution);
}

/*Print all odd numbers between 300 and 333*/
function thirdProblem() {
  var solution = "";
  for(var num = 300; num >= 300 && num <= 333; num++) {
    if(num%2 !== 0) {
      solution += num + " ";
    }
  }
  printMsg(solution);
}

/*Print all numbers divisible by 5 AND 3 between 5 and 50*/
function fourthProblem() {
  var solution = "";
  for(var num = 5; num >= 5 && num <= 50; num++) {
    if(num%5 === 0 && num%3 ===0) {
      solution += num + " ";
    }
  }
  printMsg(solution);
}

firstProblem();
secondProblem();
thirdProblem();
fourthProblem();
