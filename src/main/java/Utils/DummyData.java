package Utils;

import Entity.VeiculoEntity;
import Repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    VeiculoRepository veiculoRepository;

    @PostConstruct
    public void saveVeiculo(){

        List<VeiculoEntity> veiculoEntityList = new ArrayList<>();
        VeiculoEntity veiculo1 = new VeiculoEntity();
        veiculo1.setPlaca("GTA-555");
        veiculo1.setModelo("GOL");
        veiculo1.setMarca("VW");
        veiculo1.setHoraEntrada(LocalDateTime.now());
        veiculo1.setHoraSaida(LocalDateTime.now());

        VeiculoEntity veiculo2 = new VeiculoEntity();
        veiculo2.setPlaca("GTA-555");
        veiculo2.setModelo("GOL");
        veiculo2.setMarca("VW");
        veiculo2.setHoraEntrada(LocalDateTime.now());
        veiculo2.setHoraSaida(LocalDateTime.now());

        veiculoEntityList.add(veiculo1);
        veiculoEntityList.add(veiculo2);

        for (VeiculoEntity veiculoEntity: veiculoEntityList){
            VeiculoEntity veiculoSaved = veiculoRepository.save(veiculoEntity);
            System.out.println(veiculoSaved.getPlaca());
        }
    }

}
