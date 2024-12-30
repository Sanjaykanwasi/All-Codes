// EVENT HANDLING IN JS

let newbtn = document.querySelector(".newbutton");
newbtn.onclick = (e) => {
  alert("HACKED");
  console.log(e);
};

// EVENT LISTERNERS

let newbtn2 = document.querySelector(".newbtn2");

newbtn2.addEventListener("dblclick", () => {
  alert("BUTTON 2 was pressed");
});

newbtn2.addEventListener("dblclick", () => {
  console.log("HELLO 1");
});

const hello2 = () => {
  console.log("HELLO 2");
};

newbtn2.addEventListener("dblclick", hello2);

newbtn2.removeEventListener("dblclick", hello2);
