// EVENT QUESTION

let btn = document.querySelector(".btn1");

let mode = "light";

btn.addEventListener("click", () => {
  if (mode === "light") {
    mode = "dark";
    alert("ENTERING DARK MODE");
    document.querySelector("body").style.backgroundColor = "black";
  } else {
    mode = "light";
    alert("ENTERING WHITE MODE");
    document.querySelector("body").style.backgroundColor = "white";
  }
});

// WITH THE HELP OF CLASS
let btn2 = document.querySelector(".btn2");
let body = document.querySelector("body");
let currmode = "light";

btn2.addEventListener("click", () => {
  if (currmode === "light") {
    currmode = "dark";
    alert("Changing theme to dark");
    body.classList.add("dark");
    body.classList.remove("light");
  } else {
    currmode = "light";
    alert("Chaning theme to Light");
    body.classList.add("light");
    body.classList.remove("dark");
  }
});
