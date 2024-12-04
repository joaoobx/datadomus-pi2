import blogFetch from "../axios/config";

import { useState, useEffect } from "react";

import "./Home.css";
import { data } from "react-router-dom";

const Warnings = () => {
  const [warning, setWarning] = useState([]);

  const getPosts = async () => {
    try {
      const response = await blogFetch.get("/warnings");

      const data = response.data;

      setWarning(data);
    } catch (error) {
      console.log(error);
    }
  };

  useEffect(() => {
    getPosts();
  }, []);

  return (
    <div className="home">
      <h1>
        <br />
        <br />
        <b>Avisos </b>
        <br />
        <br />
      </h1>
      {warning.length === 0 ? (
        <p>Carregando...</p>
      ) : (
        warning.map((warning) => (
          <div className="post" key={warning.id}>
            <h2>{warning.title}</h2>
            <p>
              <b>Data:</b>&nbsp; {warning.expirationDate}
              <br />
              <b>Disclaimer:</b>&nbsp;
              {warning.warningText}
            </p>
          </div>
        ))
      )}
    </div>
  );
};

export default Warnings;
