const express = require("express");
const path = require("path");
const blogs = require("../data/blogs");

const router = express.Router();

router.get("/", (req, res) => {
  //   res.sendFile(path.join(__dirname, "../templates/index.html"));
  res.render("home");
});

router.get("/blogs", (req, res) => {
  //   blogs.forEach((element) => {
  //     console.log(element.title);
  //   });
  res.sendFile(path.join(__dirname, "../templates/blogHome.html"));
});

router.get("/blogpost/:Slug", (req, res) => {
  myBlog = blogs.filter((e) => {
    return (e.Slug = req.params.Slug);
  });
  console.log(myBlog);
  res.sendFile(path.join(__dirname, "../templates/blogPage.html"));
});

module.exports = router;
