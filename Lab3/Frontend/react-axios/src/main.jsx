import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App.jsx';
import { createBrowserRouter, RouterProvider } from 'react-router-dom';

// páginas
import Home from './routes/Home.jsx';
import NewPost from './routes/NewPost.jsx';
import Delete from './routes/Delete.jsx';
import CarroDetalhe from './routes/CarroDetalhe.jsx';

import './index.css';

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
        path: "/delete",
        element: <Delete />,
      },
      {
        path: "/Carro/:id",
        element: <CarroDetalhe />,
      },
    ],
  },
]);

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>,
);
