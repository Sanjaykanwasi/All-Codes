function hello() {
  console.log("Hello World!");
}

setTimeout(hello, 5000);

// _____________________________

setTimeout(() => {
  console.log("New");
}, 3000);

// ---------------Callback Hell(Nested)-----------------

function getData(dataID, getNextData) {
  setTimeout(() => {
    console.log("Daemon", dataID);
    if (getNextData) {
      getNextData();
    }
  }, 2000);
}

getData(1, () => {
  getData(2, () => {
    getData(3, () => {
      getData(4);
    });
  });
});

// ---------Promises----------
let promise = new Promise((resolve, reject) => {
  console.log("Rahenyra");
  resolve("Success");
});

console.log(promise);

//NEW Function

function getData2(id) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      console.log("Aemond & Vagher", id);
      resolve("fullfilled");
    }, 7000);
  });
}

//console.log(getData2(7));

// With the help of promise Channing
// console.log("Getting data 1....");
// getData2(1).then((res) => {
//   console.log("Aemond & Vagher 1", res);
//   console.log("Getting data 2....");
//   getData2(2).then((res) => {
//     console.log("Aemond & Vagher 2", res);
//   });
// });

// Or another method for promise channing
console.log("getting data 5: ");
getData2(5)
  .then((res) => {
    console.log(res);
    console.log("getting data 6: ");
    return getData2(6);
  })
  .then((res) => {
    console.log(res);
    console.log("Getting data 7: ");
    return getData2(7);
  })
  .then((res) => {
    console.log(res);
  });
