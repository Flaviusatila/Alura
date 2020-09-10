package br.com.estacionamento.estacionamentoBecca.utils;

import br.com.estacionamento.estacionamentoBecca.model.Veiculo;
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

}
