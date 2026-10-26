var guestList = ["Angela", "Jack", "Pas", "James", "Lara", "Jason"];

var guestName = prompt("What is your name?");

guestList.includes(guestName)

if (guestList.includes(guestName)){
    alert("Welcome!");
} else {
    alert("Sorry, maybe next time.");
}