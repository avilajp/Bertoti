package test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Teste {
    @Test
    public void test() {
        Especificacao esp1 = new Especificacao("Toyota", "Supra", "Preto");
        Especificacao esp2 = new Especificacao("Toyota", "Supra", "Preto");

        // 2. Chame o método comparar() para comparar duas instâncias de Especificacao
        boolean saoIguais = esp1.comparar(esp2);

        // 3. Use o método assertEquals para verificar se o resultado é verdadeiro (iguais)
        assertEquals(true, saoIguais);

    }

    public static void main(String[] args) {

        Especificacao most = new Especificacao("Toyota", "Supra", "Preto");
        most.mostrar();
    }
}
