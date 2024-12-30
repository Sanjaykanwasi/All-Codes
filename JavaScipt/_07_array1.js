// ARRAY QUESTION

let items = [250, 645, 300, 900, 50];
let offer = 0;
let val = 0;

for (let i of items) {
  offer = i / 10;
  items[val] = i - offer;
  console.log(`Value after the offer is ${items[val]}`);
  val++;
}

// Methods in Arrays
let arr = [];

arr.push("DAemon");
arr.push("Rhenerya");

console.log(arr);

// Splice method

let numbers = [1, 2, 3, 4, 5, 6, 7];

numbers.splice(2, 2, 33, 44);

console.log(numbers);

numbers.splice(2, 2);
console.log(numbers);

// Question
console.log("                        NEW QUESTION                      ");

let companies = ["Bloomberg", "Microsoft", "Uber", "Google", "IBM", "Netflix"];
console.log(companies);

//companies.splice(0, 1);
companies.shift();
console.log(companies);

companies.splice(1, 1, "OLA");
console.log(companies);

//companies.splice(5, 0, "Amazon");
companies.push("Amazon");
console.log(companies);
