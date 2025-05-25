import Link from "next/link";

export default function NotFound() {
  return (
    <div>
      <h2>Not Found</h2>
      <p>Could not found requested resource</p>
      <Link href={"/"}>return home</Link>
    </div>
  );
}
