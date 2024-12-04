import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./index.css";
import App from "./App.jsx";

import { createBrowserRouter, RouterProvider } from "react-router-dom";

//paginas
import Home from "./routes/Home.jsx";
import NewPost from "./routes/NewPost.jsx";
import Residents from "./routes/Residents.jsx";
import Warnings from "./routes/Warnings.jsx";
import Reservations from "./routes/Reservations.jsx";

const router = createBrowserRouter([
  {
    element: <App />,
    children: [
      {
        path: "/",
        element: <Home />,
      },
      {
        path: "/new",
        element: <NewPost />,
      },

      {
        path: "/residents",
        element: <Residents />,
      },
      {
        path: "/warnings",
        element: <Warnings />,
      },
      {
        path: "/reservations",
        element: <Reservations />,
      },
    ],
  },
]);

createRoot(document.getElementById("root")).render(
  <StrictMode>
    <RouterProvider router={router} />
  </StrictMode>
);
