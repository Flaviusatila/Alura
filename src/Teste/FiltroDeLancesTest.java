package Teste;

import br.com.caelum.leilao.dominio.FiltroDeLances;
import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Usuario;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FiltroDeLancesTest {

    @Test
    public void deveSelecionarLancesEntre1000e3000(){
        Usuario jao = new Usuario("Jao");

        FiltroDeLances filtro = new FiltroDeLances();

        List<Lance> resultado = filtro.filtra(Arrays.asList(
                new Lance(jao,2000),
                new Lance(jao,1000),
                new Lance(jao,3000),
                new Lance(jao,800)
        ));
        assertEquals(1,resultado.size());
        assertEquals(2000,resultado.get(0).getValor(),0.00001);
    }
    @Test
    public void deveSelecionarLancesEntre500e700(){
        Usuario jao = new Usuario("Jao");

        FiltroDeLances filtro = new FiltroDeLances();

        List<Lance> resultado = filtro.filtra(Arrays.asList(
                new Lance(jao,700),
                new Lance(jao,600),
                new Lance(jao,500),
                new Lance(jao,800)
        ));
        assertEquals(1,resultado.size());
        assertEquals(600,resultado.get(0).getValor(),0.00001);
    }
    @Test
    public void deveSelecionarLancesMaior5000(){
        Usuario jao = new Usuario("Jao");

        FiltroDeLances filtro = new FiltroDeLances();

        List<Lance> resultado = filtro.filtra(Arrays.asList(
                new Lance(jao,700),
                new Lance(jao,5500),
                new Lance(jao,5000),
                new Lance(jao,800)
        ));
        assertEquals(1,resultado.size());
        assertEquals(5500,resultado.get(0).getValor(),0.00001);
    }

}