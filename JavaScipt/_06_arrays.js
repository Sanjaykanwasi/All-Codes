// ARRAYS

let names = ["Sanjay", "Ram", "Sita", "Laxman", "Nayan"];
let marks = [95, 92, 80, 75, 50];

console.log(names);
console.log(marks);

let students = ["Sanjay", 95, "Ram", 92, "Sita", 80, "Laxman", 75, "Nayan", 50];
console.log(students);
console.log("Lenght:", students.length);

// PRint using loops
console.log("Printing using FOR OF LOOP: ");
for (let i of students) {
  console.log(i);
}

// Average Marks
console.log("Average Marks");
let sum = 0;
let avg = 0;
for (let i of marks) {
  sum += i;
}
avg = sum / marks.length;
console.log(avg);
