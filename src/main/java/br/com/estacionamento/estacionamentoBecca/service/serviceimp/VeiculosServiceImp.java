package br.com.estacionamento.estacionamentoBecca.service.serviceimp;

import br.com.estacionamento.estacionamentoBecca.model.Veiculo;
import br.com.estacionamento.estacionamentoBecca.repository.VeiculoRepository;
import br.com.estacionamento.estacionamentoBecca.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculosServiceImp implements VeiculosService {

    @Autowired
    VeiculoRepository veiculoRepository;

    @Override
    public List<Veiculo> findAll() {
        return veiculoRepository.findAll();
    }

    @Override
    public Veiculo findById(long id) {
        return veiculoRepository.findById(id).get();
    }

    @Override
    public Veiculo save(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    @Override
    public Veiculo findByPlaca(String placa) {
        return null;
    }
}
