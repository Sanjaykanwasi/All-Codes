let marks = {
  Sanjay: 34,
  Nayan: 35,
  Manku: 36,
  Akhilesh: 37,
};

for (let i = 0; i < Object.keys(marks).length; i++) {
  console.log(Object.keys(marks)[i] + " " + marks[Object.keys(marks)[i]]);
}

console.log("");

for (let i in marks) {
  console.log(i + " " + marks[i]);
}

console.log("Funnction to Find Mean of 4 Numbers");

const mean = (a, b, c, d) => {
  return (a + b + c + d) / 4;
};

console.log(mean(1, 2, 3, 4));
