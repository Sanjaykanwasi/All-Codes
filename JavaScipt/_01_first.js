// VARIABLES

console.log("Hello World");
console.log("Hello Sanjay");
let age = 22;
let firstName = "Sanjay";
let isFollow = true;
let x = undefined;

console.log(firstName);
console.log(age);
console.log(x);
console.log(isFollow);

let num = BigInt(123);
let sis = Symbol("Dollar");

console.log(num);
console.log(sis);

console.log(typeof sis);
console.log(typeof age);

// Object i  JS
const student = {
  firstName: "Daemon",
  age: 45,
  isPresent: true,
  cpga: 8.89,
};

console.log(student);

student.age++;

console.log(student["age"]);
/* OR */ console.log(student.firstName);

console.log(typeof student.isPresent);

alert("WELCOME");
