package video_eng_software;
import java.util.List;
import java.util.LinkedList;

public class Estacionamento {
	private List<Carro> carros = new LinkedList<Carro>();
	
	public void cadastrarCarro(Carro carro) {
		carros.add(carro);
	}
	public List<Carro> buscarCarroPorEspecificacao(Especificacao espec){
		List<Carro> carrosEncontrados = new LinkedList<Carro>();
		for(Carro carro:carros) {
			if(carro.getEspec().comparar(espec)) carrosEncontrados.add(carro);
		}
		return carrosEncontrados;
	}
	
	public Carro buscarCarroPorPlaca(String placa) {
		for(Carro carro:carros) {
			if(carro.getPlaca().equals(placa)) {
				return carro;
			}
		}
		return null;
	}
	
	public List<Carro> getCarros(){
		return this.carros;
	}
}
