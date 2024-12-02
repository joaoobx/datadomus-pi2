import { Link } from "react-router-dom";
//import React from "react";

import "./Navbar.css";

const Navbar = () => {
  return (
    <nav className="navbar">
      <h2>
        <Link to={"/"}></Link>
      </h2>
      <ul>
        <li>
          <Link to={"/"}>Home</Link>
        </li>
        <li>
          <Link to={"/new"} className="new-btn">
            Login
          </Link>
        </li>
      </ul>
    </nav>
  );
};

export default Navbar;
