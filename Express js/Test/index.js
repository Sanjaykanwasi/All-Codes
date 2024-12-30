const express = require("express");
const path = require("path");
const app = express();
const port = 6969;

app.get("/", (req, res) => {
  res.sendFile(path.join(__dirname, "index.html"));
});

app.get("/about/:name", (req, res) => {
  res.send("Hello Sanjay " + req.params.name);
});

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});
