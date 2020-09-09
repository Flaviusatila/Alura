package Service.ServiceImplement;

import Entity.VeiculoEntity;
import Repository.VeiculoRepository;
import Service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoServiceImplement implements VeiculoService {

    @Autowired
    VeiculoRepository veiculoRepository;

    @Override
    public List<VeiculoEntity> findAll() {
        return veiculoRepository.findAll();
    }

    @Override
    public VeiculoEntity findById(long id) {
        return veiculoRepository.findById(id).get();
    }

    @Override
    public VeiculoEntity save(VeiculoEntity veiculos) {
        return veiculoRepository.save(veiculos);
    }
}
