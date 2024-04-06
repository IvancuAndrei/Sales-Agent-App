import React from "react";
import { useState } from "react";
import "./LoginSignup.css";

import user_icon from "./components/user.jpg";
import password_icon from "./components/password.jpg";

const LoginSignup = () => {
  const [action, setAction] = useState("Sign up");

  return (
    <form>
      <div className="header">
        <div className="text">Sign Up / Log In</div>
      </div>

      <div className="inputs">
        <div className="usernameInput input">
          <img className="userImg" src={user_icon}></img>
          <input type="text" placeholder="Enter username"></input>
        </div>

        <div className="passwordInput input">
          <img className="passwordImg" src={password_icon}></img>
          <input type="password" placeholder="Enter password"></input>
        </div>
      </div>

      <div className="signInBtn">
        <input
          type="submit"
          value="Sign In"
          onClick={() => setAction("Log In")}
        ></input>
        <input type="submit" value="Log In"></input>
      </div>
    </form>
  );
};

export default LoginSignup;
