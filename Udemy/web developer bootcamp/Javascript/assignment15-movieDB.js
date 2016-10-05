/* Movie = { title, rating, hasWatched } */
var frozen = {title: "Frozen", rating: 5, hasWatched: true};
var suicideSquad = {title: "Suicide Squad", rating: 3, hasWatched: false};
var starWars = {title: "Star Wars: Return of the Jedi", rating: 5, hasWatched: true};

var movieDB = [frozen, suicideSquad, starWars];

var watchedStr = "You have watched ";
var notWatchedStr = "You have not seen ";

var results = document.querySelector("#results");

function printMsg(msg) {
  console.log(msg);
  appendChildToResults(msg);
}

function appendChildToResults(msg) {
  var msgNode = document.createElement("p");
  var msgText = document.createTextNode(msg);
  msgNode.appendChild(msgText);
  results.appendChild(msgNode);
}

function solution() {
  movieDB.forEach(function(movie){
      var lastHalf = movie.title + " - " + movie.rating + " stars";
      if(movie.hasWatched){
        printMsg(watchedStr + lastHalf);
      } else {
        printMsg(notWatchedStr + lastHalf);
      }
    }
  );
}

solution();
