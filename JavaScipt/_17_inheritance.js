class car {
  constructor() {
    this.type = "Manuel Car";
  }

  brand() {
    console.log("Brand of car is BMW");
  }

  mileage() {
    console.log("Milegae is low for sports car");
  }
}

class m4 extends car {
  start() {
    console.log("Engine start");
  }

  stop() {
    console.log("Engine Stopped");
  }
}

let obj = new m4();

console.log(obj.brand());
console.log(obj.mileage());
console.log(obj.start());
console.log(obj.stop());
console.log(obj);
