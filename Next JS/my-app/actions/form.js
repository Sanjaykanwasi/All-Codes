"use server";
import fs from "fs/promises";

export const submitAction = async (e) => {
  console.log(e.get("name"));
  console.log(e.get("add"));
  let a = await fs.writeFile(
    "Sanjay.txt",
    `Name is ${e.get("name")} and Address is ${e.get("add")}`
  );
};
