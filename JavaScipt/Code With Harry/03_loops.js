for (let a = 1; a <= 10; a++) {
  console.log(a);
}

let student = {
  Sanjay: 22,
  Nayan: 23,
  Manku: 24,
  Akhilesh: 25,
  Shiva: 26,
  Somu: 27,
};

// FOR In Loop
for (let a in student) {
  console.log(a + " cle" + student[a]);
}

// For of Loop
for (let b of "SANJAY") {
  console.log(b);
}
