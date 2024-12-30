// Guess Game

alert("Welcome to Guess Game");
while (true) {
  let num = prompt("Enter any number between 1 to 10: ");
  if (num == 7) {
    break;
  } else {
    alert("Try Again");
  }
}

alert("Congralutation You Won");
