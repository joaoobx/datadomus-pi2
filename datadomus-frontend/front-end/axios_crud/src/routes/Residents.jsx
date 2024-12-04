import blogFetch from "../axios/config";

import { useState, useEffect } from "react";

import { Link } from "react-router-dom";

import "./Home.css";

const Residents = () => {
  const [user, setUser] = useState([]);

  const getPosts = async () => {
    try {
      const response = await blogFetch.get("/residents");

      const data = response.data;

      setUser(data);
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
        <b>Cadastro de Moradores </b>
        <br />
        <br />
      </h1>
      {user.length === 0 ? (
        <p>Carregando...</p>
      ) : (
        user.map((user) => (
          <div className="post" key={user.id}>
            <h2>{user.residentName}</h2>
            <p>
              <b>Apto. Nº:</b>&nbsp; {user.apartmentNumber}
              &nbsp;&nbsp;<b> E-mail:</b>&nbsp;{user.email}
              <br />
              <b>Telefone 1:</b>&nbsp;
              {user.telephone1}
              <b>&nbsp;&nbsp;&nbsp;&nbsp;Telefone 2:</b>&nbsp;{user.telephone2}
              <br />
              <b>Observações:</b>&nbsp;
              {user.observations}
            </p>
          </div>
        ))
      )}
    </div>
  );
};

export default Residents;
