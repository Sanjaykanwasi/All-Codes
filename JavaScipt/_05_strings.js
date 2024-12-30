// STRINGS

let str = "                     SanjaySinghKanwasi             ";

console.log(str);
console.log(str.length);

console.log(str[5]);

const obj = {
  type: "pen",
  cost: 20,
  ink: "ball",
};

//Normal way to print
console.log("The Cost of", obj.ink, obj.type, "is", obj.cost, "rupees");

// Template literals or string interpolation.
let output = `The Cost of ${obj.ink} ${obj.type} is ${obj.cost} rupees`;
console.log(output);
console.log(`The Cost of ${obj.ink} ${obj.type} is ${obj.cost} rupees`);

// ESCAPE CHARACTERS
// \n is used for new line
// \t is for tab space

console.log(`Sanjay\tSingh\tKanwasi`);

// String Methods
let newStr = "ApnaCollege";

console.log(newStr.toUpperCase());

console.log(newStr.toLowerCase());

console.log(str.trim());

console.log(newStr.replace("A", "P"));

console.log(newStr.concat(str));

console.log(newStr.slice(1, 5));

console.log(newStr.charAt(7));
