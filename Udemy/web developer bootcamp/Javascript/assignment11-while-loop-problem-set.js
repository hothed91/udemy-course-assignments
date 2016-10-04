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
  var num = -10;
  while(num >= -10 && num <= 19) {
    solution += num + " ";
    num++;
  }
  printMsg(solution);
}

/*Print all even numbers between 10 and 40*/
function secondProblem() {
  var solution = "";
  var num = 10;
  while(num >= 10 && num <= 40) {
    if(num%2 === 0) {
      solution += num + " ";
    }
    num++;
  }
  printMsg(solution);
}

/*Print all odd numbers between 300 and 333*/
function thirdProblem() {
  var solution = "";
  var num = 300;
  while(num >= 300 && num <= 333) {
    if(num%2 !== 0) {
      solution += num + " ";
    }
    num++;
  }
  printMsg(solution);
}

/*Print all numbers divisible by 5 AND 3 between 5 and 50*/
function fourthProblem() {
  var solution = "";
  var num = 5;
  while(num >= 5 && num <= 50) {
    if(num%5 === 0 && num%3 ===0) {
      solution += num + " ";
    }
    num++;
  }
  printMsg(solution);
}

firstProblem();
secondProblem();
thirdProblem();
fourthProblem();
