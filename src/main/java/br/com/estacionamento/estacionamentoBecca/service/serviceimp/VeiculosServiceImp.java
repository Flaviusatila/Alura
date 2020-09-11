package br.com.estacionamento.estacionamentoBecca.service.serviceimp;

import br.com.estacionamento.estacionamentoBecca.model.Veiculo;
import br.com.estacionamento.estacionamentoBecca.repository.VeiculoRepository;
import br.com.estacionamento.estacionamentoBecca.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculosServiceImp implements VeiculosService {

    @Autowired
    VeiculoRepository veiculoRepository;

    @Override
    public List<Veiculo> findAll() {
        return veiculoRepository.findAll();
    }

    @Override
    public Optional<Veiculo> findOne(String placa) {
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca( placa );
        return veiculoRepository.findOne( Example.of( veiculo )  );
    }


    @Override
    public Veiculo findById(long id) {
        return veiculoRepository.findById(id).get();
    }

    @Override
    public Veiculo save(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

}
