// ContratacaoTest.java
package AnaliseDeValorLimite;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContratacaoTest {

    @Test
    public void testContratacao() {
        Contratacao contratacao = new Contratacao();

        assertEquals("Não contrata", contratacao.contratacao(0));

        assertEquals("Não contrata", contratacao.contratacao(15));

        assertEquals("Contrata como aprendiz", contratacao.contratacao(16));

        assertEquals("Contrata como aprendiz", contratacao.contratacao(17));

        assertEquals("Contrata como CLT", contratacao.contratacao(18));

        assertEquals("Contrata como CLT", contratacao.contratacao(100));

        assertEquals("Idade inválida", contratacao.contratacao(110));
    }
}
