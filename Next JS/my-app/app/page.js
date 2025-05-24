"use client";
import React from "react";

const page = () => {
  const handleClick = async () => {
    let data = {
      name: "John Doe",
      age: 30,
    };
    let a = await fetch("/api/add", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(data),
    });
    let res = await a.json();
    console.log(res);
  };

  return (
    <div>
      I am Home
      <h1 className="text-3xl">NEXT JS</h1>
      <button
        className="bg-red-500 rounded-3xl mt-5 ml-5 w-fit p-2"
        onClick={handleClick}
      >
        Click Me!
      </button>
    </div>
  );
};

export default page;
