// console.log("Promises Topic");

// const getPromise = () => {
//   return new Promise((resolve, reject) => {
//     console.log("HELLO");
//     resolve("Hahahah");
//     //reject("Error");
//   });
// };

// let promise = getPromise();
// promise.then((res) => {
//   console.log("Promises Successfully Fullfilled", res);
// });

// promise.catch((err) => {
//   console.log("Some Error", err);
// });

// PROMISE CHAIN

const asynFun = () => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      console.log("Some Data of Students 1");
      resolve("True 1");
    }, 2000);
  });
};

const asynFun2 = () => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      console.log("Some Data of Students 2");
      resolve("True 2");
    }, 2000);
  });
};

// console.log("Getting data 1 ....");
// let p1 = asynFun();
// p1.then((res) => {
//   console.log(res);
//   console.log("Getting data 2 ....");
//   let p2 = asynFun2();
//   p2.then((res) => {
//     console.log(res);
//   });
// });

// OR No need to create p1 and p2, directly function ke sath bhi chalega
console.log("Getting data 1 ....");
asynFun().then((res) => {
  console.log(res);
  console.log("Getting data 2 ....");
  asynFun2().then((res) => {
    console.log(res);
  });
});
