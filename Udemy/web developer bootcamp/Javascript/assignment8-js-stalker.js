var firstName = prompt("What is your first name?");
var lastName = prompt("What is your last name?");
var age = prompt("How old are you?");

var nameSentence = "Your full name is " + firstName + " " + lastName;
var ageSentence = "You are " + age + " years old"

console.log(nameSentence);
console.log(ageSentence);

document.querySelector("#fullName").textContent = nameSentence;
document.querySelector("#age").textContent = ageSentence;
