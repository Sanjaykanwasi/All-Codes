// Operators

let a = 25;
let b = 54;

let c = a + b;

console.log("a + b =", c);

// Power
console.log(2 ** 5);

console.log(a < b && c > b);

// Conditional Statements
let age = 22;

if (age >= 18) {
  console.log("You are Eligible to Vote");
} else {
  console.log("You are Not");
}

// Take inputs

let fullName = prompt("Enter your Name: ");
let age2 = prompt("Enter your Age: ");

console.log(fullName, age);

// Question
let marks = prompt("Enter the marks");

if (marks > 80 && marks < 100) {
  console.log("Your Grade is A");
} else if (marks > 70 && marks < 90) {
  console.log("Your Grade is B");
} else if (marks > 60 && marks < 70) {
  console.log("Your Grade is C");
} else if (marks > 50 && marks < 60) {
  console.log("Your Grade is D");
} else {
  console.log("Your Grade is F");
}
