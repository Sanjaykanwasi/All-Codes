// CLASSES IN JAVASCRIPT

class bmwCar {
  constructor(type, mileage) {
    console.log("For Initalizing Objects");
    this.mileage = mileage;
    this.type = type;
  }

  start() {
    console.log("Engine Started");
  }

  stop() {
    console.log("Engine Stopped");
  }

  price(input) {
    this.input = input;
  }
}

let m4 = new bmwCar("Manuel", 15);
let m3 = new bmwCar("Automatic", 18);

console.log(m4.start());
console.log(m3.stop());
console.log(typeof m3);
console.log(m3);
console.log(m4);
