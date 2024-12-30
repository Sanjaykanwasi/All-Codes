const student = {
  fullName: "SanjayKanwasi",
  age: 22,
  college: "Chandigarh_University",
  printInfo: function () {
    console.log(this.fullName, this.age, this.college);
  },
};

const employee = {
  caltax() {
    console.log("Pay Tax");
  },
};

const sanjay = {
  salary: 30000,
  positon: "intern",
  //we can also create same method, and more priority will be given to it
};

//Prototype :
sanjay.__proto__ = employee;
