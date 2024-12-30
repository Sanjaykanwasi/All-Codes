const http = require("http");

const port = process.env.PORT || 2000;

const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader("Content-Type", "text/html");
  res.end(
    "<h1>Welcome to Local Host</h1> <p> This is a test http server created for Education purpose </p>"
  );
});

server.listen(port, () => {
  console.log(`Server is listening on port ${port}`);
});
