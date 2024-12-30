const fs = require("fs");

fs.readFile("file1.txt", "utf8", (err, data) => {
  console.log(err, data);
});

fs.writeFile("file2.txt", "This is second file", () => {
  console.log("File created");
});
