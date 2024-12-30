// FUNCTION & METHODS

function addnumber() {
  let a = 10;
  let b = 20;
  console.log(`Sum is: ${a + b}`);
}

addnumber();

function multiply(a, b) {
  return a * b;
}

console.log(multiply(10, 20));

// ARROW FUNCTION
const arrdiff = (A, B) => {
  console.log(A - B);
  return A - B;
};

console.log(arrdiff(20, 5));

//Vowel counter
console.log("VOWELS COUNTER");

function countVowels(str, count) {
  for (let i of str) {
    if (i === "a" || i === "e" || i === "i" || i === "o" || i === "u") {
      count++;
    }
  }
  return count;
}

console.log(countVowels("sanjaysinghkanwasi", 0));

// FOR EACH LOOP

let arr7 = ["Sam", "Ram", "Pookie", "Jin", "Tara"];

arr7.forEach(function printval(val, idx) {
  console.log(val, idx);
});

// QUESTION
console.log("SQUARE ROOT USING FOR EACH LOOP");

let array = [1, 2, 3, 4, 5];

array.forEach(function printsqrt(val) {
  console.log(val * val);
});

// MAP Method

let newArray = array.map((val) => {
  return val + 2;
});

console.log(newArray);

// Filter Method

let evenArray = array.filter((val) => {
  return val % 2 == 0;
});

console.log(evenArray);

// REduce method

const larArray = array.reduce((prev, curr) => {
  return prev > curr ? prev : curr;
});

console.log(larArray);
