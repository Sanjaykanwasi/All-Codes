const http = require("http");
const fs = require("fs");

const port = process.env.PORT || 2000;

const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader("Content-Type", "text/html");

  if (req.url == "/") {
    res.end(
      "<h1>Welcome to Local Host</h1> <p> This is a test http server created for Education purpose </p>"
    );
  } else if (req.url == "/about") {
    res.end(
      "<h1>Welcome to About Section</h1> <p> This is a test http server created for Education purpose </p>"
    );
  } else if (req.url == "/help") {
    res.end(
      "<h1>Welcome to Help Section</h1> <p> This is a test http server created for Education purpose </p>"
    );
  } else if (req.url == "/sanjay") {
    const data = fs.readFileSync("index.html");
    res.end(data.toString());
  } else {
    res.statusCode = 404;
    res.end("<h1>Page Not Found</h2>");
  }
});

server.listen(port, () => {
  console.log(`Server is listening on port ${port}`);
});
