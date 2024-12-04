import blogFetch from "../axios/config";

import { useState, useEffect } from "react";

import { Link } from "react-router-dom";

import "./Home.css";

const Reservations = () => {
  const [reservation, setReservation] = useState([]);

  const getPosts = async () => {
    try {
      const response = await blogFetch.get("/reservations");

      const data = response.data;

      setReservation(data);
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
        <b>Reservas de Espaços </b>
        <br />
        <br />
      </h1>
      {reservation.length === 0 ? (
        <p>Carregando...</p>
      ) : (
        reservation.map((reservation) => (
          <div className="post" key={reservation.id}>
            <h2>{reservation.title}</h2>
            <p>
              <b>Responsável:</b>&nbsp; {reservation.residentName}
              &nbsp;&nbsp;<b> Data do Evento:</b>&nbsp;{reservation.eventDate}
              <br />
              <b>Horário de Início:</b>&nbsp;
              {reservation.startTime}
              <b>&nbsp;&nbsp;&nbsp;&nbsp;Horário do Término:</b>&nbsp;
              {reservation.endTime}
              <br />
              <b>Local Reservado:</b>
              &nbsp;
              {reservation.place}
              <br />
              <b>Observações:</b>&nbsp;
              {reservation.observations}
            </p>
          </div>
        ))
      )}
    </div>
  );
};

export default Reservations;
