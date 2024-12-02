import blogFetch from "../axios/config";

import { useState, useEffect } from "react";

import { Link } from "react-router-dom";

import "./Home.css";

const Home = () => {
  const [posts, setPosts] = useState([]);

  const getPosts = async () => {
    try {
      const response = await blogFetch.get("/residents");

      const data = response.data;

      setPosts(data);
    } catch (error) {
      console.log(error);
    }
  };

  useEffect(() => {
    getPosts();
  }, []);

  return (
    <div className="home">
      <h1>Moradores</h1>
      {posts.length === 0 ? (
        <p>Carregando...</p>
      ) : (
        posts.map((post) => (
          <div className="post" key={post.id}>
            <h2>{post.residentName}</h2>
            <p>{post.email}</p>
          </div>
        ))
      )}
    </div>
  );
};

export default Home;
