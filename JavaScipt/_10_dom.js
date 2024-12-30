// DOCUMENT OBJECT MODEL

console.log(window.document);

console.dir(window.document);

console.log(window.document.body);

document.body.style.background = "white";

let header = document.getElementsByClassName("header");

console.log(header);

console.log(document.getElementsByClassName("head1"));

// OR USING QuerySelector

console.log("USING QUERY SELECTOR");
let select = document.querySelectorAll(".head1");
console.log(select);


// DOM Properties
