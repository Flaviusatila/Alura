package Teste;

import br.com.caelum.leilao.dominio.MatematicaMaluca;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaMalucaTest {

    @Test
    public void deveMultiplicarNumerosMaioresQue30() {
        MatematicaMaluca matemati = new MatematicaMaluca();
        assertEquals(50*4,matemati.contaMaluca(50));
    }

    @Test
    public void deveMultiplicarNumerosMaioresQue10() {
        MatematicaMaluca matemati = new MatematicaMaluca();
        assertEquals(20*3,matemati.contaMaluca(20));
    }

    @Test
    public void deveMultiplicarNumerosMenoresQue10() {
        MatematicaMaluca matemati = new MatematicaMaluca();
        assertEquals(5*2,matemati.contaMaluca(5));
    }

}