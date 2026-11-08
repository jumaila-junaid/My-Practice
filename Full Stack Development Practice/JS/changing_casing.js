//1 Create a var that stores the name that user enters via prompt.

var name = prompt("what is your name?");

//2 Capitalise the first letter of their name.

//a Isolate the first char
var  firstChar = name.slice(0,1);

//b Turn the first char to upper case
var upperCasefirstChar = firstChar.toUpperCase();

//c Isolate the rest of the name
var restOfName = name.slice(1,name.length);

//d Concactenate the first char with the rest of the char
restOfName = restOfName.toLowerCase();

//e Concactenate the first char with the rest of the char
var capitalisedName = upperCasefirstChar + restOfName;

//3 We use the capitalised version of their name to greet them using an alert.
alert("Hello, " + capitalisedName);

//Hello, Angela.

