"use client";
import Link from "next/link";

import { useSession, signIn, signOut } from "next-auth/react";

export default function Component() {
  const { data: session } = useSession();
  if (session) {
    return (
      <>
        Signed in as {session.user.email} <br />
        <button className="cursor-pointer" onClick={() => signOut()}>
          Sign out
        </button>
      </>
    );
  }
  return (
    <>
      Not signed in <br />
      <button className="cursor-pointer" onClick={() => signIn()}>
        Sign in
      </button>
      <div>
        <Link href="/blog">
          <button className="bg-green-800 p-4 rounded-2xl py-2 ml-10 mt-20 w-fit cursor-pointer">
            Blog
          </button>
        </Link>
      </div>
    </>
  );
}
