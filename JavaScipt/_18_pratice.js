class User {
  constructor(name, email) {
    this.name = name;
    this.email = email;
  }
  viewData() {
    console.log("School Name");
  }
}

let SanjayObj = new User("sanjay", "sanjay@gmail.com");
let MankuObj = new User("Manku", "mankurwt@gmail.com");

console.log(SanjayObj);
console.log(MankuObj);
console.log(SanjayObj.viewData());

class Admin extends User {
  constructor(name, email) {
    super(name, email);
  }
  editData() {
    console.log("Edit data");
  }
}

let dean = new Admin("dean", "dean@gmail.com");

console.log(dean);
console.log(dean.viewData());
