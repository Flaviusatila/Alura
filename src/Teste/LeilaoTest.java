package Teste;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import com.sun.org.apache.bcel.internal.generic.LNEG;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeilaoTest {

    @Test
    public void naoDeveAceitarDoisLancesSeuidosDoMesmoUsuario(){
        Leilao leilao = new Leilao("Macbook Pro 15");
        Usuario steveJobs = new Usuario("Steve Jobs");

        leilao.propoe(new Lance(steveJobs, 2000));
        leilao.propoe(new Lance(steveJobs,3000));

        assertEquals(1, leilao.getLances().size());
        assertEquals(2000, leilao.getLances().get(0).getValor(), 0.00001);
    }

    @Test
    public void naoDeveAceitarMaisDoQue5LancesDeUmMesmoUsuario(){
        Leilao leilao     = new Leilao("Macbook Pro 15");
        Usuario steveJobs = new Usuario("Steve Jobs");
        Usuario billGates = new Usuario("Bill Gates");

        leilao.propoe(new Lance(steveJobs, 2000));
        leilao.propoe(new Lance(billGates, 3000));
        leilao.propoe(new Lance(steveJobs, 4000));
        leilao.propoe(new Lance(billGates, 5000));
        leilao.propoe(new Lance(steveJobs, 6000));
        leilao.propoe(new Lance(billGates, 7000));
        leilao.propoe(new Lance(steveJobs, 8000));
        leilao.propoe(new Lance(billGates, 9000));
        leilao.propoe(new Lance(steveJobs, 900));
        leilao.propoe(new Lance(billGates, 1100));
        leilao.propoe(new Lance(steveJobs, 12000));

        assertEquals(10, leilao.getLances().size());
        int ultimo = leilao.getLances().size()-1;
        assertEquals(1100, leilao.getLances().get(ultimo).getValor(), 0.00001);
    }

    @Test
    public void deveDobrarOUtilmoValorDado(){
        Leilao leilao = new Leilao("MacbookPro 15");
        Usuario steveJobs = new Usuario("Steve jobs");
        Usuario billGates = new Usuario("BillGates");

        leilao.propoe(new Lance(steveJobs, 2000));
        leilao.propoe(new Lance(billGates,3000));
        leilao.dobraLance(steveJobs);

        assertEquals(4000,leilao.getLances().get(2).getValor(), 0.00001);
    }

    @Test
    public void naoDeveDrobrarCasosNaoHajaLanceAnterior(){
        Leilao leilao = new Leilao("Qualquer coisa mesmo");
        Usuario u1 = new Usuario("Tanto faz");

//        leilao.propoe(new Lance(u1, 2000));
        leilao.dobraLance(u1);

        assertEquals(0, leilao.getLances().size());
    }
}