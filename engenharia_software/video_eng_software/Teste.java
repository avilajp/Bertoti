package video_eng_software;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Teste {

	@Test
	public void test() {

		Estacionamento estacionamento = new Estacionamento();
		
		assertEquals(estacionamento.getCarros().size(), 0);
		
		estacionamento.cadastrarCarro(new Carro("ABC111", new Especificacao("vw", "variant", "azul")));
		estacionamento.cadastrarCarro(new Carro("ABC222", new Especificacao("fiat", "uno", "amarelo")));
		
		assertEquals(estacionamento.getCarros().size(), 2);
		
		Carro carroEncontrado = estacionamento.buscarCarroPorPlaca("ABC222");
	
		assertEquals(carroEncontrado.getEspec().getModelo(), "uno");
		
		List<Carro> carrosEncontrados = estacionamento.buscarCarroPorEspecificacao(new Especificacao("vw", "variant", "azul"));
		
		assertEquals(carrosEncontrados.get(0).getEspec().getModelo(), "variant");
		
	}

}
