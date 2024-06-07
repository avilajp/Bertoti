import { useParams, useNavigate } from "react-router-dom";
import { useState, useEffect } from "react";
import carroFetch from "../axios/config";
import './CarroDetalhe.css';

const CarroDetalhe = () => {
  const { id } = useParams();
  const navigate = useNavigate();
  const [carro, setCarro] = useState(null);
  const [isEditing, setIsEditing] = useState(false);
  const [modelo, setModelo] = useState("");
  const [marca, setMarca] = useState("");
  const [preco, setPreco] = useState("");

  const getCarro = async () => {
    try {
      const response = await carroFetch.get(`/Carros/${id}`);
      const data = response.data;
      setCarro(data);
      setModelo(data.modelo);
      setMarca(data.marca);
      setPreco(data.preco);
    } catch (error) {
      console.error(error);
    }
  };

  useEffect(() => {
    getCarro();
  }, [id]);

  const handleEdit = () => {
    setIsEditing(true);
  };

  const handleUpdate = async (e) => {
    e.preventDefault();
    const updatedCarro = { modelo, marca, preco: parseInt(preco, 10) };

    try {
      await carroFetch.put(`/Carros/${id}`, updatedCarro);
      alert('Carro atualizado com sucesso.');
      setCarro(updatedCarro);
      setIsEditing(false);
    } catch (error) {
      console.error('Erro ao atualizar carro:', error);
    }
  };

  if (!carro) {
    return <p>Carregando...</p>;
  }

  return (
    <div className="carro-detalhe">
      {isEditing ? (
        <form onSubmit={handleUpdate}>
          <div className="form-control">
            <label htmlFor="modelo">Modelo do carro</label>
            <input
              type="text"
              name="modelo"
              id="modelo"
              value={modelo}
              onChange={(e) => setModelo(e.target.value)}
            />
          </div>
          <div className="form-control">
            <label htmlFor="marca">Marca</label>
            <input
              type="text"
              name="marca"
              id="marca"
              value={marca}
              onChange={(e) => setMarca(e.target.value)}
            />
          </div>
          <div className="form-control">
            <label htmlFor="preco">Preço</label>
            <input
              type="number"
              name="preco"
              id="preco"
              value={preco}
              onChange={(e) => setPreco(e.target.value)}
            />
          </div>
          <button type="submit" className="btn">Atualizar Carro</button>
        </form>
      ) : (
        <>
          <h1>{carro.modelo}</h1>
          <p>Marca: {carro.marca}</p>
          <p>Preço: R$ {carro.preco}</p>
          <button className="btn" onClick={handleEdit}>
            Editar
          </button>
        </>
      )}
    </div>
  );
};

export default CarroDetalhe;
