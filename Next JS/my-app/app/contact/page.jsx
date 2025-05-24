"use client";
import { submitAction } from "@/actions/form";
import { useRef } from "react";

const page = () => {
  console.log("Contact page loaded");
  let ref = useRef();
  return (
    <div className="p-10">
      I am contact
      {/* Form */}
      <div className="container mx-auto flex mt-10 p-10 w-fit border-2 border-slate-500 rounded-3xl border-dashed hover:border-purple-800">
        <form
          ref={ref}
          action={(e) => {
            submitAction(e);
            ref.current.reset();
          }}
        >
          <div className="mb-4">
            <label className="p-2" htmlFor="name">
              Name
            </label>
            <input
              id="name"
              name="name"
              className="text-white bg-slate-600 rounded-2xl p-1"
              type="text"
            />
          </div>
          <div className="">
            <label className="p-2" htmlFor="add">
              Address
            </label>
            <input
              id="add"
              name="add"
              className="text-white rounded-2xl p-1 bg-slate-700"
              type="text"
            />
          </div>
          <div className="flex justify-center">
            <button className="bg-green-600 text-center rounded-3xl p-1 mt-5 px-5">
              Submit
            </button>
          </div>
        </form>
      </div>
    </div>
  );
};

export default page;
