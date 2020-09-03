package br.com.caelum.leilao.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Avaliador {
    private double maiorQueTodos = Double.NEGATIVE_INFINITY;
    private double menorQueTodos = Double.POSITIVE_INFINITY;
    private List<Lance> maiores;
    public void avalia(Leilao ll){

        if (ll.getLances().size() ==0){
            throw new RuntimeException("Nao é possivel avaliar um leilao sem lances!");
        }

        for (Lance lance: ll.getLances()) {
            if (lance.getValor() > maiorQueTodos) maiorQueTodos = lance.getValor();
            if(lance.getValor()<menorQueTodos) menorQueTodos = lance.getValor();
        }
        maiores = new ArrayList<Lance>(ll.getLances());
        Collections.sort(maiores, new Comparator<Lance>() {
            @Override
            public int compare(Lance o1, Lance o2) {
                if (o1.getValor() < o2.getValor()) return 1;
                if(o1.getValor() > o2.getValor()) return -1;
                return 0;
            }
        });
        maiores = maiores.subList(0,maiores.size() > 3 ? 3: maiores.size());
    }

    public List<Lance> getTresMaiores() {
        return maiores;
    }

    public double getMaiorQueLance() {
        return maiorQueTodos;
    }

    public double getMenorQueTodos() {
        return menorQueTodos;
    }
}
