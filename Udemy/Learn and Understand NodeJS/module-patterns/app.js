var greet = require("./greet");
var greet2 = require("./greet2").greet;
var greet3 = require("./greet3");
var greet3b = require("./greet3");
var greet4 = require("./greet4");
var greet5 = require("./greet5").greet;

greet(); //pattern 1
greet2(); //pattern 2
//greet2.greet();
greet3.greet(); //pattern 3

greet3.greeting = 'Changed hello world';
greet3b.greet();
//Node caches the module by fileName

var grtr = new greet4(); //pattern 4, allows to create new greeter objects. 
grtr.greet();

greet5();

