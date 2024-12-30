// 1
let heading = document.querySelector("h2");
heading.innerText = heading.innerText + " from Apna College";

// 2
let boxes = document.querySelectorAll(".box");
console.log(boxes);

for (div of boxes) {
  div.innerText = "Love";
}

// boxes[0].innerText = "Sanjay";
// boxes[1].innerText = boxes[1].innerText + " Daemon";

//DOM Manuplitation
let btn = document.createElement("button");
btn.innerText = "SUBMIT";
console.log(btn);

let divs = document.querySelector("div");
//divs.append(btn);
//divs.prepend(btn);
// divs.before(btn);
divs.after(btn);

// Append new heading
let newheading = document.createElement("h1");
newheading.innerHTML = "<i>WELCOME</i>";
document.querySelector("body").prepend(newheading);

// Delete a tag
let divs2 = document.querySelectorAll("div");
divs2[2].remove();

// CLASS LIST to access all classes
