//FOR Loop

for (let i = 0; i < 5; i++) {
  console.log(i);
}

console.log("WHILE LOOP");

// While Loop
let i = 1;
while (i <= 5) {
  console.log(i);
  i++;
}

// DO While Loop
console.log("DO WHILE LOOP");
let j = 1;
do {
  console.log(j);
  j++;
} while (j <= 5);

// For of loops  iteration is easy on strings & arrays.
console.log("FOR-OF LOOP");

let str = "ApnaCollege";

for (let x of str) {
  console.log(x);
}

// FOR IN LOOP used for objects & arrays.
console.log("FOR-IN LOOP");

const student = {
  name: "Daemon",
  age: 34,
  gpa: 9.8,
  isPass: true,
};

for (let key in student) {
  console.log("Key: ", key, "Value: ", student[key]);
}
