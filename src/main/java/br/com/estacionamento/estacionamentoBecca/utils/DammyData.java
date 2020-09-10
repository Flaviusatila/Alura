package br.com.estacionamento.estacionamentoBecca.utils;

import br.com.estacionamento.estacionamentoBecca.model.Estacionamento;
import br.com.estacionamento.estacionamentoBecca.model.Veiculo;
import br.com.estacionamento.estacionamentoBecca.repository.EstacionamentoRepository;
import br.com.estacionamento.estacionamentoBecca.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class DammyData {

    @Autowired
    VeiculoRepository veiculoRepository;

    @Autowired
    EstacionamentoRepository estacionamentoRepository;

//    @PostConstruct
    public void saveVeiculos() {
        List<Veiculo> veiculosList = new ArrayList<>();
        Veiculo v1 = new Veiculo();

        v1.setPlaca("GTA-555");
        v1.setModelo("Vectra");
        v1.setMarca("Ford");
        v1.setHoraEntrada(LocalDateTime.now());

        Veiculo v2 = new Veiculo();

        v2.setPlaca("GSD-775");
        v2.setModelo("Focus");
        v2.setMarca("Ford");
        v2.setHoraEntrada(LocalDateTime.now());

        veiculosList.add(v1);
        veiculosList.add(v2);

        for (Veiculo veiculo : veiculosList) {
            Veiculo veiculoSave = veiculoRepository.save(veiculo);
            System.out.println(veiculoSave.getPlaca());
        }
    }
//     //@PostConstruct
//    public void saveEstacionamento() {
//        List<Estacionamento> estacionamentoList = new ArrayList<>();
//         Estacionamento e1 = new Estacionamento();
//
//        e1.setTotalFaturamento( ( long ) 5000.0 );
//        e1.setTotalFaturamentoMoto( ( long ) 500.0 );
//        e1.setTotalFaturamentoCarro( ( long ) 700.0 );
//        e1.setTotalFaturamentoUtilitario( ( long ) 800.0 );
//
//         Estacionamento e2 = new Estacionamento();
//
//         e2.setTotalFaturamento( ( long ) 2000.0 );
//         e2.setTotalFaturamentoMoto( ( long ) 400.0 );
//         e2.setTotalFaturamentoCarro( ( long ) 600.0 );
//         e2.setTotalFaturamentoUtilitario( ( long ) 900.0 );
//
//        for (Estacionamento estacionamento : estacionamentoList) {
//            Estacionamento estacionamentoSave = estacionamentoRepository.save(estacionamento);
//            System.out.println(estacionamentoSave.);
//        }
//    }

}
