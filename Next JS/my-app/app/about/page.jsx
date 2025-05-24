"use client";
import React, { useState } from "react";

const page = () => {
  const [count, setCount] = useState(0);
  const increment = () => {
    setCount(count + 1);
  };

  return (
    <div>
      I am about {count}
      <div>
        <div
          onClick={increment}
          className="bg-red-300 rounded-2xl px-5 w-fit cursor-pointer ml-10 mt-10"
        >
          increment
        </div>
      </div>
    </div>
  );
};

export default page;
