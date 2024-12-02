import blogFetch from "../axios/config";
import { useState } from "react";
import { useNavigate } from "react-router-dom";

import "./NewPost.css";
import React from "react";

const NewPost = () => {
  const navigate = useNavigate();
  const [title, setTitle] = useState();
  const [body, serBody] = useState();

  const createPost = async (e) => {
    e.preventDefault();

    const post = { title, body, userid: 1 };

    await blogFetch.post("/resident/create/", {
      body: post,
    });
    navigate("/");
  };
  return (
    <div className="new-post">
      <h2>Cadastrar Morador</h2>
      <form onSubmit={(e) => createPost(e)}>
        <div className="form-control">
          <label htmlFor="title">Título</label>
          <input
            type="text"
            name="title"
            id="title"
            placeholder="Digite o título do post"
            onChange={(e) => setTitle(e.target.value)}
          />
        </div>
        <div className="form-control">
          <label htmlFor="body">Conteúdo</label>
          <textarea
            name="body"
            id="body"
            placeholder="Digite o Post"
            onChange={(e) => setBody(e.target.value)}
          />
        </div>
        <input type="submit" value="Salvar" className="btn" />
      </form>
    </div>
  );
};

export default NewPost;
