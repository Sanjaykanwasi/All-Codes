import React from "react";
import Script from "next/script";

const Help = () => {
  return (
    <div>
      <Script>
        {`
      alert("Hello from help page");`}
      </Script>
      I am Help
    </div>
  );
};

export default Help;

export const metadata = {
  title: "Next App - Help",
  description: "Generated by create next app",
};
