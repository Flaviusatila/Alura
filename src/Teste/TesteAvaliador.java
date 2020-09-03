package Teste;

import Build.CriadorDeLeilao;
import br.com.caelum.leilao.dominio.Avaliador;
import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteAvaliador {

    private Avaliador leiloeiro;
    private Usuario u3;
    private Usuario u2;
    private Usuario u1;

    public void criaAvaliador(){
       this.leiloeiro = new Avaliador();
        System.out.println("Cria Avaliador");
        this.u1 = new Usuario("Jão");
        System.out.println("CriaUsuariao U1");
        this.u2 = new Usuario("Jose");
        System.out.println("CriaUsuariao U2");
        this.u3 = new Usuario("Maria");
        System.out.println("CriaUsuariao U3");
    }

    @Test
    public void deveEntenderLancesEmitidos() {
        criaAvaliador();

        Leilao leilao = new CriadorDeLeilao().para("Playstion 3 Novo")
                .lance(u1,100.0)
                .lance(u2,200.0)
                .lance(u3,300.0)
                .lance(u2,400.0)
                .constroi();
//        leilao.propoe(new Lance(u1,250.0));
//        leilao.propoe(new Lance(u2,400.0));
//        leilao.propoe(new Lance(u3,500.0));

        leiloeiro.avalia(leilao);


        double maiorQUe = 400;
        double menorQue = 100;

//        System.out.println(maiorQUe == leiloeiro.getMaiorQueLance());
        assertEquals(maiorQUe, leiloeiro.getMaiorQueLance(),0.000001);
        assertEquals(menorQue, leiloeiro.getMenorQueTodos(),0.000001);
//        System.out.println(menorQue == leiloeiro.getMenorQueTodos());
    }

    @Test
    public void deveEntederSomenteUmLance(){
        Leilao leilao = new CriadorDeLeilao().para("Playstion 3 Novo")
                .lance(u1,1000.0).constroi();

        criaAvaliador();



        leiloeiro.avalia(leilao);

        assertEquals(1000.0, leiloeiro.getMaiorQueLance(), 0.00001);
        assertEquals(1000.0, leiloeiro.getMenorQueTodos(), 0.00001);
    }

    @Test
    public void deveEncontrarOstresmaiores(){
        criaAvaliador();

        Leilao leilao = new CriadorDeLeilao().para("Playstion 3 Novo")
                .lance(u1,100.0)
                .lance(u2,500.0)
                .lance(u3,600.0)
                .lance(u2,400.0)
                .constroi();

        leiloeiro.avalia(leilao);

        List<Lance> maiores = leiloeiro.getTresMaiores();
        assertEquals(3,maiores.size());
        assertEquals(600.0, maiores.get(0).getValor(), 0.00001);
        assertEquals(500.0, maiores.get(1).getValor(), 0.00001);
        assertEquals(400.0, maiores.get(2).getValor(), 0.00001);
    }

    @Test
    public void naoDeveAvaliarLeiloesSemNenhumLanceDado(){
       try {
           criaAvaliador();
           Leilao leilao = new CriadorDeLeilao().para("Qualquer Coisa").constroi();
           leiloeiro.avalia(leilao);
           Assert.fail(); // Deu errado
       }catch (RuntimeException e){
//            Deu certo
       }
    }
}
