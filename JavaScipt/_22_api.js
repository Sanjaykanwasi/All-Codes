const URL = "https://cat-fact.herokuapp.com/facts";
const factData = document.querySelector("#facts");
const bttn = document.querySelector("#btn");

const getfacts = async () => {
  console.log("Getting Response....");
  let response = await fetch(URL);
  console.log(response);
  let data = await response.json();
  factData.innerHTML = data[2].text;
};

bttn.addEventListener("click", getfacts);
