/* Select all divs and give them a purple background */
$("div").css("background-color", "purple");

/* Select the divs with class "highlight" and make them 200px wide */
$("div.highlight").css('width', '200px');

/* Select the divs with id "third" and give it a orange border */
$("#third").css('border', '5px solid orange');

/* Bonus: Select the first div only and change its font color to pink */
$("div:nth-of-type(1)").css('color', 'pink');
