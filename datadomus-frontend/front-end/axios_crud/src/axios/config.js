import axios from "axios";

const blogFetch = axios.create({
  baseURL: "https://datadomus-pi2.onrender.com",
  headers: {
    "Content-Type": "application/json",
  },
});

export default blogFetch;
