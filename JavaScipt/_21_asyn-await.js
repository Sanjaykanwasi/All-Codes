//function
function api(id) {
  return new Promise((resolve, reject) => {
    setTimeout((res) => {
      console.log("Weather Report of Roorkee, Uttarakhand", id);
      resolve(200);
    }, 2000);
  });
}

//Function
async function getWeatherReport() {
  console.log("Getting data 1.........");
  await api(1);
  console.log("Getting data 2.........");
  await api(2);
  console.log("Getting data 3.........");
  await api(3);
}

//getWeatherReport();

// IIFE FUNCTION

(async function () {
  console.log("Getting data 1.........");
  await api(1);
  console.log("Getting data 2.........");
  await api(2);
  console.log("Getting data 3.........");
  await api(3);
})();

// Function
async function greet() {
  console.log("Konnichiwa");
}

//console.log(greet());
