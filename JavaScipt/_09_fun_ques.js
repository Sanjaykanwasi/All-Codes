// QUESTIONS

let num = prompt("Enter a number: ");

let arr = [];

for (let i = 1; i <= num; i++) {
  arr[i - 1] = i;
}

console.log(arr);

// SUM OF ARRAY USING REDUCE METHOD

let sumOfArray = arr.reduce((prev, curr) => {
  return prev + curr;
});

console.log(sumOfArray);

let multiplyOfArr = arr.reduce((prev, curr) => {
  return prev * curr;
});

console.log(multiplyOfArr);
