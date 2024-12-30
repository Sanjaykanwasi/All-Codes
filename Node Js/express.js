const express = require("express");
const app = express();
const port = 9000;

app.get("/", (req, res) => {
  res.send("Hello Sanjay! Welcome to Home Page");
});

app.get("/about", (req, res) => {
  res.send("Hello Sanjay! Welcome to About Page");
});

app.get("/contact", (req, res) => {
  res.send("Hello Sanjay! Welcome to Contact Page");
});

app.get("/help", (req, res) => {
  res.send("Hello Sanjay! Welcome to Help Page");
});

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});
