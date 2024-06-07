import { useState } from "react";
import carroFetch from "../axios/config";
import "./NewPost.css";

const NewPost = () => {
  const [modelo, setModelo] = useState("");
  const [marca, setMarca] = useState("");
  const [preco, setPreco] = useState("");

  const createCarro = async (e) => {
    e.preventDefault();

    const carro = { modelo, marca, preco: parseInt(preco, 10) };

    try {
      await carroFetch.post("/Carros", carro);

      alert('Carro adicionado com sucesso.');
      setModelo("");
      setMarca("");
      setPreco("");
    } catch (error) {
      console.error('Erro ao adicionar carro:', error);
    }
  };

  return (
    <div className="new-movie">
      <h1>Adicionar Carro</h1>
      <form onSubmit={createCarro}>
        <div className="form-control">
          <label htmlFor="modelo">Modelo do carro</label>
          <input
            type="text"
            name="modelo"
            id="modelo"
            placeholder="Digite o modelo do carro"
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
            placeholder="Digite a marca do carro"
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
            placeholder="Digite o preço do carro"
            value={preco}
            onChange={(e) => setPreco(e.target.value)}
          />
        </div>
        <button type="submit" className="btn">Inserir Carro</button>
      </form>
    </div>
  );
};

export default NewPost;
